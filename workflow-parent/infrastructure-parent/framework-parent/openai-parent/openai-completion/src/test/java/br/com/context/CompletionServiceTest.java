package br.com.context;

import br.com.context.openai.completion.CompletionRequest;
import br.com.context.openai.completion.CompletionResponse;
import br.com.context.openai.service.CompletionService;
import com.knuddels.jtokkit.Encodings;
import com.knuddels.jtokkit.api.Encoding;
import com.knuddels.jtokkit.api.EncodingRegistry;
import com.knuddels.jtokkit.api.ModelType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CompletionServiceTest {

    @Autowired
    private CompletionService completionService;

    @Test
    void contextLoads() {

        String prompt = "Escreva uma música";

        int tokens = maxTokens(prompt);

        CompletionRequest completionRequest = CompletionRequest.builder()
                .model(ModelType.TEXT_DAVINCI_003.getName())
                .temperature(0)
                .prompt(prompt)
                .maxTokens(tokens)
                .user("David")
                .build();

        Mono<CompletionResponse> completion = completionService.createCompletion(completionRequest);

        StepVerifier.create(completion)
                .assertNext(responseEntity -> {
                    assertTrue(true);
                })
                .verifyComplete();
    }

    public int maxTokens(String prompt) {
        ModelType modelType = ModelType.TEXT_DAVINCI_003;
        int maxContextLength = modelType.getMaxContextLength();
        int countTokens = countTokens(modelType, prompt);
        return maxContextLength - countTokens;
    }

    public int countTokens(ModelType modelType, String str) {
        EncodingRegistry registry = Encodings.newDefaultEncodingRegistry();
        Encoding encoding = registry.getEncodingForModel(modelType);
        return encoding.countTokens(str);
    }
}
