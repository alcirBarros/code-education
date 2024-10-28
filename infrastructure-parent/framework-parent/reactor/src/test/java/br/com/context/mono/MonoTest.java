package br.com.context.mono;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import reactor.util.function.Tuple2;

public class MonoTest {

  @Test
  public void monoTest01() {

    Mono<String> monoWithDelay = Mono.just("Reactive").delayElement(Duration.ofSeconds(5));

    StepVerifier.create(monoWithDelay)
        .expectNext("Reactive")
        .expectComplete()
        .verify();
  }


  @Test
  public void monoTest02() {

    Function<String, String> mapper = String::toUpperCase;

    Mono<String> justOrEmpty = Mono.justOrEmpty("map");
    Mono<String> map = justOrEmpty.map(mapper);

    StepVerifier.create(map)
        .expectNext("MAP")
        .expectComplete()
        .verify();
  }

  @Test
  public void monoTest03() {
    Mono<String> monoNull = Mono.justOrEmpty(null);
    Mono<String> empty = Mono.empty();
    Mono<String> switchIfEmpty = empty.switchIfEmpty(Mono.just(new String("switchIfEmpty")));
    StepVerifier.create(switchIfEmpty).assertNext(Assertions::assertNotNull).expectComplete().verify();
  }

  @Test
  void monoTest04() {

    Function<String, Publisher<String>> mapper = s -> Flux.just(s.toUpperCase().split(""));

    Mono<String> mono = Mono.just("ABCD");
    Flux<String> stringFlux = mono.flatMapMany(mapper);

    StepVerifier.create(stringFlux.log())
        .expectNext("A", "B", "C", "D")
        .verifyComplete();
  }


  @Test
  void monoTest05() {

    Function<String, Publisher<String>> mapper = s -> Flux.just(s.toUpperCase().split(""));

    Mono<String> mono01 = Mono.just("ABCD");
    Mono<String> mono02 = Mono.just("EFGH");
    Mono<String> mono = mono01.then(mono02);

    StepVerifier.create(mono.log())
        .assertNext(responseEntity -> {
          assertEquals("EFGH", responseEntity);
        }).verifyComplete();
  }

  @Test
  public void monoTest06() {
    Mono<Integer> mono = Mono.empty().thenReturn(1);
    StepVerifier.create(mono)
        .expectNext(1)
        .verifyComplete();
  }

  @Test
  public void monoTest07() {

    Mono<String> empty = Mono.just("123");
    Mono<String> switchIfEmpty = empty.switchIfEmpty(Mono.just(new String("switchIfEmpty")));

    StepVerifier.create(switchIfEmpty.log())
        .expectNext("123")
        .verifyComplete();
  }

  @Test
  public void monoTest08() {

    Mono<Integer> monoEvent = Mono.just(1);
    Flux<Integer> flux02 = Flux.empty();

    Mono<Tuple2<Integer, List<Integer>>> zip = Mono.zip(monoEvent, flux02.collectList());

    Mono<List<Integer>> listMono = zip.flatMap(x -> {
      Integer t1 = x.getT1();
      List<Integer> t2 = x.getT2();
      return !t2.isEmpty() ? Mono.just(t2) : Mono.empty();
    }).thenReturn(List.of());

    StepVerifier.create(listMono)
        .assertNext(responseEntity -> {
          assertTrue(true);
        })
        .verifyComplete();
  }

  @Test
  public void monoTest09() {
    Mono<Integer> mono01 = Mono.just(1);
    Mono<Integer> mono02 = Mono.just(2);

    Mono<Integer> mono = mono01.then(mono02);

    StepVerifier.create(mono).assertNext(responseEntity -> {
      assertEquals(2, responseEntity);
    }).verifyComplete();
  }

  @Test
  public void test010() {
    Mono<Integer> mono01 = Mono.just(1);
    Mono<Integer> mono02 = Mono.just(2);
    Mono<Integer> mono03 = Mono.error(new RuntimeException("Error Occurred"));
    Mono<Integer> mono04 = Mono.just(4);
    Mono<Integer> mono05 = Mono.just(5);
    Mono<Integer> mono = mono01.then(mono02).then(mono03).then(mono04).then(mono05);
    StepVerifier.create(mono).expectError(RuntimeException.class).verify();
  }

}
