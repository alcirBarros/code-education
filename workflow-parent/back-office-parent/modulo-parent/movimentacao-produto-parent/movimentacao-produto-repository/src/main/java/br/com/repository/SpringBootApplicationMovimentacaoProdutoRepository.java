package br.com.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationMovimentacaoProdutoRepository implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationMovimentacaoProdutoRepository.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootApplicationMovimentacaoProdutoRepository.class.getName());
    }
}
