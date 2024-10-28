package br.com.context.openai.configuration;

import br.com.context.openai.service.CompletionService;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@AllArgsConstructor
public class CompletionConfiguration {

    private final WebClient webClient;

    @PostConstruct
    private void init(){
        System.out.println("");
    }

    @Bean
    public CompletionService completionService(){
        CompletionService build = CompletionService.builder()
                .webClient(webClient)
                .build();
        return build;
    }
}
