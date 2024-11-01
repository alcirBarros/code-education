package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.**"})
public class SpringBootApplicationEvento extends SpringBootApplicationEducaFacilTemplate {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationEvento.class, args);
    }
}
