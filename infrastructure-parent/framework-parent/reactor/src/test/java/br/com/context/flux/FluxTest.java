package br.com.context.flux;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import reactor.util.function.Tuple2;

class FluxTest {

  private static List<Integer> INTEGER_LIST = Arrays.asList(5, 9, 7, 7, 4, 2, 2 ,1, 2 -5, 3, 8, 3, 3, 6, 10);

  @Test
  public void flux01_() {
    Flux<Object> empty = Flux.empty();
    Flux<Object> just = Flux.just();
    Flux<Integer> flux = Flux.fromIterable(INTEGER_LIST);
    Flux<Tuple2<Object, Object>> zip = Flux.zip(empty, just);
    Flux<Object> concat = Flux.concat(empty);
    Flux<Object> from = Flux.from(empty);
  }

  @Test
  public void flux01() {

    Flux<Integer> flux = Flux.fromIterable(INTEGER_LIST);
    Duration duration = Duration.ofMillis(10000);
    Flux<Integer> fluxDuration = flux.delayElements(duration);
    // .doOnNext(v -> System.out.println(v))
    Flux<Integer> fluxMap = fluxDuration.map(d -> d * 2);
    // .take(3)
    // .onErrorResumeWith(errorHandler::fallback)
    // .doAfterTerminate(serviceM::incrementTerminate)
    // .subscribeOn(Schedulers.single())
    // .subscribe(System.out::println);
    fluxMap.subscribe(System.out::println);
    StepVerifier.create(fluxMap)
        .expectSubscription()
        .expectNextCount(3)
        .expectComplete()
        .verify(Duration.ofSeconds(20000));

  }

  @Test
  public void flux03() {
    Flux<Integer> fluxRange = Flux.range(1, 10);
    Duration duration = Duration.ofSeconds(1);
    Flux<Date> flux02 = Flux.interval(duration).map(tick -> new Date());
    Flux<String> stringFlux = Flux.zip(fluxRange, flux02, (no, tick) -> no + " . " + tick).doOnNext(System.out::println);
    StepVerifier.create(stringFlux).expectSubscription().expectNextCount(10).verifyComplete();
  }

  @Test
  void testFlux6() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    Flux<Integer> flux01 = Flux.just(6, 7, 8);

