package br.com.context;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestTemplateTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @LocalServerPort
    private String port;

    @Test
    public void mustReturnSuccess() {
        long startMillis = System.currentTimeMillis();
        ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/restfull", String.class);
        long endMillis = System.currentTimeMillis();
        System.out.println("Execution time: " + (endMillis - startMillis));
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        String body = responseEntity.getBody();
        assertEquals("OK", body);
    }

//    @Test
//    public void teste002() {
//
//        String rootUri = testRestTemplate.getRootUri();
//        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(rootUri);
//        UriComponentsBuilder filter = uriComponentsBuilder.queryParam("g-recaptcha-response","03ANYolqvm9Q12X1pIeZafe58WYGe_53ndypNGb_YpUxaLqBODRUHg3VzkR4DHbZbr15z8VQMUV88f4oOS03zAF4oQg3UUVnzbWgjhRXeM9kBscNEpjXYJT0JKqQiwixiND7Eksb-Xjdqb8q_dz23e1tFY8hiiV_jeAJGSXDMTYXf3ic8iB9YPbnAwZRoxJ43U8M6hZru4lZ3JhiKIY6jqteemR7VEmFPfKmu8JHurFDn0xgnbh7ldlh1R3Uj8aj2qnXUIlnE0kUpXX6WsnIM5oVSghqEZqJ9BZz2ecqjwy50Gq99yoVHzIvB6R2Tv4hP59aStaNm33D9_vXsIZaE1f11dEaJwnt8MweJnJosOMhYNidJ9-C8UTusC9ZZsSLDUX94jbGAnzmG-8mu6amYH9MJRxQ-qTSW7uUWLIEFScX6ld3JOu6OhF88MzdCgGS8cGpnST-1uuclhS7sv3r4-RY_vfKZuKvi39s3yeAd1NlV3Z6J_32xaXyC3JJFjqtC-0x-CXJEPy-kJ");
//        UriComponents encode = filter.build().encode();
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED.toString());
//
//        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
//        body.add("name", "feature");
//        body.add("color", "#5843AD");
//
//        HttpEntity formEntity = new HttpEntity(body, headers);
//        ResponseEntity<String> responseEntity = testRestTemplate.exchange(encode.toUri(), HttpMethod.POST, formEntity, String.class);
//        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//    }

    @Test
    public void isCaptchaValid() {
        String url = "https://www.google.com/recaptcha/api/siteverify?secret=6LcBMQQcAAAAALEYzj3BxZXWWzA2wbXWyqRhFBDJ&response=" + "03ANYolqvm9Q12X1pIeZafe58WYGe_53ndypNGb_YpUxaLqBODRUHg3VzkR4DHbZbr15z8VQMUV88f4oOS03zAF4oQg3UUVnzbWgjhRXeM9kBscNEpjXYJT0JKqQiwixiND7Eksb-Xjdqb8q_dz23e1tFY8hiiV_jeAJGSXDMTYXf3ic8iB9YPbnAwZRoxJ43U8M6hZru4lZ3JhiKIY6jqteemR7VEmFPfKmu8JHurFDn0xgnbh7ldlh1R3Uj8aj2qnXUIlnE0kUpXX6WsnIM5oVSghqEZqJ9BZz2ecqjwy50Gq99yoVHzIvB6R2Tv4hP59aStaNm33D9_vXsIZaE1f11dEaJwnt8MweJnJosOMhYNidJ9-C8UTusC9ZZsSLDUX94jbGAnzmG-8mu6amYH9MJRxQ-qTSW7uUWLIEFScX6ld3JOu6OhF88MzdCgGS8cGpnST-1uuclhS7sv3r4-RY_vfKZuKvi39s3yeAd1NlV3Z6J_32xaXyC3JJFjqtC-0x-CXJEPy-kJ";
        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity(url, null, String.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }



//    @Test
//    public void uploadFromFile() {
//        File file = new File("/tmp/file.text");
//        MultipartBodyBuilder builder = new MultipartBodyBuilder();
//        builder.part("file", new FileSystemResource(file));
//        MultiValueMap<String, HttpEntity<?>> build = builder.build();
//        HttpEntity formEntity = new HttpEntity(build);
//        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity("/restfull", formEntity, String.class);
//        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//    }


//    @Test
//    void whenUploadSingleFile_thenSuccess() throws Exception {
//        byte[] data = Files.readAllBytes(Paths.get("src/test/resources/testimage1.png"));
//        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity("/restfull", data, String.class);
//        HttpStatus statusCode = responseEntity.getStatusCode();
//        assertEquals(HttpStatus.CREATED, statusCode);
//    }
}
