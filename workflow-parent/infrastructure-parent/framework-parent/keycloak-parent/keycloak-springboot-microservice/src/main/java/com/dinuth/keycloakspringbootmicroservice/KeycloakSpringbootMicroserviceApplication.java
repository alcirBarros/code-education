package com.dinuth.keycloakspringbootmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@SpringBootApplication
public class KeycloakSpringbootMicroserviceApplication{

    @PostConstruct
    public void init(){
        System.out.println("AAAAAAAAA");
    }

    public static void main(String[] args) {
        SpringApplication.run(KeycloakSpringbootMicroserviceApplication.class, args);
    }
}
