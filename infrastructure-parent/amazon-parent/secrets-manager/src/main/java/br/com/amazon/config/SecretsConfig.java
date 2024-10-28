package br.com.amazon.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecretsConfig {

    private String endpoint = "http://localhost:4566";

    private String region = "sa-east-1";

    @Bean
    public AWSSecretsManager secretsManager() {
        AWSSecretsManagerClientBuilder awsSecretsManagerClientBuilder = AWSSecretsManagerClientBuilder.standard();
        awsSecretsManagerClientBuilder.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpoint, region));
        return awsSecretsManagerClientBuilder.build();
    }

    @Bean
    public GetSecretValueResult getSecretValueResult(AWSSecretsManager awsSecretsManager) {
        GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest().withSecretId("my-secret-name");
        GetSecretValueResult secretValue = awsSecretsManager.getSecretValue(getSecretValueRequest);
        return secretValue;
    }

}
