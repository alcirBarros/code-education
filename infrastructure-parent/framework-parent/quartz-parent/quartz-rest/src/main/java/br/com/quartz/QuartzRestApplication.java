package br.com.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EntityScan(basePackages = "br.com.quartzdemo.**")
@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
public class QuartzRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuartzRestApplication.class, args);
    }
}
