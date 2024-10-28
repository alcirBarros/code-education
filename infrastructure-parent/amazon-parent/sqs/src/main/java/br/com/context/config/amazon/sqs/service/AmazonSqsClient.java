package br.com.context.config.amazon.sqs.service;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.GetQueueUrlResult;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
class AmazonSqsClient {

    private final AmazonSQS amazonSQS;

    @Value("${sqs.output.arn}")
    private String outputArn;

    @Value("${sqs.input.arn}")
    private String inputArn;

    @PostConstruct
    public void continuousListener() {

    }

    public SendMessageResult sendMessage(String json) {
        try {
            log.info("Send message to processing queue");
            SendMessageRequest sendMessageRequest = new SendMessageRequest(inputArn, json);
            sendMessageRequest.withDelaySeconds(5);
            SendMessageResult sendMessageResult = amazonSQS.sendMessage(sendMessageRequest);
            log.info("Message sending id: " + sendMessageResult.getMessageId());
            return sendMessageResult;
        } catch (Exception ex) {
            log.info("Caught an AmazonServiceException from SendMessage, rejected reasons:");
            log.info("Error Message: " + ex.getMessage());
            throw ex;
        }
    }

    public void deleteMessage(String receiptHandle) {
        GetQueueUrlResult getQueueUrlResult = amazonSQS.getQueueUrl(inputArn);
        String urlQueueUrl = getQueueUrlResult.getQueueUrl();
        DeleteMessageRequest deleteMessageRequest = new DeleteMessageRequest(urlQueueUrl, receiptHandle);
        amazonSQS.deleteMessage(deleteMessageRequest);
    }


    public List<Message> receiveMessage() {
        ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest(inputArn);
        receiveMessageRequest.withWaitTimeSeconds(10);
        receiveMessageRequest.withMaxNumberOfMessages(10);
        return amazonSQS.receiveMessage(receiveMessageRequest).getMessages();
    }
}
