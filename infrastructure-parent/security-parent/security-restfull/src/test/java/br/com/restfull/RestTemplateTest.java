package br.com.restfull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser(username = "admin", roles="role-admin")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestTemplateTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void givenAuthRequestOnPrivateService_shouldSucceedWith200() throws Exception {
        TestRestTemplate testRestTemplate = this.testRestTemplate.withBasicAuth("spring", "secret");
        ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/private/hello", String.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

}
