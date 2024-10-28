package br.com.context.configuracao;

import br.com.context.ApplicationSpringBoot;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class PropertiesConfig {

    private static Log logger = LogFactory.getLog(ApplicationSpringBoot.class);

    @Value("${properties.location:}")
    private String propertiesLocation;

    @PostConstruct
    private void init() {
        logger.debug(propertiesLocation);
    }
}
