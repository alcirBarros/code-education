package br.com.context.config.amazon.sqs.service;


import br.com.context.config.amazon.sqs.object.SendMessageResultObject;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AmazonSqsService {

    private final AmazonSqsClient amazonSqsClient;

    private final QueueMessagingTemplate queueMessagingTemplate;

    private final ModelMapper modelMapper;

    public SendMessageResultObject sendMessage(String json) {
        log.info("Prepare object to processing queue");
        SendMessageResult sendMessageResult = amazonSqsClient.sendMessage(json);
        SendMessageResultObject sendMessageResultObject = modelMapper.map(sendMessageResult, SendMessageResultObject.class);
        log.info("ModelMapper object id: " + sendMessageResultObject.getMessageId());
        return sendMessageResultObject;
    }

    public void deleteMessage(String receiptHandle) {
        amazonSqsClient.deleteMessage(receiptHandle);
    }
}
