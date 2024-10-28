package br.com.webservice.configuracao.jersey.server;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Primary
@Configuration
@ApplicationPath("/webservice")
public class RestResourceConfig extends ResourceConfig {

    @PostConstruct
    public void init() {
        packages("br.com.webservice.services");
    }
}
