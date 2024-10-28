package br.com.hugosilva.resources;

import br.com.hugosilva.services.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public")
public class RegistrationResource {

    @Autowired
    private EmailService emailService;

    @PostMapping("/registration/users")
    public ResponseEntity<Void> registerUser() {
        this.emailService.sendMail();
        return ResponseEntity.noContent().build();
    }

}
