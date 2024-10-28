package br.com.context;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class EventConsumer {
//
//  private final KafkaTopicConfig kafkaTopicConfig;


//  @KafkaListener(id = "fooGroup", topics = "topic4")
//  @RetryableTopic(attempts = "5", backoff = @Backoff(delay = 2_000, maxDelay = 10_000, multiplier = 2))
//  public void listen(String in, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic, @Header(KafkaHeaders.OFFSET) long offset) {
//    log.info("Received: {} from {} @ {}", in, topic, offset);
//  }

  @KafkaListener(topics = "brpayroll.cdc.esocial-periodic.0")
  void consume(@Payload Object event, @Header(KafkaHeaders.RECEIVED_PARTITION) int partition, @Header(KafkaHeaders.OFFSET) int offset) {

    log.info("Starting periodic event message process: partition={} offset={} topic={}", partition,  offset,  "?topic?");

  //  String topicName = kafkaTopicConfig.provideName();
 //   log.info("Starting periodic event message process: partition={} offset={} topic={}", partition, offset, topicName);
  }


}
