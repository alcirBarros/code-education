package br.com.context.mono;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class fromRunnableTest {

  @Test
  public void monoTest01() {

    Mono<Object> objectMono = Mono.fromRunnable(() -> System.out.println("")).delayElement(Duration.ofSeconds(5));

    StepVerifier.create(objectMono)
        .expectNext("Reactive")
        .expectComplete()
        .verify();
  }

}
