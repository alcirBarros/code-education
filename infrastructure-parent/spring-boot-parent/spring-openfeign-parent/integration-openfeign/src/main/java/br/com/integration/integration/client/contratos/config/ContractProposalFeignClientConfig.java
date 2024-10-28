package br.com.integration.integration.client.contratos.config;

import br.com.integration.integration.interceptor.OpenFeignAuthorizationInterceptor;
import org.springframework.context.annotation.Bean;

public class ContractProposalFeignClientConfig {

    @Bean
    public OpenFeignAuthorizationInterceptor authorization() {
        return new OpenFeignAuthorizationInterceptor();
    }
}
