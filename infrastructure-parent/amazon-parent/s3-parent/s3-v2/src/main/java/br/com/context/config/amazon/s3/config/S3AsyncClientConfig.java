package br.com.context.config.amazon.s3.config;

import java.net.URI;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3AsyncClient;
import software.amazon.awssdk.services.s3.S3AsyncClientBuilder;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.S3ClientBuilder;

@Log4j2
@Configuration
public class S3AsyncClientConfig {

  @Value("${cloud.aws.credentials.accessKey}")
  private String accessKey;

  @Value("${cloud.aws.credentials.secretKey}")
  private String secretKey;

  @Value("${cloud.aws.s3.endpoint:nul}")
  private String endpoint;

  @Value("${cloud.aws.s3.region:null}")
  private String region;


  @Bean
  public AwsCredentialsProvider awsCredentialsProvider() {
    AwsBasicCredentials awsCredentials = AwsBasicCredentials.create(accessKey, secretKey);
    return StaticCredentialsProvider.create(awsCredentials);
  }

  @Bean
  public S3AsyncClient s3AsyncClient() {
    log.info("Creating S3AsyncClient with endpoint: {} and region: {}", endpoint, region);
    S3AsyncClientBuilder s3AsyncClientBuilder = S3AsyncClient.builder();
    s3AsyncClientBuilder.region(Region.of(region));
    s3AsyncClientBuilder.endpointOverride(URI.create(endpoint));
    return s3AsyncClientBuilder.build();
  }

  @Bean
  public S3Client s3Client(AwsCredentialsProvider awsCredentialsProvider) {
    log.info("Creating s3Client with endpoint: {} and region: {}", endpoint, region);
    S3ClientBuilder s3ClientBuilder = S3Client.builder();
    s3ClientBuilder.region(Region.of(region));
    s3ClientBuilder.endpointOverride(URI.create(endpoint));
    s3ClientBuilder.credentialsProvider(awsCredentialsProvider);
    return s3ClientBuilder.build();
  }

}
