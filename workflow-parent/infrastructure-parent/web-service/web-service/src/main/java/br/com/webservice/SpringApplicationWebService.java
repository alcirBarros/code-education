package br.com.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class SpringApplicationWebService {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationWebService.class, args);
    }
}
