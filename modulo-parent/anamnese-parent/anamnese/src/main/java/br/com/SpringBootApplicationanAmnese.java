package br.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class SpringBootApplicationanAmnese implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationanAmnese.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootApplicationanAmnese.class.getName());
    }
}
