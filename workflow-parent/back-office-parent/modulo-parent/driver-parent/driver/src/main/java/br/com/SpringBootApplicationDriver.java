package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class SpringBootApplicationDriver extends SpringBootApplicationEducaFacilTemplate {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationDriver.class, args);
    }
}
