package br.com.context.notification.producer;

import br.com.context.config.rabbitmq.RabbitMqEnum;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class RabbitMqEnqueuer {

  private final RabbitTemplate rabbitTemplate;

  public void send() {
    Message message = new Message("Olá RabbitMq".getBytes());
    rabbitTemplate.send(RabbitMqEnum.QUEUE.getValue(), message);
  }

  public void convertAndSend() {
    rabbitTemplate.convertAndSend(RabbitMqEnum.QUEUE.getValue(), "Olá RabbitMq");
  }

}