package br.com.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationFuncaoRepository implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationFuncaoRepository.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootApplicationFuncaoRepository.class.getName());
    }
}