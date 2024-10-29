package br.com.context.openai.configuration;

import br.com.context.openai.core.auth.credential.Credential;
import br.com.context.openai.core.auth.service.CredentialProviderService;
import br.com.context.openai.core.provider.CredentialProvider;
import br.com.context.openai.property.OpenAiProperties;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@AllArgsConstructor
public class WebClientConfiguration {

    private final WebClient.Builder webClientBuilder;

    private final OpenAiProperties openAiProperties;

    private final CredentialProviderService credentialProviderService;

    @Bean
    public WebClient webClientFromBuilder() {
        String baseUrl = openAiProperties.getBaseUrl();
        CredentialProvider credentialProvider = credentialProviderService.getCredentialProvider();
        Credential credential = credentialProvider.getCredential();
        String secretKey = credential.getSecretKey();

//        final var tcpClient = TcpClient.create().option(ChannelOption.CONNECT_TIMEOUT_MILLIS, TIMEOUT)
//                .doOnConnected(connection -> {
//                    connection.addHandlerLast(new ReadTimeoutHandler(TIMEOUT, TimeUnit.MILLISECONDS));
//                    connection.addHandlerLast(new WriteTimeoutHandler(TIMEOUT, TimeUnit.MILLISECONDS));
//                });
//        webClientBuilder.clientConnector(new ReactorClientHttpConnector(HttpClient.from(tcpClient))).build();

        return webClientBuilder
                .baseUrl(baseUrl)
                .defaultHeaders(h ->  h.setBearerAuth(secretKey)).build();
    }
}
