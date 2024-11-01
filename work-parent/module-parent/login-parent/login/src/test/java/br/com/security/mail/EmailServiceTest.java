//package br.com.security.mail;
//
//import br.com.security.config.MailConfiguration;
//import java.io.IOException;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.messaging.MessagingException;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.thymeleaf.spring5.SpringTemplateEngine;
//
////@RunWith(SpringRunner.class)
////@SpringBootTest(classes = {MailConfiguration.class, MailService.class})
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {SpringTemplateEngine.class, MailConfiguration.class, MailService.class})
//public class EmailServiceTest {
//
//    @Autowired
//    private MailService mailService;
//
//    @Test
//    public void testEmail() throws MessagingException, IOException {
//        mailService.sendEmail("alcirbarros@hotmail.com.br", "", "", true, true);
//    }
//
//}
