package br.com.context.config.amazon.sqs.exception;

import org.springframework.messaging.Message;

public class MyException extends RuntimeException {

    private String receiptHandle;

    public MyException(Message message) {
        this.receiptHandle = message.getHeaders().get("ReceiptHandle", String.class);
    }

    public String getReceiptHandle(){
        return receiptHandle;
    }

}
