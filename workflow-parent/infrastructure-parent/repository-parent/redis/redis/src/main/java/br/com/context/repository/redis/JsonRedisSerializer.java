package br.com.context.repository.redis;

import br.com.context.repository.redis.model.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.nio.charset.Charset;


public class JsonRedisSerializer implements RedisSerializer<Person> {

    private final Charset charset = Charset.forName("UTF8");

    private final String target = "\"";

    private final String replacement = "";

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public byte[] serialize(Person s) throws SerializationException {
        try {
            String s1 = objectMapper.writeValueAsString(s);
            return s1.getBytes(charset);
        } catch (JsonProcessingException e) {
            throw new SerializationException(e.getMessage(), e);
        }
    }

    @Override
    public Person deserialize(byte[] bytes) throws SerializationException {
        try {
            if ((bytes == null || bytes.length == 0))
                return null;

            return objectMapper.readValue(bytes, Person.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
