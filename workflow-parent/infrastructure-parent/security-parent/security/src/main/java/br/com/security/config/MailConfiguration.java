package br.com.security.config;

import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfiguration {

    private static final String DEFAULT_HOST = "127.0.0.1";
    private static final String PROP_SMTP_AUTH = "mail.smtp.auth";
    private static final String PROP_STARTTLS = "mail.smtp.starttls.enable";
    private static final String PROP_TRANSPORT_PROTO = "mail.transport.protocol";

    private final Logger log = LoggerFactory.getLogger(MailConfiguration.class);

    @Bean
    public JavaMailSenderImpl javaMailSender() {
        log.debug("Configuring mail server");
        
        String host = "smtp.gmail.com"; //securityPropertie.getMail().getHost();
        int port = 587; //securityPropertie.getMail().getPort();
        String user = "comercial.task2"; //securityPropertie.getMail().getUsername();
        String password = "ASDFG)(*&"; //securityPropertie.getMail().getPassword();
        String protocol = "smtp"; //securityPropertie.getMail().getProtocol();
        Boolean tls = true; //securityPropertie.getMail().isTls();
        Boolean auth = true; //securityPropertie.getMail().isAuth();

        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        if (host != null && !host.isEmpty()) {
            sender.setHost(host);
        } else {
            log.warn("Warning! Your SMTP server is not configured. We will try to use one on localhost.");
            log.debug("Did you configure your SMTP settings in your application.yml?");
            sender.setHost(DEFAULT_HOST);
        }
        sender.setPort(port);
        sender.setUsername(user);
        sender.setPassword(password);

        Properties sendProperties = new Properties();
        sendProperties.setProperty(PROP_SMTP_AUTH, auth.toString());
        sendProperties.setProperty(PROP_STARTTLS, tls.toString());
        sendProperties.setProperty(PROP_TRANSPORT_PROTO, protocol);
        sender.setJavaMailProperties(sendProperties);
        return sender;
    }
}