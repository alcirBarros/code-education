package br.com.integration.integration.client.contrato.config;

import br.com.integration.integration.interceptor.OpenFeignAuthorizationInterceptor;
import org.springframework.context.annotation.Bean;

public class ContratoFeignClientConfig {

    @Bean
    public OpenFeignAuthorizationInterceptor authorization() {
        return new OpenFeignAuthorizationInterceptor();
    }
}
