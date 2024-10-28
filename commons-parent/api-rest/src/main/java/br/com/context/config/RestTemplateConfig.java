package br.com.context.config;

import br.com.context.interceptor.HttpClientRequestInterceptor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.boot.web.client.RootUriTemplateHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.*;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.util.Collections;

@Configuration
public class RestTemplateConfig {


    @Bean
    public RestTemplateCustomizer restTemplateCustomizer() {
        RestTemplateCustomizer restTemplateCustomizer = new RestTemplateCustomizer() {
            @Override
            public void customize(RestTemplate restTemplate) {
                restTemplate.setUriTemplateHandler(new RootUriTemplateHandler("http://localhost:8080"));
                restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
                restTemplate.setInterceptors(Collections.singletonList(new HttpClientRequestInterceptor()));
            }
        };
        return restTemplateCustomizer;
    }

    @Bean
    public RestTemplateBuilder restTemplateBuilder(RestTemplateCustomizer restTemplateCustomizer) {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder(restTemplateCustomizer);
        restTemplateBuilder.setConnectTimeout(Duration.ofMillis(60000));
        restTemplateBuilder.setReadTimeout(Duration.ofMillis(60000));
        return restTemplateBuilder;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }


}
