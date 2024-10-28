//package br.com.context.config.amazon.s3.config;
//
//import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Log4j2
//@Configuration
//public class AmazonS3Config {
//
//    @Value("${cloud.aws.s3.endpoint:nul}")
//    private String endpoint;
//
//    @Value("${cloud.aws.s3.region:null}")
//    private String region;
//
//    @Bean
//    public EndpointConfiguration endpointConfiguration() {
//        return new EndpointConfiguration(endpoint, region);
//    }
//
//    @Bean
//    public AmazonS3 amazonS3(EndpointConfiguration endpointConfiguration) {
//        String serviceEndpoint = endpointConfiguration.getServiceEndpoint();
//        String signingRegion = endpointConfiguration.getSigningRegion();
//        log.info("Creating AmazonS3 with endpoint: {} and region: {}", serviceEndpoint, signingRegion);
//        AmazonS3ClientBuilder amazonS3ClientBuilder = AmazonS3ClientBuilder.standard();
//        amazonS3ClientBuilder.withEndpointConfiguration(endpointConfiguration);
//        amazonS3ClientBuilder.enablePathStyleAccess();
//        return amazonS3ClientBuilder.build();
//    }
//
//    @Bean
//    public AmazonS3 amazonS3AssumeRole() {
//        ProfileCredentialsProvider profileCredentialsProvider = new ProfileCredentialsProvider("default");
//        AWSSecurityTokenService awsSecurityTokenService = AWSSecurityTokenServiceClientBuilder.standard().withCredentials(profileCredentialsProvider).build();
//        AssumeRoleRequest roleRequest = new AssumeRoleRequest().withRoleArn("arn:aws:iam::1234567890987:role/super-role");
//        AssumeRoleResult roleResponse = awsSecurityTokenService.assumeRole(roleRequest);
//        Credentials credentials = roleResponse.getCredentials();
//
//        String accessKeyId = credentials.getAccessKeyId();
//        String secretAccessKey = credentials.getSecretAccessKey();
//        String sessionToken = credentials.getSessionToken();
//
//        BasicSessionCredentials basicSessionCredentials = new BasicSessionCredentials(accessKeyId, secretAccessKey, sessionToken);
//        AWSStaticCredentialsProvider awsStaticCredentialsProvider = new AWSStaticCredentialsProvider(basicSessionCredentials);
//
//        AmazonS3ClientBuilder amazonS3ClientBuilder = AmazonS3ClientBuilder.standard();
//        amazonS3ClientBuilder.setCredentials(awsStaticCredentialsProvider);
//        return amazonS3ClientBuilder.build();
//    }
//}
