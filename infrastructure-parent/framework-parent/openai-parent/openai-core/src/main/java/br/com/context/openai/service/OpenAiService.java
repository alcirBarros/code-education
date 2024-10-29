package br.com.context.openai.service;

import lombok.experimental.SuperBuilder;
import org.springframework.web.reactive.function.client.WebClient;

@SuperBuilder
public abstract class OpenAiService {

    protected WebClient webClient;

}
