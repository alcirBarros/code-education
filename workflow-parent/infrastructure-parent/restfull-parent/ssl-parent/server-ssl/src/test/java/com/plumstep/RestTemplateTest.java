package com.plumstep;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestTemplateTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void mustReturnSuccess() {
        long startMillis = System.currentTimeMillis();
        ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/", String.class);
        long endMillis = System.currentTimeMillis();
        System.out.println("Execution time: " + (endMillis - startMillis));
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        String body = responseEntity.getBody();
        assertEquals("Success", body);
    }
}
