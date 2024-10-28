package br.com.context.controller;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import reactor.core.publisher.Mono;

@RestController()
@RequestMapping(value = "/restfull")
public class RestFullController {

    private static final String URL = "http://localhost:8080/restfull/slow-service-tweets";

    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    @GetMapping()
    private String get() throws Exception {
        Thread.sleep(2000L); // delay
        return "OK";
    }

    @GetMapping("/slow-service-tweets")
    private List<Tweet> getAllTweets() throws Exception {
        return Arrays.asList(
                new Tweet("RestTemplate rules", "@user1"),
                new Tweet("WebClient is better", "@user2"),
                new Tweet("OK, both are useful", "@user1"));
    }

    @GetMapping("/tweets-blocking")
    public List<Tweet> getTweetsBlocking() {
    //    log.info("Starting BLOCKING Controller!");


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Tweet>> response = restTemplate.exchange(URL, HttpMethod.GET, null,   new ParameterizedTypeReference<List<Tweet>>() { });

        List<Tweet> result = response.getBody();
        result.forEach(tweet ->
                System.out.println(tweet)
        );
    //    log.info("Exiting BLOCKING Controller!");
        return result;
    }

    @GetMapping(value = "/tweets-non-blocking", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tweet> getTweetsNonBlocking() {
        //  log.info("Starting NON-BLOCKING Controller!");
        Flux<Tweet> tweetFlux = WebClient.create()
                .get()
                .uri(URL)
                .retrieve()
                .bodyToFlux(Tweet.class);

        tweetFlux.subscribe(tweet ->
                System.out.println(tweet)
        );
        //    log.info("Exiting NON-BLOCKING Controller!");
        return tweetFlux;
    }


    @GetMapping("/test")
    public ResponseEntity<Mono<String>> test() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Mono.just("unauthorized"));
    }
}

