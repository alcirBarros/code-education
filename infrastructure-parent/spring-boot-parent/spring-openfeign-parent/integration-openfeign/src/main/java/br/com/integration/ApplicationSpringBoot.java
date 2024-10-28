package br.com.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApplicationSpringBoot {

    //https://engineering.getmidas.com/using-spring-retryable-with-feign-client-methods-9f77e509ad55

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringBoot.class, args);
    }
}
