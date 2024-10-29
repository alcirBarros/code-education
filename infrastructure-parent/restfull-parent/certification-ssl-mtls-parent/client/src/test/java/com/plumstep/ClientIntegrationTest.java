package com.plumstep;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT, classes = {ClientApplication.class})
public class ClientIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testGet() {
        ResponseEntity<String> getResponse = testRestTemplate.getForEntity("https://localhost:8111/server/", String.class);
        assertEquals(HttpStatus.OK, getResponse.getStatusCode());
    }
}
