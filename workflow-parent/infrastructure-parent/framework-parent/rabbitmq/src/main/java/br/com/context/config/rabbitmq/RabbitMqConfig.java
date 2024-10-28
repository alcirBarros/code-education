package br.com.context.config.rabbitmq;

import static br.com.context.config.rabbitmq.RabbitMqEnum.EXCHANGE;
import static br.com.context.config.rabbitmq.RabbitMqEnum.QUEUE;

import java.util.List;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Binding.DestinationType;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

  @Bean
  public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
    return new RabbitTemplate(connectionFactory);
  }

  @Bean
  public Exchange asyncNotificationExchange() {
    return new TopicExchange(EXCHANGE.getValue(), true, false);
  }

  @Bean
  public Binding binding() {
    String routingKey = "br.com.*.buy.*";
    String exchangeValue = EXCHANGE.getValue();
    String queueValue = QUEUE.getValue();
    return new Binding(queueValue, DestinationType.EXCHANGE, exchangeValue, routingKey, null);
  }

  protected AmqpAdmin createRabbitAdmin(RabbitTemplate rabbitTemplate) {
    return new RabbitAdmin(rabbitTemplate);
  }

  @Bean
  public AmqpAdmin amqpAdmin(RabbitTemplate rabbitTemplate, List<Exchange> exchanges, List<Queue> queues, List<Binding> bindings) {
    var admin = createRabbitAdmin(rabbitTemplate);
    exchanges.forEach(admin::declareExchange);
    queues.forEach(admin::declareQueue);
    bindings.forEach(admin::declareBinding);
    return admin;
  }
}
