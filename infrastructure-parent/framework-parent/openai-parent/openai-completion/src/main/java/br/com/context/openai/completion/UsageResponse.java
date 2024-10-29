package br.com.context.openai.completion;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsageResponse {

    @JsonProperty("prompt_tokens")
    private long promptTokens;
    @JsonProperty("completion_tokens")
    private long completionTokens;
    @JsonProperty("total_tokens")
    private long totalTokens;
}
