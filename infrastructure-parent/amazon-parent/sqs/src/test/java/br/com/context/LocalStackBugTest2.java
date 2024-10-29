package br.com.context;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;
import com.amazonaws.services.sqs.model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import javax.annotation.PreDestroy;
import java.io.IOException;
import java.util.List;

import static org.testcontainers.containers.localstack.LocalStackContainer.Service.SQS;

//@Testcontainers
@SpringBootTest
public class LocalStackBugTest2 {

    private static final String queueurl = "http://localhost:4566/000000000000/input-queue";

//    @Container
//    public static LocalStackContainer localstack = new LocalStackContainer(DockerImageName.parse("localstack/localstack:0.11.3"))
//            .withServices(SQS);
//
//
//    @BeforeAll
//    static void beforeAll() throws IOException, InterruptedException {
//        localstack.execInContainer("awslocal", "sqs", "create-queue", "--queue-name", QUEUE_NAME);
//    }
//
//    @DynamicPropertySource
//    static void setup(DynamicPropertyRegistry registry) {
//        registry.add("cloud.aws.region.static", localstack::getRegion);
//        registry.add("cloud.aws.sqs.endpoint", localstack.getEndpointConfiguration(LocalStackContainer.Service.SQS)::getServiceEndpoint);
//        registry.add("cloud.aws.credentials.access-key", localstack::getAccessKey);
//        registry.add("cloud.aws.credentials.secret-key", localstack::getSecretKey);
//    }
//
//    @TestConfiguration
//    static class AwsTestConfig {
//
//        @Bean
//        public AmazonSQSAsync amazonSQS() {
//            AWSCredentialsProvider defaultCredentialsProvider = localstack.getDefaultCredentialsProvider();
//            AwsClientBuilder.EndpointConfiguration endpointConfiguration = localstack.getEndpointConfiguration(SQS);
//            AmazonSQSAsyncClientBuilder amazonSQSAsyncClientBuilder = AmazonSQSAsyncClientBuilder.standard();
//            amazonSQSAsyncClientBuilder.withCredentials(defaultCredentialsProvider);
//            amazonSQSAsyncClientBuilder.withEndpointConfiguration(endpointConfiguration);
//            return amazonSQSAsyncClientBuilder.build();
//        }
//    }

    @Autowired
    AmazonSQSAsync amazonSQSAsync;


    @Test
    void contextLoads() throws InterruptedException {
        QueueMessagingTemplate template = new QueueMessagingTemplate(amazonSQSAsync);
        template.send(queueurl, MessageBuilder.withPayload("Hello World!").build());

//        Message<String> message = messages.poll(10, TimeUnit.SECONDS);
//        Assertions.assertThat(message.getPayload()).isEqualTo("Hello World!");

        System.out.println("");
    }

    @Test
    public void dendMessageResult() {
        SendMessageRequest sendMessageRequest = new SendMessageRequest(queueurl, "TEXTO");
        SendMessageResult sendMessageResult = amazonSQSAsync.sendMessage(sendMessageRequest);
        String sequenceNumber = sendMessageResult.getSequenceNumber();
        System.out.println(sequenceNumber);
    }



    void getQueuejurl() {

        ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest()
                .withQueueUrl(queueurl)
                .withWaitTimeSeconds(20)
                .withVisibilityTimeout(30)
                .withMaxNumberOfMessages(1);

//        Mono<ReceiveMessageResult> receiveMessageResponseMono = Mono.fromFuture(() ->
//                amazonSQSAsync.receiveMessage(receiveMessageRequest)
//        );
//
//        receiveMessageResponseMono
//                .repeat()
//                .retry()
//                .map(ReceiveMessageResponse::messages)
//                .map(Flux::fromIterable)
//                .flatMap(messageFlux -> messageFlux)
//                .subscribe(message -> {
////                    LOGGER.info("message body: " + message.body());
////
////                    sqsAsyncClient.deleteMessage(DeleteMessageRequest.builder().queueUrl(queueUrl).receiptHandle(message.receiptHandle()).build())
////                            .thenAccept(deleteMessageResponse -> {
////                                LOGGER.info("deleted message with handle " + message.receiptHandle());
////                            });
//                });
    }

    @Test
    public void amazonSQSAsync() {

        ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest()
                .withQueueUrl(queueurl)
                .withWaitTimeSeconds(20)
                .withMaxNumberOfMessages(1);

        while (true) {
            ReceiveMessageResult receiveMessageResult = amazonSQSAsync.receiveMessage(receiveMessageRequest);
            List<Message> messageList = receiveMessageResult.getMessages();

            messageList.forEach(message -> {
                String receiptHandle = message.getReceiptHandle();
                String body = message.getBody();
                System.out.println(body);

                DeleteMessageRequest deleteMessageRequest = new DeleteMessageRequest(queueurl, receiptHandle);
                amazonSQSAsync.deleteMessage(deleteMessageRequest);
            });

        }
    }
}

