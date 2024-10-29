package br.com.context.mono;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class DeferContextualTest {

  @Test
  public void deferContextual() {

    String key = "message";

    Mono<String> mono1 = Mono.deferContextual(ctx ->
      Mono.just("Hello " + ctx.get(key))
    );

    Mono<String> mono2 = mono1.contextWrite(ctx ->
      ctx.put(key, "World")
    );

    StepVerifier.create(mono2).expectNext("Hello World").verifyComplete();
  }

}
