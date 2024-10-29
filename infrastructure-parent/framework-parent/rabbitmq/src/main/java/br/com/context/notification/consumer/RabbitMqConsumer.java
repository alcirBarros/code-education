package br.com.context.notification.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqConsumer {

  @RabbitListener(queues = "com.tr.bluemoon.event.esocial.count.pending.v1")
  public void receiveMessage(Message message) {
    System.out.println("Received <" + message + ">");
  }

}
