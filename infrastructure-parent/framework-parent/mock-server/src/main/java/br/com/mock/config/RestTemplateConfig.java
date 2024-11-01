package br.com.mock.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplateBuilder RestTemplateBuilder() {
        return new RestTemplateBuilder();
    }

    @Bean
    @DependsOn(value = {"RestTemplateBuilder"})
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
