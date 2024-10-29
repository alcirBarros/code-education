package br.com.context.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
@Order(Ordered.LOWEST_PRECEDENCE)
public class ProjectConfig {

    static final Logger LOGGER = LoggerFactory.getLogger(ProjectConfig.class);

    @Value("${server.application.name:}")
    private String applicationName;

    @Value("${spring.profiles.active:}")
    private String[] activeProfileArray;

    @Value("${info.app.version:}")
    private String version;

    @Value("${server.port:}")
    private String serverPort;

    @PostConstruct
    void started() {
        logView();
    }

    public void logView() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append("----------------------------------------------------------").append("\n");
        stringBuilder.append("  Application:        ").append(applicationName).append("\n");
        stringBuilder.append("  Version:            ").append("\"").append(version).append("\"").append("\n");
        stringBuilder.append("  Swagger:            ").append("http://localhost:").append(serverPort).append("\n");
        stringBuilder.append("  Active Profile(s):  ").append(Arrays.toString(activeProfileArray)).append("\n");
        stringBuilder.append("----------------------------------------------------------").append("\n");
        LOGGER.info(stringBuilder.toString());
    }
}
