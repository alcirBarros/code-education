package br.com.context;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.BuildProperties;

@SpringBootApplication
public class DemoApplication {

//	@Autowired
//	BuildProperties buildProperties;
//
//	@PostConstruct
//	public void init() {
//		System.setProperty("APP_NAME", buildProperties.getName());
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



}
