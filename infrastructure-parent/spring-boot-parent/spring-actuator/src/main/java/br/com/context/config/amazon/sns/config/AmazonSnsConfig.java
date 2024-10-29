//package br.com.context.config.amazon.sns.config;
//
//import com.amazonaws.services.sns.AmazonSNS;
//import com.amazonaws.services.sns.AmazonSNSClientBuilder;
//import com.amazonaws.services.sns.model.Topic;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.annotation.PostConstruct;
//
//@Configuration
//@PropertySource(value = {"classpath:application-aws.properties"})
//public class AmazonSnsConfig {
//
//    @Value("${cloud.aws.sns.arn}")
//    private String amazonSNSArn;
//
//    @PostConstruct
//    private void init(){
//        System.out.println("");
//    }
//
//    @Bean
//    public AmazonSNS amazonSns() {
//        AmazonSNSClientBuilder amazonSNSClientBuilder = AmazonSNSClientBuilder.standard();
//        return amazonSNSClientBuilder.build();
//    }
//
//    @Bean
//    public Topic TopicSns() {
//       return new Topic().withTopicArn(amazonSNSArn);
//    }
//}
