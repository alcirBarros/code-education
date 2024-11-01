package br.com.restfull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class RestFullApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestFullApplication.class, args);
    }

}
