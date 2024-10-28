package br.com.context.flux.range;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class RangeTest {
  @Test
  public void flux01() {
    Flux<Integer> numbersFlux = Flux.range(1, 10);

    StepVerifier.create(numbersFlux.log())
        .expectSubscription()
        .expectNextCount(10)
        .verifyComplete();
  }



}
