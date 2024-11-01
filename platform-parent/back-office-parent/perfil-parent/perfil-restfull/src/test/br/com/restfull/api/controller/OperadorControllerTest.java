package br.com.restfull.api.controller;


import br.com.restfull.RestFullApplication;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestFullApplication.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OperadorControllerTest {

    @LocalServerPort
    private int port;

    private static URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
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
