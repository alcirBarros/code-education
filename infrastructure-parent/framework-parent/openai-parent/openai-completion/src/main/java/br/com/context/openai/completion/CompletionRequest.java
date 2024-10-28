package br.com.context.openai.completion;

import br.com.context.openai.request.OpenAiRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CompletionRequest extends OpenAiRequest {

    private String model;
    private String prompt;
    private double temperature;
    @JsonProperty("max_tokens")
    private Integer maxTokens;
    private String user;
}
