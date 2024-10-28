package br.com.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://docs.aws.amazon.com/pt_br/cli/latest/userguide/cli-services-s3-commands.html

@SpringBootApplication
public class SpringS3AmazonApplication{
	public static void main(String[] args) {
		SpringApplication.run(SpringS3AmazonApplication.class, args);
//			System.exit(0);
//			System.exit(4);
	}
}
