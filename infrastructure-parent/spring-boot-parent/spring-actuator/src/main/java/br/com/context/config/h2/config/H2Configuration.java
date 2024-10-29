//package br.com.context.config.h2.config;
//
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.annotation.PostConstruct;
//
//
//@Configuration
//@EnableTransactionManagement
//@EntityScan("br.com.context.h2.**")
//@EnableJpaRepositories(basePackages = "br.com.context.h2.**")
//@PropertySource({"classpath:application.properties", "classpath:application-h2.properties"})
//public class H2Configuration {
//
//
//    @PostConstruct
//    private void init(){
//        System.out.println("");
//    }
//
//}
