package br.com.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;


// https://examples.javacodegeeks.com/spring-boot-and-sns-mobile-notification-example/


@SpringBootApplication
public class SpringSnsAmazonApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringSnsAmazonApplication.class, args);
	}
}