package br.com.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApplicationSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSpringBoot.class, args);
	}

}
