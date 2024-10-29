package br.com.amazon.config;

import com.amazonaws.services.athena.AmazonAthena;
import com.amazonaws.services.athena.AmazonAthenaClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonAthenaConfig {

    @Bean
    public AmazonAthena amazonAthena() {
        AmazonAthenaClientBuilder amazonAthenaClientBuilder = AmazonAthenaClientBuilder.standard();
        return amazonAthenaClientBuilder.build();
    }

}
