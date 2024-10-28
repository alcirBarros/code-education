package br.com.repository.initialize;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"evento-automatico"})
public class Initialize implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    
    }
}
