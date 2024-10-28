package br.com.context.config.h2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:application.properties", "classpath:application-h2.yml"})
public class H2Configuration {


}
