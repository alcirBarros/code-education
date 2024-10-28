package br.com.context;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.aws.messaging.core.MessageAttributeDataTypes;
import org.springframework.cloud.aws.messaging.core.QueueMessageChannel;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.core.SqsMessageHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageDeliveryException;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.core.DestinationResolver;
import org.springframework.messaging.support.MessageBuilder;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.only;


@SpringBootTest
class DsvServerlessDataProcessApplicationTests {

    @Autowired
    private AmazonSQSAsync amazonSQSAsync;

    @Test
    void contextLoads() {
        System.out.println("AAAAAAAa");
    }


    @Test
    void sendMessage_withExecutionExceptionWhileSendingAsyncMessage_throwMessageDeliveryException()
            throws Exception {
        // Arrange
        Future<SendMessageResult> future = mock(Future.class);
        when(future.get(1000, TimeUnit.MILLISECONDS)).thenThrow(new ExecutionException(new Exception()));
        AmazonSQSAsync amazonSqs = mock(AmazonSQSAsync.class);
        when(amazonSqs.sendMessageAsync(any(SendMessageRequest.class))).thenReturn(future);
        QueueMessageChannel queueMessageChannel = new QueueMessageChannel(amazonSqs, "http://testQueue");

        // Assert
        assertThatThrownBy(() -> queueMessageChannel.send(MessageBuilder.withPayload("Hello").build(), 1000)).isInstanceOf(MessageDeliveryException.class);
    }

//	@Test
//	void send_withCustomDestinationResolveAndDestination_usesDestination() {
//
//		QueueMessagingTemplate queueMessagingTemplate = new QueueMessagingTemplate(amazonSQSAsync,(DestinationResolver<String>) name -> name.toUpperCase(Locale.ENGLISH),	null);
//
//		Message<String> stringMessage = MessageBuilder.withPayload("message content").build();
//		queueMessagingTemplate.send("myqueue", stringMessage);
//
//		ArgumentCaptor<SendMessageRequest> sendMessageRequestArgumentCaptor = ArgumentCaptor.forClass(SendMessageRequest.class);
//		verify(amazonSQSAsync).sendMessage(sendMessageRequestArgumentCaptor.capture());
//		assertThat(sendMessageRequestArgumentCaptor.getValue().getQueueUrl()).isEqualTo("MYQUEUE");
//	}

//	@Test
//	void receiveMessage_withoutTimeout_returnsTextMessage() throws Exception {
//		// Arrange
//		AmazonSQSAsync amazonSqs = mock(AmazonSQSAsync.class);
//
//		when(amazonSqs.receiveMessage(new ReceiveMessageRequest("http://testQueue")
//				.withWaitTimeSeconds(0).withMaxNumberOfMessages(1)
//				.withMessageAttributeNames("All")))
//				.thenReturn(new ReceiveMessageResult().withMessages(Collections
//						.singleton(new com.amazonaws.services.sqs.model.Message()
//								.withBody("content"))));
//
//		PollableChannel messageChannel = new QueueMessageChannel(amazonSqs,"http://testQueue");
//
//		// Act
//		Message<?> receivedMessage = messageChannel.receive();
//
//		// Assert
//		assertThat(receivedMessage).isNotNull();
//		assertThat(receivedMessage.getPayload()).isEqualTo("content");
//	}


    @Test
    void sendMessage_withoutDelayHeader_shouldNotSetDelayOnSendMessageRequestAndNotSetHeaderAsMessageAttribute()
            throws Exception {
        // Arrange
        AmazonSQSAsync amazonSqs = mock(AmazonSQSAsync.class);

        ArgumentCaptor<SendMessageRequest> sendMessageRequestArgumentCaptor = ArgumentCaptor.forClass(SendMessageRequest.class);
        when(amazonSqs.sendMessage(sendMessageRequestArgumentCaptor.capture())).thenReturn(new SendMessageResult());

        QueueMessageChannel queueMessageChannel = new QueueMessageChannel(amazonSqs, "http://testQueue");
        Message<String> message = MessageBuilder.withPayload("Hello").build();

        // Act
        queueMessageChannel.send(message);

        // Assert
        SendMessageRequest sendMessageRequest = sendMessageRequestArgumentCaptor.getValue();
        assertThat(sendMessageRequest.getDelaySeconds()).isNull();
        assertThat(sendMessageRequest.getMessageAttributes().containsKey(SqsMessageHeaders.SQS_DELAY_HEADER)).isFalse();
    }


    @Test
    void sendMessage_validTextMessage_returnsTrue() throws Exception {
        // Arrange
        AmazonSQSAsync amazonSqs = mock(AmazonSQSAsync.class);
        ArgumentCaptor<SendMessageRequest> sendMessageRequestArgumentCaptor = ArgumentCaptor.forClass(SendMessageRequest.class);
        when(amazonSqs.sendMessage(sendMessageRequestArgumentCaptor.capture())).thenReturn(new SendMessageResult());

        Message<String> stringMessage = MessageBuilder.withPayload("message content").build();
        MessageChannel messageChannel = new QueueMessageChannel(amazonSqs, "http://testQueue");

        // Act
        boolean sent = messageChannel.send(stringMessage);

        // Assert
        verify(amazonSqs, only()).sendMessage(any(SendMessageRequest.class));
        assertThat(sendMessageRequestArgumentCaptor.getValue().getMessageBody()).isEqualTo("message content");
        assertThat(sent).isTrue();
    }

    @Test
    void receive_withoutDefaultDestination_throwsAnException() {
        QueueMessagingTemplate queueMessagingTemplate = new QueueMessagingTemplate(amazonSQSAsync);
        assertThatThrownBy(queueMessagingTemplate::receive).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void sendMessage_withBinaryMessageHeader_shouldBeSentAsBinaryMessageAttribute()
            throws Exception {
        // Arrange
        AmazonSQSAsync amazonSqs = mock(AmazonSQSAsync.class);
        QueueMessageChannel messageChannel = new QueueMessageChannel(amazonSqs,
                "http://testQueue");
        ByteBuffer headerValue = ByteBuffer.wrap("My binary data!".getBytes());
        String headerName = "MyHeader";
        Message<String> message = MessageBuilder.withPayload("Hello")
                .setHeader(headerName, headerValue).build();

        ArgumentCaptor<SendMessageRequest> sendMessageRequestArgumentCaptor = ArgumentCaptor
                .forClass(SendMessageRequest.class);
        when(amazonSqs.sendMessage(sendMessageRequestArgumentCaptor.capture()))
                .thenReturn(new SendMessageResult());

        // Act
        boolean sent = messageChannel.send(message);

        // Assert
        assertThat(sent).isTrue();
        assertThat(sendMessageRequestArgumentCaptor.getValue().getMessageAttributes()
                .get(headerName).getBinaryValue()).isEqualTo(headerValue);
        assertThat(sendMessageRequestArgumentCaptor.getValue().getMessageAttributes()
                .get(headerName).getDataType())
                .isEqualTo(MessageAttributeDataTypes.BINARY);
    }
}
