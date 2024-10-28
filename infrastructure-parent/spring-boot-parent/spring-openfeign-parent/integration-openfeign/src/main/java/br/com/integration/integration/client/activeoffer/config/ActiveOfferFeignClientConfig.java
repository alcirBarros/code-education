package br.com.integration.integration.client.activeoffer.config;

import br.com.integration.integration.interceptor.OpenFeignAuthorizationInterceptor;
import org.springframework.context.annotation.Bean;

public class ActiveOfferFeignClientConfig {

    @Bean
    public OpenFeignAuthorizationInterceptor authorization() {
        return new OpenFeignAuthorizationInterceptor();
    }

}
