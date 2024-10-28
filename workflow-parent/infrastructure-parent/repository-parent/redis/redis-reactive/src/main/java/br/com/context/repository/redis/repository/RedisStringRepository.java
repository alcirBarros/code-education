//package br.com.context.repository.redis.repository;
//
//import br.com.context.repository.redis.model.Person;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public class RedisStringRepository {
//
//    private final RedisTemplate<String, String> stringRedisTemplate;
//
//    private final ObjectMapper objectMapper = new ObjectMapper();
//
//    public RedisStringRepository(RedisTemplate<String, String> stringRedisTemplate) {
//        this.stringRedisTemplate = stringRedisTemplate;
//    }
//
//    public void save(String key, Person person) throws JsonProcessingException {
//        String json = objectMapper.writeValueAsString(person);
//        stringRedisTemplate.opsForValue().set(key, json);
//    }
//
//    public Optional<Person> findById(String key) {
//        String json = stringRedisTemplate.opsForValue().get(key);
//        Person person = null;
//        try {
//            person = objectMapper.readValue(json, Person.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return Optional.ofNullable(person);
//    }
//
//}