    Flux<Integer> fromIterable = Flux.fromIterable(list);
    Flux<Integer> concatWith = fromIterable.concatWith(flux01);
    concatWith.subscribe(System.out::println);
  }

  @Test
  void testFlux7() {
    Flux<Integer> flux01 = Flux.error(new RuntimeException("Error Occurred"));
    Flux<Integer> flux02 = flux01.doOnComplete(() -> System.out.println("Inserted all records"));
    StepVerifier.
        create(flux02)
        .expectError(RuntimeException.class)
        .verify();

  }

  @Test
  void testFlux8() {

    Flux<String> stringFlux = Flux.just(1, 3, 5, 2, 4, 6, 11, 12, 13)
            .groupBy(i -> i % 2 == 0 ? "even" : "odd")
            .concatMap(g -> g.defaultIfEmpty(-1) //if empty groups, show them
            .map(String::valueOf) //map to string
            .startWith(g.key()));

    StepVerifier.create(stringFlux.log())
    .assertNext(x -> {
      assertEquals("odd", x);
    }).assertNext(x -> {
      assertEquals("1", x);
    }).assertNext(x -> {
      assertEquals("3", x);
    }).assertNext(x -> {
      assertEquals("5", x);
    }).assertNext(x -> {
      assertEquals("11", x);
    }).assertNext(x -> {
      assertEquals("13", x);
    }).assertNext(x -> {
      assertEquals("even", x);
    }).assertNext(x -> {
      assertEquals("2", x);
    }).assertNext(x -> {
      assertEquals("4", x);
    }).assertNext(x -> {
      assertEquals("6", x);
    }).assertNext(x -> {
      assertEquals("12", x);
    }).verifyComplete();


    StepVerifier.create(stringFlux.log()).assertNext(x -> {
      assertTrue(true);
    }).verifyComplete();
  }


  @Test
  void fluxTest09() {

    Function<String, Publisher<String>> mapper = s -> Flux.just(s.toUpperCase().split(""));

    Flux<String> inFlux = Flux.just("AB", "C", "DE");
    Flux<String> outFlux = inFlux.flatMap(mapper);


    StepVerifier.create(outFlux.log())
        .expectNext("A", "B", "C", "D", "E")
        .verifyComplete();
  }


  @Test
  public void fluxTest10() {
    List<Integer> list01 = List.of(1, 2, 3);

    Flux<Integer> flux = Flux.fromIterable(list01).defaultIfEmpty(4);

    StepVerifier.create(flux).assertNext(x -> {
      assertEquals(1, x);
    }).assertNext(x -> {
      assertEquals(2, x);
    }).assertNext(x -> {
      assertEquals(3, x);
    }).verifyComplete();
  }

  @Test
  void fluxTest12() {

    Function<String, Publisher<String>> mapper = s -> Flux.just(s.toUpperCase().split(""));

    Flux<String> flux = Flux.just("AB", "CD");
    Flux<String> stringFlux = flux.flatMap(mapper);

    StepVerifier.create(stringFlux.log())
        .expectNext("A", "B", "C", "D")
        .verifyComplete();
  }

  @Test
  public void fluxTest13() {
    Flux<String> flux01 = Flux.just("A", "B", "C").delayElements(Duration.ofSeconds(1));
    Flux<String> flux02 = Flux.just("X", "Y", "Z").delayElements(Duration.ofSeconds(1));

    Flux<String> combFlux = Flux.concat(flux01, flux02);
    Flux<String> log = combFlux.log();

    StepVerifier.create(log).expectNext("A", "B", "C", "X", "Y", "Z").verifyComplete();
  }

  @Test
  public void fluxTest14() {
    Flux<Integer> request = Flux.range(1, 10);
    request.subscribe(System.out::println);

    StepVerifier.create(request).expectSubscription()
        .expectNext(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .expectComplete()
        .verify(Duration.ofSeconds(1));
  }
  @Test
  public void fluxTest15() {
    Mono<Integer> mono01 = Mono.just(1);
    Mono<Integer> mono02 = Mono.just(2);
    Mono<Integer> mono03 = Mono.just(3);
    Mono<Integer> mono04 = Mono.just(4);
    Mono<Integer> mono05 = Mono.just(5);
    Mono<Integer> mono06 = Mono.just(6);
    Mono<Integer> mono07 = Mono.just(7);
    Mono<Integer> mono08 = Mono.just(8);
    Mono<Integer> mono09 = Mono.just(9);
    Mono<Integer> mono10 = Mono.just(10);

    Flux<Integer> fluxConcat = Flux.concat(mono01, mono02, mono03, mono04, mono05, mono06, mono07, mono08, mono09, mono10);

    Flux<Integer> flux = Flux.concat(fluxConcat);

    StepVerifier.create(flux)
        .expectSubscription()
        .expectNext(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .expectComplete()
        .verify(Duration.ofSeconds(1));

  }


  @Test
  public void fluxTest16() {
    Mono<Integer> mono01 = Mono.just(1);
    Mono<Integer> mono02 = Mono.just(2);
    Mono<Integer> mono03 = Mono.just(3);
    Mono<Integer> mono04 = Mono.just(4);
    Mono<Integer> mono05 = Mono.just(5);
    Mono<Integer> mono06 = Mono.just(6);
    Mono<Integer> mono07 = Mono.just(7);
    Mono<Integer> mono08 = Mono.just(8);
    Mono<Integer> mono09 = Mono.just(9);
    Mono<Integer> mono10 = Mono.just(10);
    List<Mono<Integer>> mono011 = List.of(mono01, mono02, mono03, mono04, mono05, mono06, mono07, mono08, mono09, mono10);

    Flux<Integer> flux = Flux.concat(mono011);

    StepVerifier.create(flux)
        .expectSubscription()
        .expectNext(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .expectComplete()
        .verify(Duration.ofSeconds(1));

  }


  @Test
  public void flux02() {
    Flux<String> stringFlux = Flux.fromStream(Stream.generate(() -> "Hello @" + Instant.now().toString()));
    Flux<Long> durationFlux = Flux.interval(Duration.ofSeconds(1));
    Flux<String> map = Flux.zip(stringFlux, durationFlux).map(Tuple2::getT1);
    String s = map.log().blockLast();
  }

}

class ReactiveFlux01 {

  @Test
  public void flux01() {

    Flux<String> flux = Flux.just("data1", "data2", "data3");

    flux.subscribe(data -> onNext(data), // onNext
                   err -> onError(err),  // onError
                   () -> onComplete() // onComplete
    );

  }

  private static <T> void onNext(T data) {
    System.out.println("onNext: Data received: " + data);
  }

  private static <T> void onError(Throwable err) {
    System.out.println("onError: Exception occurred: " + err.getMessage());
  }

  private static <T> void onComplete() {
    System.out.println("onComplete: Completed!");
  }

}

class ReactiveFlux02 {

  @Test
  public void flux01() {

    Flux<Integer> flux = Flux.just(1, 2, 3, 4, 5).log();
    flux.subscribe(new Subscriber<Integer>() {
      private Subscription s;
      private int onNextCount;

      private int onNextPull = 1;

      @Override
      public void onSubscribe(Subscription s) {
        this.s = s;
        s.request(onNextPull);
      }

      @Override
      public void onNext(Integer integer) {
        onNextCount++;
        if (onNextCount % onNextPull == 0) {
          s.request(onNextPull);
        }
      }

      @Override
      public void onError(Throwable t) {
      }

      @Override
      public void onComplete() {
      }
    });



  }


}


