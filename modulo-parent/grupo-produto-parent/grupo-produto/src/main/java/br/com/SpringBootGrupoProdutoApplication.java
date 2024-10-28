package br.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGrupoProdutoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGrupoProdutoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootGrupoProdutoApplication.class.getName());
    }
}
