package br.com.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//https://emmanuelneri.com.br/2019/04/30/cache-distribuido-com-redis-no-spring-boot/

@SpringBootApplication()
public class ApplicationSpringBoot {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApplicationSpringBoot.class);
        ConfigurableApplicationContext configurableApplicationContext = app.run(args);
    }


}
