package br.com.context;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

import br.com.context.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

@SpringBootTest(classes = ApplicationSpringBoot.class,	webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void contextLoads() {
	}

	@Test
	void testWithWebTestClient() {
		WebTestClient.BodySpec<String, ?> hello_world = webTestClient
				.get().uri("/restfull")
				.exchange()
				.expectStatus().isOk()
				.expectBody(String.class).isEqualTo("OK");
		System.out.println(hello_world);
	}

	@Test
	void shouldGetPerson() {
		webTestClient.get().uri("/employees/1")
				.exchange()
				.expectStatus().isOk()
				.expectHeader().contentType(APPLICATION_JSON)
				.expectBody(Employee.class)
				.value(person -> person.getName(), equalTo("Employee 1"));
	}


	@Test
	void shouldBasicAuth() {
		webTestClient.post()
				.uri("/students")
				.headers(headers -> headers.setBasicAuth("admin", "adminpwd"))
				.body(Mono.just("message"), String.class);



		webTestClient.post().uri("/students")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.body(Mono.just("message"), String.class)
				.exchange()
				.expectStatus().isOk()
				.expectHeader().contentType(MediaType.APPLICATION_JSON)
				.expectBody()
				.jsonPath("$.id").isNotEmpty()
				.jsonPath("$.name").isEqualTo("return")
				.jsonPath("$.address").isEqualTo("return");
	}

}
