package br.com.context;

import static io.lettuce.core.SetArgs.Builder.ex;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RedisCommandsTest {
  @Autowired
  RedisClient redisClient;
  StatefulRedisConnection<String, String> statefulRedisConnection;
  RedisCommands<String, String> redisCommands;

  @BeforeEach
  void setupRedisClient() {
    statefulRedisConnection = redisClient.connect();
    redisCommands = statefulRedisConnection.sync();
  }

  @Test
  void test01() {
    String result = redisCommands.set("some-key-1", "some-value-1");
    assertEquals("OK", result);
  }

  @Test
  void test02() {
    String result = redisCommands.get("some-key-1");
    assertEquals("some-value-1", result);
  }

  @Test
  void test03() {
    String result = redisCommands.set("some-key-1", "some-value-2", ex(60));
    assertEquals("OK", result);
  }

  @Test
  void test04() {
    String result = redisCommands.get("some-key-1");
    assertEquals("some-value-2", result);
  }

  @Test
  void test05() {
    Long result = redisCommands.del("some-key-1");
    assertEquals(1L, result);
  }
}
