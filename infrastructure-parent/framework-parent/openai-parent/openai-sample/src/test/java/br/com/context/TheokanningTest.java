package br.com.context;


import com.theokanning.openai.service.OpenAiService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.completion.chat.ChatMessageRole;
import com.theokanning.openai.completion.CompletionRequest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class TheokanningTest {

	@Test
	void contextLoads() {
		String token = "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";
		OpenAiService service = new OpenAiService(token);

		System.out.println("\nCreating completion...");

		CompletionRequest completionRequest = CompletionRequest.builder()
				.model("text-davinci-002")
				.prompt("Escreva um poema")
				.echo(true)
				.user("user")
				.build();

		service.createCompletion(completionRequest).getChoices().forEach(System.out::println);

		System.out.println("\nCreating Image...");
//		CreateImageRequest request = CreateImageRequest.builder()
//				.prompt("A cow breakdancing with a turtle")
//				.build();
//
//		System.out.println("\nImage is located at:");
//		System.out.println(service.createImage(request).getData().get(0).getUrl());

//		System.out.println("Streaming chat completion...");
//		final List<ChatMessage> messages = new ArrayList<>();
//
//		final ChatMessage systemMessage = new ChatMessage(ChatMessageRole.SYSTEM.value(), "Olá");
//
//		messages.add(systemMessage);
//
//		ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest
//				.builder()
//				.model("gpt-3.5-turbo")
//				.messages(messages)
//				.n(1)
//				.maxTokens(50)
//				.logitBias(new HashMap<>())
//				.build();
//
//		service.streamChatCompletion(chatCompletionRequest)
//				.doOnError(Throwable::printStackTrace)
//				.blockingForEach(System.out::println);
//
//		service.shutdownExecutor();
	}

}
