package br.com.context.openai.service;

import br.com.context.openai.completion.CompletionResponse;
import br.com.context.openai.request.OpenAiRequest;
import lombok.experimental.SuperBuilder;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

@SuperBuilder
public class CompletionService extends OpenAiService {

    public <T extends OpenAiRequest> Mono<CompletionResponse> createCompletion(T openAiRequest) {

        return webClient.post().uri("/v1/completions")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(openAiRequest), openAiRequest.getClass())
                .retrieve()
                .bodyToMono(CompletionResponse.class)
                .retryWhen(Retry.max(3));
    }

}
