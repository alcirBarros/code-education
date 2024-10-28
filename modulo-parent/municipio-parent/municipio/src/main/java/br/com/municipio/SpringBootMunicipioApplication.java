package br.com.municipio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class SpringBootMunicipioApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMunicipioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(SpringBootMunicipioApplication.class.getName());
    }
}
