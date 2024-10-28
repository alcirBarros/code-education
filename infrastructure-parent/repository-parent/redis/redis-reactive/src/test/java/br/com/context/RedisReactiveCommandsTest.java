package br.com.context;

import static io.lettuce.core.SetArgs.Builder.ex;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.lettuce.core.KeyValue;
import io.lettuce.core.RedisClient;
import io.lettuce.core.api.reactive.RedisReactiveCommands;
import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RedisReactiveCommandsTest {

  @Autowired
  private RedisClient redisClient;
  protected RedisReactiveCommands<String, String> redisReactiveCommands;

  @BeforeEach
  public void setupRedisClient() {
    redisReactiveCommands = redisClient.connect().reactive();
  }

  @Test
  public void test01() {
    // vanilla get and set
    StepVerifier.create(redisReactiveCommands.set("some-key-1", "some-value-1"))
        .expectNextMatches("OK"::equals)
        .verifyComplete();
  }

  @Test
  public void test02() {
    StepVerifier.create(redisReactiveCommands.get("some-key-1"))
        .expectNextMatches("some-value-1"::equals)
        .verifyComplete();
  }

  @Test
  public void test03() {
    // adding an additional argument like nx will cause it to return nothing if it doesn't get set
    StepVerifier.create(redisReactiveCommands.set("some-key-1", "some-value-2",   ex(60)))
        .assertNext(x -> {
          assertEquals("OK", x);
        }).verifyComplete();
  }

  @Test
  public void test04() {
    // prove the value is the same
    StepVerifier.create(redisReactiveCommands.get("some-key-1"))
        .expectNextMatches("some-value-2"::equals)
        .verifyComplete();
  }

  @Test
  public void test05() {
    StepVerifier.create(redisReactiveCommands.del("some-key-1"))
        .expectNextCount(1)
        .verifyComplete();
  }

  @Test
  public void test06() {
    Map<String, String> stringStringMap = Map.of("key-1", "val-1", "key-2", "val-2", "key-3", "val-3");
    StepVerifier.create(redisReactiveCommands.mset(stringStringMap))
        .expectNextMatches("OK"::equals)
        .verifyComplete();
  }

  @Test
  public void test07() {
    Flux<KeyValue<String, String>> mgetValuesFlux = redisReactiveCommands.mget("key-1", "key-2");
    StepVerifier.create(mgetValuesFlux.collectList()).expectNextMatches(x -> {
      return true;
    }).verifyComplete();
  }

  @Test
  public void test08() {
    Flux<KeyValue<String, String>> mgetValuesFlux = redisReactiveCommands.mget("key-1", "key-2");
    mgetValuesFlux.subscribe(new Subscriber<KeyValue<String, String>>() {
      public void onSubscribe(Subscription s) {
        s.request(3);
      }

      @Override
      public void onNext(KeyValue<String, String> stringStringKeyValue) {
        System.out.println("Hello " + stringStringKeyValue.getKey() + "!");
      }

      public void onError(Throwable t) {
        System.out.println("onError: " + t);
      }

      public void onComplete() {
        System.out.println("Completed");
      }
    });
  }
}
