package br.com.context.openai.completion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChoiceResponse {

    private String text;
    private long index;
    private Object logprobs;
    @JsonProperty("finish_reason")
    private String finishReason;
}
