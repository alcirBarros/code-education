package br.com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class SpringBootApplicationPessoa extends SpringBootApplicationEducaFacilTemplate {

    public static void main(String[] args) {
        SpringBootApplicationEducaFacilTemplate.main(args);
    }
}
