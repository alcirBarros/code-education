package br.com.context.config.rabbitmq;

public enum RabbitMqEnum {
  EXCHANGE("com.tr.bluemoon.exchange.async.notification.pubsub"),
  QUEUE("com.tr.bluemoon.event.esocial.count.pending.v1");

  private final String value;

  RabbitMqEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
