package br.com.context.controller;

import br.com.context.model.Notification;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.services.sns.util.Topics;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnsController {

    @Autowired
    private Topic topic;

    @Autowired
    private AmazonSNS amazonSNS;

    @PostMapping(value = "/addSubscription/")
    public ResponseEntity<SubscribeResult> addSubscription() {
        String sqs ="http://localhost:4566/000000000000/order-queue";
//      String snsTopicArn ="arn:aws:sns:sa-east-1:000000000000:topic-name";
//      String s = Topics.subscribeQueue(amazonSNS, null, snsTopicArn, sqs);

        final SubscribeRequest subscribeRequest = new SubscribeRequest(topic.getTopicArn(), "sqs", sqs);
        SubscribeResult subscribeResult = amazonSNS.subscribe(subscribeRequest);
        return ResponseEntity.ok().body(subscribeResult);
    }

    @PostMapping(value = "/sendNotification")
    public ResponseEntity<PublishResult> publishMessageToTopic(@NotNull @RequestBody final Notification notification) {
        PublishRequest publishRequest = new PublishRequest(topic.getTopicArn(), notification.getMessage());
        PublishResult publish = amazonSNS.publish(publishRequest);
        return ResponseEntity.ok().body(publish);
    }
}
