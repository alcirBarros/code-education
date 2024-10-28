package com.live.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ApplicationSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSpringBoot.class, args);
	}

}
