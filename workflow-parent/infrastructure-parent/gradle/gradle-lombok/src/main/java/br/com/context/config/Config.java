package br.com.context.config;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
@RequiredArgsConstructor
public class Config {

    @PostConstruct
    private void setup(){
        log.info("Consumer topic");
    }
}
