package br.com.relatorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"br.com.relatorio"})
public class SpringApplicationRelatorio {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationRelatorio.class, args);
    }
}
