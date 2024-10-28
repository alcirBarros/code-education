package br.com.context.controller;

import br.com.context.config.amazon.sqs.object.SendMessageResultObject;
import br.com.context.config.amazon.sqs.service.AmazonSqsService;
import br.com.context.model.Notification;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SqsController {

    @Autowired
    private AmazonSqsService amazonSqsService;

    @PostMapping(value = "/sendNotification")
    public ResponseEntity sendMessage(@RequestBody Notification notification) {
        SendMessageResultObject sendMessageResultObject = amazonSqsService.sendMessage(null);
        return ResponseEntity.ok().body(sendMessageResultObject);
    }
}
