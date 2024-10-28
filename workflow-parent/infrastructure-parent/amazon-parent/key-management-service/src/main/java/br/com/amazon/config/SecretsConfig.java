package br.com.amazon.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.kms.AWSKMSClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class SecretsConfig extends SecretInterface{

    private String endpoint = "http://localhost:4566";

    private String region = "sa-east-1";

    @Bean
    public AWSKMS secretsManager() {
        AWSKMSClientBuilder awskmsClientBuilder = AWSKMSClientBuilder.standard();
        awskmsClientBuilder.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpoint, region));
        return awskmsClientBuilder.build();
    }

    public void setup() {
        System.out.println("AAAAAAAA");
    }
}
