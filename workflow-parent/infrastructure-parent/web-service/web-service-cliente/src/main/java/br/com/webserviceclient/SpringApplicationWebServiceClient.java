package br.com.webserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class SpringApplicationWebServiceClient {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationWebServiceClient.class, args);
    }
}
