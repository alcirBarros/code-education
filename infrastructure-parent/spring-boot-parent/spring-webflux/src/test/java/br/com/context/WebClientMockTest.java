package br.com.context;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestBodyUriSpec;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersUriSpec;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class WebClientMockTest {

  private WebClient webClient;
  private RequestHeadersUriSpec requestHeadersUriSpec;
  private RequestHeadersSpec requestHeadersSpec;
  private RequestHeadersSpec requestBodyUriSpec;
  private ResponseSpec responseSpecMock;

  @BeforeEach
  public void setup() {
    webClient = mock(WebClient.class);
    requestHeadersUriSpec = mock(RequestHeadersUriSpec.class);
    requestBodyUriSpec = mock(RequestBodyUriSpec.class);
    requestHeadersSpec = mock(RequestHeadersSpec.class);
    responseSpecMock = mock(ResponseSpec.class);
  }


  @Test
  public void mono001Test() {
    Mono<String> mono = Mono.just("a");

    when(webClient.get()).thenReturn(requestHeadersUriSpec);
    when(requestHeadersUriSpec.uri(ArgumentMatchers.<String>notNull())).thenReturn(requestHeadersSpec);
    when(requestHeadersSpec.header(any(), any())).thenReturn(requestHeadersSpec);
    when(requestHeadersUriSpec.headers(any())).thenReturn(requestHeadersSpec);
    when(requestHeadersSpec.retrieve()).thenReturn(responseSpecMock);
    when(responseSpecMock.bodyToMono(ArgumentMatchers.<Class<String>>notNull())).thenReturn(mono);

    Mono<String> sdasdas = webClient.get().uri("https://test.com.br").retrieve().bodyToMono(String.class);
    String s = sdasdas.block();
    System.out.println(s);
  }


  @Test
  public void flux001Test() {
    Flux<String> flux = Flux.just("a");

    when(webClient.get()).thenReturn(requestHeadersUriSpec);
    when(requestHeadersUriSpec.uri(ArgumentMatchers.<String>notNull())).thenReturn(requestHeadersSpec);
    when(requestHeadersSpec.header(any(), any())).thenReturn(requestHeadersSpec);
    when(requestHeadersUriSpec.headers(any())).thenReturn(requestHeadersSpec);
    when(requestHeadersSpec.retrieve()).thenReturn(responseSpecMock);
    when(responseSpecMock.bodyToFlux(ArgumentMatchers.<Class<String>>notNull())).thenReturn(flux);

    Flux<String> sdasdas = webClient.get().uri("https://test.com.br").retrieve().bodyToFlux(String.class);
    String blockFirst = sdasdas.blockFirst();
    System.out.println(blockFirst);
  }

  @Test
  public void flux002Test() {
    Flux<String> flux = Flux.just("a", "b", "c", "d");



    when(webClient.get()).thenReturn(requestHeadersUriSpec);
    when(requestHeadersUriSpec.uri(ArgumentMatchers.<String>notNull())).thenReturn(requestHeadersSpec);
    when(requestHeadersSpec.header(any(), any())).thenReturn(requestHeadersSpec);
    when(requestHeadersUriSpec.headers(any())).thenReturn(requestHeadersSpec);
    when(requestHeadersSpec.retrieve()).thenReturn(responseSpecMock);
    when(responseSpecMock.bodyToFlux(ArgumentMatchers.<Class<String>>notNull())).thenReturn(flux);

    Flux<String> stringFlux = webClient.get().uri("https://test.com.br").retrieve().bodyToFlux(String.class);
    Mono<List<String>> listMono = stringFlux.collectList();
    List<String> block = listMono.block();
    System.out.println(block);
  }
}
