package br.com;

import br.com.context.ApplicationSpringBoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.**"})
public class SpringBootApplicationEventoAutomatico extends SpringBootApplicationEducaFacilTemplate {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringBoot.class, args);
    }
}
