package br.com.context.openai.property;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@Getter
//@ConfigurationProperties(prefix = "openai", ignoreInvalidFields = true)
@PropertySources({
        @PropertySource("classpath:application-openai.properties"),
        @PropertySource(value="file:abc.properties", ignoreResourceNotFound=true)
       // @PropertySource("classpath:/com/${my.placeholder:default/path}/app.properties")
})
public class OpenAiProperties {

    @Value("${openai.base.url:null}")
    private String baseUrl;

    @Value("${openai.config.path:null}")
    private String configPath;

    @Value("${openai.profile:null}")
    private String profile;

    @Value("${openai.config.user.home.path:null}")
    private String homePath;

}
