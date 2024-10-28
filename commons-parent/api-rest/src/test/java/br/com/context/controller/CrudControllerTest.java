package br.com.context.controller;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.util.DefaultUriBuilderFactory;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CrudControllerTest {

  @Autowired
  private TestRestTemplate testRestTemplate;


  @Test
  public void getForObjectWithCustomUriTemplateHandler() {
    Map<String, String> uriVariables = new HashMap<>(2);
    uriVariables.put("hotel", "1");
    uriVariables.put("publicpath", "pics/logo.png");
    uriVariables.put("scale", "150x150");
    String url = "http://example.com/hotels/{hotel}/pic/{publicpath}/size/{scale}";
    String forObject = testRestTemplate.getForObject(url, String.class, uriVariables);
    System.out.println(forObject);
  }
}
