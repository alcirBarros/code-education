package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class LoginDomainApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginDomainApplication.class, args);
    }

}
