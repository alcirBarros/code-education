package br.com.integration.integration.client.simulation.config;

import br.com.integration.integration.interceptor.OpenFeignAuthorizationInterceptor;
import org.springframework.context.annotation.Bean;

public class SimulationFeignClientConfig {

    @Bean
    public OpenFeignAuthorizationInterceptor authorization() {
        return new OpenFeignAuthorizationInterceptor();
    }

}
