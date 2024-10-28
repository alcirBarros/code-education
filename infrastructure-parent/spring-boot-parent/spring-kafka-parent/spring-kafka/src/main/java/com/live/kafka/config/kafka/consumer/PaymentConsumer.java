package com.live.kafka.config.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class PaymentConsumer {

    @KafkaListener(topics = "payment")
    public void consumer(@Header(value = "transaction", required = false) String transactionId, @Payload Double value, Object o){

    }

}
