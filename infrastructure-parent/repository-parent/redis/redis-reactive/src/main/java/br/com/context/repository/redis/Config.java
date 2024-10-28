//package br.com.context.repository.redis;
//
//import br.com.context.repository.redis.model.Person;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//@Configuration
//@EnableRedisRepositories(basePackages = "br.com.redis.model", keyspaceConfiguration = RedisKeySpaceConfig.class)
//public class Config {
//
//    @Bean
//    public RedisStandaloneConfiguration redisStandaloneConfiguration() {
//        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
//        config.setHostName("localhost");
//        config.setPort(6379);
//        return config;
//    }
//
//    @Bean
//    JedisConnectionFactory jedisConnectionFactory(RedisStandaloneConfiguration redisStandaloneConfiguration) {
//        return new JedisConnectionFactory(redisStandaloneConfiguration);
//    }
//
//    @Bean
//    public RedisTemplate<String, Person> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        RedisTemplate<String, Person> redisTemplate = new RedisTemplate();
//        redisTemplate.setConnectionFactory(redisConnectionFactory);
//
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//    //    redisTemplate.setValueSerializer(new JsonRedisSerializer());
//        return redisTemplate;
//    }
//
//}
