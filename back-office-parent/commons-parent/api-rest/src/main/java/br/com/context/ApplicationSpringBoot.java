package br.com.context;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Properties;


@ServletComponentScan
@SpringBootApplication
public class ApplicationSpringBoot {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringBoot.class, args);
    }

//    @Bean
//    public PropertySourcesPlaceholderConfigurer properties() throws Exception {
//        final PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
//        Properties properties = new Properties();
//        properties.setProperty("someProperty", "testValue");
//        pspc.setProperties(properties);
//        return pspc;
//    }


}
