package br.com.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class SpringBootFornecedorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFornecedorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootFornecedorApplication.class.getName());
    }
}
