package br.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootInstituicaoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInstituicaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootInstituicaoApplication.class.getName());
    }
}
