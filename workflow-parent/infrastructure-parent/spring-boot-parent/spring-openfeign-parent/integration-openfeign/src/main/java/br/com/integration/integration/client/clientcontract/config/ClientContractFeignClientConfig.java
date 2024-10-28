package br.com.integration.integration.client.clientcontract.config;

import br.com.integration.integration.interceptor.OpenFeignAuthorizationInterceptor;
import org.springframework.context.annotation.Bean;

public class ClientContractFeignClientConfig {

    @Bean
    public OpenFeignAuthorizationInterceptor authorization() {
        return new OpenFeignAuthorizationInterceptor();
    }
}
