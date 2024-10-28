package br.com.context.config.amazon.sns.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.Topic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AmazonSnsConfig {

    @Value("${cloud.aws.sns.arn}")
    private String amazonSNSArn;

    @Value("${cloud.aws.region.static}")
    private String region;

    @Value("${cloud.aws.sqs.endpoint}")
    private String localStackSnsUrl;


//    @Bean
//    public AmazonSNSClient amazonSNSClient() {
//
//        EndpointConfiguration endpointConfiguration = new EndpointConfiguration(localStackSnsUrl, region);
//
//        return (AmazonSNSClient) AmazonSNSClientBuilder
//                .standard()
//                .withRegion(region)
//                .withEndpointConfiguration(endpointConfiguration)
//                .withCredentials(new AWSStaticCredentialsProvider( new BasicAWSCredentials(awsAccessKey, awsSecretKey)))
//                .build();
//    }

//    @Bean
//    public AmazonSNS amazonSNS() {
//        return AmazonSNSClient.builder()
//                .withEndpointConfiguration(new EndpointConfiguration("http://localhost:4566", "sa-east-1"))
//                .withCredentials(new AWSStaticCredentialsProvider( new BasicAWSCredentials("foo", "bar")))
//                .build();
//    }

//    @Bean
//    public AmazonSNS amazonSns() {
//        AmazonSNSClientBuilder amazonSNSClientBuilder = AmazonSNSClientBuilder.standard();
//        return amazonSNSClientBuilder.build();
//    }


    @Bean
    public AwsClientBuilder.EndpointConfiguration endpointConfiguration() {
        return new AwsClientBuilder.EndpointConfiguration(localStackSnsUrl, region);
    }

    @Bean
    @Primary
    public AmazonSNS amazonSNS(AwsClientBuilder.EndpointConfiguration endpointConfiguration1) {
        AmazonSNSClientBuilder amazonSNSClientBuilder = AmazonSNSClientBuilder.standard();
        amazonSNSClientBuilder.withEndpointConfiguration(endpointConfiguration1);
        return amazonSNSClientBuilder.build();
    }

    @Bean
    public Topic TopicSns() {
        Topic topic = new Topic();
        topic.withTopicArn(amazonSNSArn);
        return topic;
    }
}
