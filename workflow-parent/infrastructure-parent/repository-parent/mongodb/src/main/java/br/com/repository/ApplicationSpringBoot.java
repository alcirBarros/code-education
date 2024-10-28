package br.com.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ApplicationSpringBoot implements CommandLineRunner {

    private static final Logger logger = LogManager.getLogger(ApplicationSpringBoot.class);

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApplicationSpringBoot.class);
        ConfigurableApplicationContext configurableApplicationContext = app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {

        String[] activeProfiles = environment.getActiveProfiles();

        logger.info("\n------------------------------------------------------------------------\n\t"
                + "Profile(s): '{}' \n\t"
                + "Driver: '{}' \n\t"
                + "URL: '{}'\n\t"
                + "UserName: {}\n\t"
                + "Password: {}\n\t"
                + "ddl-auto: {}"
                + "\n------------------------------------------------------------------------",
                activeProfiles,
                environment.getProperty("spring.datasource.driver-class-name"),
                environment.getProperty("spring.datasource.url"),
                environment.getProperty("spring.datasource.username"),
                environment.getProperty("spring.datasource.password"),
                environment.getProperty("spring.jpa.hibernate.ddl-auto"));
    }

}
