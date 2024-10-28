package br.com.context;

import br.com.context.controller.HttpBinResponse;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import reactor.core.publisher.Mono;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebClientTest {

    @Autowired
    private WebTestClient webTestClient;

    private WebClient webClient;


    @BeforeEach
    void beforeEach() {
        webClient = WebClient.builder().baseUrl("https://httpbin.org").codecs(clientCodecConfigurer -> {
            final Jackson2JsonEncoder jackson2JsonEncoder = new Jackson2JsonEncoder();
            jackson2JsonEncoder.setStreamingMediaTypes(List.of(MediaType.APPLICATION_JSON));
            clientCodecConfigurer.defaultCodecs().jackson2JsonEncoder(jackson2JsonEncoder);
        }).build();
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
    public void get() {

        Mono<List<HttpBinResponse>> udsLongTokenE86848BDF63044FA94E5219F81D3C36C = webClient.get()
            .uri("/json")
            .header(HttpHeaders.AUTHORIZATION, "UDSLongToken E86848BDF63044FA94E5219F81D3C36C")
            .retrieve()
            .bodyToFlux(HttpBinResponse.class)
            .collectList();

        List<HttpBinResponse> block = udsLongTokenE86848BDF63044FA94E5219F81D3C36C.block();

        System.out.println();
    }

    @Test
    public void post() {
        HttpBinResponse httpBinResponse = new HttpBinResponse();
        ResponseSpec retrieve = webClient.post()
            .uri("/post")
            .contentType(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .body(httpBinResponse, HttpBinResponse.class)
            .retrieve();
    }


    @Test
    public void fromFormData() throws URISyntaxException {
        MultiValueMap<String, String> bodyValues = new LinkedMultiValueMap<>();

        bodyValues.add("key", "value");
        bodyValues.add("another-key", "another-value");

        String response = webClient.post()
            .uri(new URI("https://httpbin.org/post"))
            .header("Authorization", "Bearer MY_SECRET_TOKEN")
            .contentType(MediaType.APPLICATION_FORM_URLENCODED)
            .accept(MediaType.APPLICATION_JSON)
            .body(BodyInserters.fromFormData(bodyValues))
            .retrieve()
            .bodyToMono(String.class)
            .block();
    }
}
