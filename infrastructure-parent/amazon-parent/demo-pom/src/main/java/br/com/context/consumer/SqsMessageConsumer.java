package br.com.context.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;


@Controller
public class SqsMessageConsumer {


    @JmsListener(destination = "dsv-queue-partner-registration_dev")
    public void registration(@Payload String registrationResponse) {
        System.out.println(registrationResponse);
    }

}
