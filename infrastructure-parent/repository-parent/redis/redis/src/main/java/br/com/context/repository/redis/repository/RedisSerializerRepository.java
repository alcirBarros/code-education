package br.com.context.repository.redis.repository;

import br.com.context.repository.redis.model.Person;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.time.Duration;
import java.util.Optional;

@Repository
public class RedisSerializerRepository {

    private final RedisTemplate<String, Person> stringRedisTemplate;

    public RedisSerializerRepository(RedisTemplate<String, Person> stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    public void save(Person person) {
        stringRedisTemplate.opsForValue().set(person.getId(), person, Duration.ofSeconds(20));
    }

    public Optional<Person> findById(String key) {
        Person person = stringRedisTemplate.opsForValue().get(key);
        return Optional.ofNullable(person);
    }

}
