package br.com.context;

import org.springframework.beans.factory.annotation.Autowired;

public class WebClientTest {
//
//  @Autowired
//  private WebClient webClient;
//
//  public Mono<WelcomeMessage> getWelcomeMessageAndHandleTimeout(String locale) {
//    return this.serviceAWebClient.get()
//        .uri(uriBuilder -> uriBuilder.path("/locale/{locale}/message").build(locale))
//        .retrieve()
//        .bodyToMono(WelcomeMessage.class)
//        .retryWhen(
//            Retry.backoff(2, Duration.ofMillis(25))
//                .filter(throwable -> throwable instanceof TimeoutException)
//                  );
//  }
}
