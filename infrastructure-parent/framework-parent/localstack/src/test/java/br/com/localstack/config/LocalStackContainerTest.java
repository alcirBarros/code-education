package br.com.localstack.config;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
public abstract class LocalStackContainerTest {

    static DockerImageName dockerImageName = DockerImageName.parse("localstack/localstack:0.11.3");

    @Container
    public static LocalStackContainer localStack = new LocalStackContainer(dockerImageName)
            .withServices(LocalStackContainer.Service.S3)
            .waitingFor(Wait.forLogMessage(".*Ready.*", 1));

    @TestConfiguration
    public static class AmazonStorageS3ConfigTest {

        @Bean
        AmazonS3 amazonS3() {
            AwsClientBuilder.EndpointConfiguration endpointConfiguration = localStack.getEndpointConfiguration(LocalStackContainer.Service.S3);
            AWSCredentialsProvider awsCredentialsProvider = localStack.getDefaultCredentialsProvider();
            AmazonS3ClientBuilder amazonS3ClientBuilder = AmazonS3ClientBuilder.standard();
            amazonS3ClientBuilder.withEndpointConfiguration(endpointConfiguration);
            amazonS3ClientBuilder.withCredentials(awsCredentialsProvider);
            return amazonS3ClientBuilder.build();
        }
    }
}
