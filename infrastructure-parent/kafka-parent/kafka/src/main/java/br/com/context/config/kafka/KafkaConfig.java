package br.com.context.config.kafka;

import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.TopicConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@EnableKafka
@Configuration
public class KafkaConfig {

//  @Value(value = "${spring.kafka.bootstrap-servers}")
//  private String bootstrapAddress;
//
//  @Bean
//  public KafkaAdmin kafkaAdmin() {
//    Map<String, Object> configs = new HashMap<>();
//    configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
//    return new KafkaAdmin(configs);
//  }



  @Bean
  public NewTopic foos() {
    return TopicBuilder.name("brpayroll.cdc.esocial-periodic.0")
        .config(TopicConfig.RETENTION_MS_CONFIG, "259200000")
        .config(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE)
        .config(TopicConfig.SEGMENT_MS_CONFIG, "86400000")
        .partitions(1)
        .replicas(1).build();
  }

  @Bean
  public NewTopic bars() {
    return TopicBuilder.name("brpayroll.cdc.esocial-processor.0")
        .config(TopicConfig.RETENTION_MS_CONFIG, "259200000")
        .config(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE)
        .config(TopicConfig.SEGMENT_MS_CONFIG, "86400000")
        .partitions(10)
        .replicas(1).build();
  }
}
