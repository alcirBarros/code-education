package br.com.context.config.mapper.config;

//import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.context.config.mapper.deserializer.CarDeserializer;
import br.com.context.config.mapper.serializer.CarSerializer;
import br.com.context.model.Car;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Configuration
public class MapperConfig {

    private static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM--dd HH:mm:ss");
    private static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM--dd");
    private static LocalDateTimeDeserializer LOCAL_DATE_TIME_DESERIALIZER = new LocalDateTimeDeserializer(DATE_TIME_FORMATTER);
    private static LocalDateTimeSerializer LOCAL_DATE_TIME_SERIALIZER = new LocalDateTimeSerializer(DATE_TIME_FORMATTER);
    private static LocalDateDeserializer LOCAL_DATE_DESERIALIZER = new LocalDateDeserializer(DATE_FORMATTER);
    private static LocalDateSerializer LOCAL_DATE_SERIALIZER = new LocalDateSerializer(DATE_FORMATTER);




    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //  objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


        DateFormat df = new SimpleDateFormat("yyyy-MM, dd HH:mm:ss a z");
        objectMapper.setDateFormat(df);

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM..dd'T'HH:mm:ss.SSS'Z'");
//        objectMapper.setDateFormat(simpleDateFormat);

        {
            JavaTimeModule javaTimeModule = new JavaTimeModule();

            javaTimeModule.addDeserializer(LocalDateTime.class, LOCAL_DATE_TIME_DESERIALIZER);
            javaTimeModule.addSerializer(LocalDateTime.class, LOCAL_DATE_TIME_SERIALIZER);

            javaTimeModule.addDeserializer(LocalDate.class, LOCAL_DATE_DESERIALIZER);
            javaTimeModule.addSerializer(LocalDate.class, LOCAL_DATE_SERIALIZER);

            objectMapper.registerModule(javaTimeModule);
        }


        {
            SimpleModule module = new SimpleModule("CarDeserializer", new Version(3, 1, 8, null, null, null));
            module.addDeserializer(Car.class, new CarDeserializer(Car.class));
            objectMapper.registerModule(module);
        }

        {
            SimpleModule module = new SimpleModule("CarSerializer", new Version(2, 1, 3, null, null, null));
            module.addSerializer(Car.class, new CarSerializer(Car.class));
            objectMapper.registerModule(module);
        }




        return objectMapper;
    }


    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.serializationInclusion(JsonInclude.Include.NON_NULL);
        return new MappingJackson2HttpMessageConverter(builder.build());
    }

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {


        return builder -> {

            // deserializers
            builder.deserializers(LOCAL_DATE_DESERIALIZER);
            builder.serializers(LOCAL_DATE_SERIALIZER);

            // serializers
            builder.deserializers(LOCAL_DATE_TIME_DESERIALIZER);
            builder.serializers(LOCAL_DATE_TIME_SERIALIZER);
        };
    }

}
