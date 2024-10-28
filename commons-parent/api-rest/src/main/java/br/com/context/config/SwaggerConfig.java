package br.com.context.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:config/application-swagger.properties"})
public class SwaggerConfig {

//    @Bean
//    public GroupedOpenApi publicApi() {
//
//        String packagesToscan[] = {"br.com.context"};
//
//        return GroupedOpenApi.builder()
//                .group("springshop-public")
//                .packagesToScan(packagesToscan)
//                .build();
//    }
//
//    @Bean
//    public OpenAPI springShopOpenAPI() {
//        return new OpenAPI()
//                .info(new Info().title("SpringShop API")
//                        .description("Spring shop sample application")
//                        .version("v0.0.1")
//                        .license(new License().name("Apache 2.0").url("https://springdoc.org")))
//                .externalDocs(new ExternalDocumentation()
//                        .description("SpringShop Wiki Documentation")
//                        .url("https://springshop.wiki.github.org/docs"));
//    }

}
