package com.live.kafka.config.kafka.producer;

import com.live.kafka.controller.CarDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarProducer {

//    @Value("${topic.name}")
//    private final String topic;
//
//    private final KafkaTemplate<String, CarDTO> kafkaTemplate;
//
//    public void send(CarDTO carDTO){
//        kafkaTemplate.send(topic, carDTO).addCallback(
//                success -> log.info("Messagem send" + success.getProducerRecord().value()),
//                failure -> log.info("Message failure" + failure.getMessage())
//        );
//    }
}
