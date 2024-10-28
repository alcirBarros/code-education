package br.com.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class SpringBootApplicationWebSocket implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationWebSocket.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootApplicationWebSocket.class.getName());
    }
}
