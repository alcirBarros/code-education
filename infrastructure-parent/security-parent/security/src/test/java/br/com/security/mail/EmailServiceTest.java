package br.com.security.mail;

import br.com.security.config.MailConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.MessagingException;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.io.IOException;


@SpringBootTest(classes = {SpringTemplateEngine.class, MailConfiguration.class, MailService.class})
public class EmailServiceTest {

    @Autowired
    private MailService mailService;

    @Test
    public void testEmail() throws MessagingException, IOException {
        mailService.sendEmail("alcirbarros@hotmail.com.br", "", "", true, true);
    }

}
