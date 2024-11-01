package br.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationAnamneseRepository implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationAnamneseRepository.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootApplicationAnamneseRepository.class.getName());
    }
}
