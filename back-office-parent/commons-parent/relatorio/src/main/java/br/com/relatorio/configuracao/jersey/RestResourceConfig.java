package br.com.relatorio.configuracao.jersey;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Primary
@Configuration
@ApplicationPath("/webservice")
public class RestResourceConfig extends ResourceConfig {

    public RestResourceConfig() {
        packages("br.com.relatorio.webservice");
    }
}
