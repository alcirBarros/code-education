package br.com.hugosilva.services.email;

import br.com.hugosilva.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import java.util.Date;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    
    @Autowired
    private TemplateEngine templateEngine;
    @Autowired
    private JavaMailSender javaMailSender;


    public void sendMail() {
        try {
            MimeMessage mimeMessage = prepareMimeMessageFromUser();
            sendHtmlEmail(mimeMessage);
        } catch (MessagingException msg) {
            throw new ObjectNotFoundException(String.format("Erro ao tentar enviar o e-mail"));
        }
    }

    protected MimeMessage prepareMimeMessageFromUser() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setTo("alcirbarros@hotmail.com.br");
     //   mimeMessageHelper.setFrom(this.sender);
        mimeMessageHelper.setSubject("Confirmação de Registro");
        mimeMessageHelper.setSentDate(new Date((System.currentTimeMillis())));
        mimeMessageHelper.setText(htmlFromTemplateUser(), true);
        return mimeMessage;
    }

    protected String htmlFromTemplateUser() {
        String token = UUID.randomUUID().toString();
        String confirmationUrl = "http://localhost:8080/api/public/regitrationConfirm/users?token=" + token;
        Context context = new Context();
        context.setVariable("user", "AAAAAAAAAAAAAAAAAAa");
        context.setVariable("confirmationUrl", confirmationUrl);
        return templateEngine.process("email/registerUser", context);
    }

    public void sendHtmlEmail(MimeMessage msg) {
        javaMailSender.send(msg);
    }

}
