package br.com.context.amazon.s3.config;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import javax.annotation.PostConstruct;
import java.util.Map;

@Testcontainers
public abstract class LocalStackContainerTest {

    private static final String BUCKET_NAME = "order-event-test-bucket";

    static DockerImageName dockerImageName = DockerImageName.parse("localstack/localstack:0.11.3");

    @Container
    public static LocalStackContainer localStack = new LocalStackContainer(dockerImageName)
            .withServices(LocalStackContainer.Service.S3)
            //  .withClasspathResourceMapping("/localstack", "/docker-entrypoint-initaws.d", BindMode.READ_ONLY)
            .waitingFor(Wait.forLogMessage(".*Ready.*", 1));


    @TestConfiguration
    public static class AmazonStorageS3ConfigTest {

        @Value("#{${valuesMap}}")
        private Map<String, String> bucketMap;

        @PostConstruct
        void init() throws Exception {
            localStack.execInContainer("awslocal", "s3", "mb", "s3://" + BUCKET_NAME);
        }

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
