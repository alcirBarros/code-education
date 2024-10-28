package br.com.servicoexterno;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class SpringBootApplicationServicoExterno implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationServicoExterno.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootApplicationServicoExterno.class.getName());
    }
}
