package br.com.context.consumer;

import br.com.context.config.amazon.sqs.exception.MyException;
import br.com.context.config.amazon.sqs.service.AmazonSqsService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;
import org.springframework.cloud.aws.messaging.listener.QueueMessageVisibility;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.stereotype.Controller;

@EnableSqs
@Controller
@RequiredArgsConstructor
public class SqsMessageConsumer {

    private static final Logger logger = LogManager.getLogger(SqsMessageConsumer.class);

    private final AmazonSqsService amazonSqsService;

    @SqsListener(value = "${sqs.input.arn}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void consume(Message<String> message, QueueMessageVisibility queueMessageVisibility) {
        logger.info("Received order event for consumer 1: " + message);
        throw new MyException(message);
    }

    @MessageExceptionHandler(MyException.class)
    public void handleException(MyException e) {
        String receiptHandle = e.getReceiptHandle();
        amazonSqsService.deleteMessage(receiptHandle);
    }
}
