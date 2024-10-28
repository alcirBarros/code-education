package br.com.context;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class EventProducer {

  private final KafkaTemplate<String, String> kafkaTemplate;

  public void send(String carDTO){
    //kafkaTemplate.send(topic, carDTO).get(5000, TimeUnit.MILLISECONDS);
    kafkaTemplate.send("brpayroll.cdc.esocial-processor.0", UUID.randomUUID().toString(), carDTO);
  }
}
