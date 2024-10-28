package br.com.context;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import org.assertj.core.api.Assertions;
import org.springframework.http.ResponseEntity;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() {
        String result = this.restTemplate.getForObject("http://localhost:" + port + "/restfull", String.class);
        Assertions.assertThat(result).contains("OK");
    }

//    @Test
//    public void testReadTimeout() {
//        long startMillis = System.currentTimeMillis();
//
//        Throwable throwable = catchThrowable(() -> {
//            String url = "https://example.com:81";
//            restTemplate.getForObject(url, String.class);
//        });
//
//        long endMillis = System.currentTimeMillis();
//        System.out.println("Execution time: " + (endMillis - startMillis));
//
//        assertThat(throwable).hasRootCauseInstanceOf(ConnectException.class);
//    }

    @Test
    public void testReadTimeout3() {
        Map<String, String> vars = new HashMap<>();
        vars.put("hotel", "42");
        vars.put("booking", "21");
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://example.com/hotels/{hotel}/bookings/{booking}", String.class, vars);
        assertNotNull(forEntity);
    }
}
