package br.com.restfull.api.controller;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PessoaControllerTest {

    @LocalServerPort
    private int port;

    private static URL base;

    @Autowired
    private TestRestTemplate template;

    @BeforeEach
    public void setUp() throws MalformedURLException {
       base = new URL("http://localhost:" + port + "/operador");
    }

    @Test
    public void getHello()  {
        ResponseEntity response = template.getForEntity(base.toString(), String.class);
        Object body = response.getBody();
        //  assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!");
    }
}
