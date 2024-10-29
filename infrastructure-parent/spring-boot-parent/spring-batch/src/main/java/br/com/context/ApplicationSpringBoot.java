package br.com.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationSpringBoot {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ApplicationSpringBoot.class, args);

        int exitCode = SpringApplication.exit(applicationContext);

//        int exitCode = SpringApplication.exit(applicationContext, new ExitCodeGenerator() {
//            @Override
//            public int getExitCode() {
//                return 0;
//            }
//        });

        System.exit(exitCode);
    }
}
