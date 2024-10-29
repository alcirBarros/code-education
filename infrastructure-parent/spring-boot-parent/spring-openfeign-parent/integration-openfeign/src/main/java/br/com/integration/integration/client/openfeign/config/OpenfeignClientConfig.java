package br.com.integration.integration.client.openfeign.config;


import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;

public class OpenfeignClientConfig {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        String client_id = "eyJpZCI6ImI5ZWQ3MmItNjliZS00NDQzLSIsImNvZGlnb1B1YmxpY2Fkb3IiOjAsImNvZGlnb1NvZnR3YXJlIjoxMDM4Niwic2VxdWVuY2lhbEluc3RhbGFjYW8iOjF9";
        String client_secret = "eyJpZCI6IjIyYWVlMmYtNDZhYy00Yzk0LTlhMTItOWZiNzY2ODUzYzJiNWIxNTBmNWItYWYiLCJjb2RpZ29QdWJsaWNhZG9yIjowLCJjb2RpZ29Tb2Z0d2FyZSI6MTAzODYsInNlcXVlbmNpYWxJbnN0YWxhY2FvIjoxLCJzZXF1ZW5jaWFsQ3JlZGVuY2lhbCI6MSwiYW1iaWVudGUiOiJob21vbG9nYWNhbyIsImlhdCI6MTU3MDEzNzI2NjExNn0";
        return new BasicAuthRequestInterceptor(client_id, client_secret);
    }

}
