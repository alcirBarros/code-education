package br.com.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ApplicationSpringBootTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void mustConnectDatabase() {
        Flux<String> flux = Flux.just("API Rest", "Spring Boot", "Deploy");
    }

}
