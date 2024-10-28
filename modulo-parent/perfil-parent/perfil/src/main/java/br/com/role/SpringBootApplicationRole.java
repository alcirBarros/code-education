package br.com.role;

import br.com.context.ApplicationSpringBoot;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationRole implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringBoot.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootApplicationRole.class.getName());
    }
}
