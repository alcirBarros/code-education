package br.com.context;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationSpringBoot {

    private static Log logger = LogFactory.getLog(ApplicationSpringBoot.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringBoot.class, args);
    }

}
