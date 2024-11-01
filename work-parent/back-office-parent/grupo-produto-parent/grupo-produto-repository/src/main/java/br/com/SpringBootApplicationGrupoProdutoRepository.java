package br.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationGrupoProdutoRepository implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationGrupoProdutoRepository.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootApplicationGrupoProdutoRepository.class.getName());
    }
}
