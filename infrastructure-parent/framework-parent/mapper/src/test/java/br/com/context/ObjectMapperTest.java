package br.com.context;

import br.com.context.model.Car;
import br.com.context.model.Person;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import java.time.format.DateTimeFormatter;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ObjectMapperTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void mustConvertToObjectMap() throws JsonProcessingException {
        String s = "{\"name\": \"educative\",\"website\": \"https://www.educative.io/\",\"description\": \"e-learning website\"}";
        Map map = objectMapper.readValue(s, Map.class);
        assertNotNull(map);
    }

    @Test
    public void mustConvertToObject() throws JsonProcessingException {

        JavaTimeModule javaTimeModule = new JavaTimeModule();
        javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSS")));

        ObjectMapper objectMapper = JsonMapper.builder()
            .addModule(javaTimeModule)
            .propertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .build();

        String s = "{\"create_data\":\"2023-10-03T12:45:43.09463\",   \"change_date\": \"2023-10-03T12:45:43.09464\", \"name\": \"eduardo\",\"phone\": \"999999999\",\"email\": \"email@email.com.br\"}";
        Person map = objectMapper.readValue(s, Entity.class);
        assertNotNull(map);



        Map<String, Object> stringStringMap = Map.of(
            "name", "eduardo",
            "phone", "999999999",
            "email", "email@email.com.br");

        String map_ = objectMapper.writeValueAsString(stringStringMap);
        Entity person = objectMapper.readValue(map_, Entity.class);

        assertNotNull(person);
    }



    @Test
    public void mustConvertToString() throws JsonProcessingException {

        Map<String, Object> stringStringMap = Map.of(
                "name", "educative",
                "website", "https://www.educative.io/",
                "date", new Date(),
                "localDateTime", LocalDateTime.now(),
                "localDate", LocalDate.now()
        );
        String map = objectMapper.writeValueAsString(stringStringMap);
        assertNotNull(map);

        Map map1 = objectMapper.readValue(map, Map.class);
        assertNotNull(map1);
    }

    @Test
    public void mustConvertToByteArray() throws IOException {
        Map<String, Object> map = Map.of(
                "name", "educative",
                "website", "https://www.educative.io/",
                "date", new Date()
        );
        byte[] byteArray = objectMapper.writeValueAsBytes(map);
        assertNotNull(byteArray);

        Map map1 = objectMapper.readValue(byteArray, Map.class);
        assertNotNull(map1);
    }

    @Test
    public void linkedHashMapTest() throws IOException {
        LinkedHashMap<String, Object> stringObjectLinkedHashMap = new LinkedHashMap<>();
        String map = objectMapper.writeValueAsString(stringObjectLinkedHashMap);
    }

    @Test
    public void test() throws IOException {
        Map map = objectMapper.readValue("{\"name\" : \"mkyong\"}", Map.class);
        assertNotNull(map);

        Map map1 = objectMapper.readValue(new URL("http://some-domains/api/name.json"), Map.class);
//        assertNotNull(map1);
//
//        Map map2 = objectMapper.readValue(new File("c:\\test\\staff.json"), Map.class);
//        assertNotNull(map2);
    }

//    @Test
//    public void whenGetCoffee_thenSerializedWithDateAndNonNull() {
//        String formattedDate = DateTimeFormatter.ofPattern(CoffeeConstants.dateTimeFormat).format(FIXED_DATE);
//        String brand = "Lavazza";
//        String url = "/coffee?brand=" + brand;
//
//        String response = restTemplate.getForObject(url, String.class);
//
//        assertThat(response).isEqualTo("{\"brand\":\"" + b'rand + "\",\"date\":\"" + formattedDate + "\"}");
//    }


    @Test
    public void mustConvertToObjectCar() throws JsonProcessingException {
        String s = "{\"brand\": \"educative\",\"doors\": \" 0 \"}";
        Car map = objectMapper.readValue(s, Car.class);
        assertNotNull(map);
    }




    @Getter
    @Setter
    private static class Entity extends Person {

        @JsonFormat
        @JsonAlias("create_data")
        protected LocalDateTime createD;

    }

}


