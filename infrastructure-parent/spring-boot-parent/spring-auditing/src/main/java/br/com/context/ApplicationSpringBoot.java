package br.com.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ApplicationSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSpringBoot.class, args);
	}

}
