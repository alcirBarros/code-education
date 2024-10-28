package br.com.context;

import br.com.context.openai.completion.ChoiceResponse;
import br.com.context.openai.completion.CompletionRequest;
import br.com.context.openai.completion.CompletionResponse;
import br.com.context.openai.property.OpenAiProperties;
import br.com.context.openai.service.CompletionService;
import br.com.context.openai.service.CompletionnService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class OpenAiServiceTest {

    @Autowired
    private CompletionService completionService;

    @Test
    void contextLoads() {

        String prompt = "escreva os número de 1 até 10 separado por virgula";

        CompletionRequest completionRequest = CompletionRequest.builder()
                .model("text-davinci-003")
                .temperature(0)
                .prompt(prompt)
                .maxTokens(1000)
                .user("David")
                .build();

        Mono<CompletionResponse> completion = completionService.createCompletion(completionRequest);

        StepVerifier.create(completion)
                .assertNext(responseEntity -> {
                    assertTrue(true);
                })
                .verifyComplete();
    }
}
