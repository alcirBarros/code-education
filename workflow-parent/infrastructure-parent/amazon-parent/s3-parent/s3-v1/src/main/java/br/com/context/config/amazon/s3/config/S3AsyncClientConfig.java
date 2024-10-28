//package br.com.context.config.amazon.s3.config;
//
//import java.net.URI;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import software.amazon.awssdk.regions.Region;
//import software.amazon.awssdk.services.s3.S3AsyncClient;
//import software.amazon.awssdk.services.s3.S3AsyncClientBuilder;
//
//@Log4j2
//@Configuration
//public class S3AsyncClientConfig {
//
//  @Value("${cloud.aws.s3.endpoint:nul}")
//  private String endpoint;
//
//  @Value("${cloud.aws.s3.region:null}")
//  private String region;
//
//  @Bean
//  public S3AsyncClient s3AsyncClient() {
//    log.info("Creating S3AsyncClient with endpoint: {} and region: {}", endpoint, region);
//    S3AsyncClientBuilder s3AsyncClientBuilder = S3AsyncClient.builder();
//    s3AsyncClientBuilder.region(Region.of(region));
//    s3AsyncClientBuilder.endpointOverride(URI.create(endpoint));
//    return s3AsyncClientBuilder.build();
//  }
//
//}
