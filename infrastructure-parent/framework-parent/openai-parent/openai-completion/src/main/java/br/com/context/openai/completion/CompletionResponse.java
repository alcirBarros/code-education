package br.com.context.openai.completion;

import br.com.context.openai.response.OpenAiResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompletionResponse extends OpenAiResponse {

    private String id;
    private String object;
    private long created;
    private String model;
    private ChoiceResponse[] choices;
    private UsageResponse usage;

}
