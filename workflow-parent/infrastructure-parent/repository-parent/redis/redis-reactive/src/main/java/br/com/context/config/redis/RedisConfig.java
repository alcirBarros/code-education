package br.com.context.config.redis;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfig {

  @Bean()
  public RedisClient redisClient(RedisProperties redisProperties) {
    var builder = RedisURI.builder();
    builder.withHost(redisProperties.getHost());
    builder.withPort(redisProperties.getPort());
    RedisURI redisURI = builder.build();
    return RedisClient.create(redisURI);
  }

}
