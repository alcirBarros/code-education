package br.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class SpringBootInstituicaoApplicationSecurity extends SpringBootServletInitializer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInstituicaoApplicationSecurity.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootInstituicaoApplicationSecurity.class.getName());
    }


}
