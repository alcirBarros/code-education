package br.com.context.config.amazon.sqs.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.config.QueueMessageHandlerFactory;
import org.springframework.cloud.aws.messaging.config.SimpleMessageListenerContainerFactory;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.handler.annotation.support.PayloadMethodArgumentResolver;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.Collections;

import static com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;


@Configuration
public class AmazonSqsConfig {

    @Value("${cloud.aws.sqs.endpoint}")
    private String endpoint;

    @Value("${cloud.aws.sqs.region}")
    private String region;

    @Bean
    public AmazonSQSAsync amazonSQS() {
        AmazonSQSAsyncClientBuilder amazonSQSAsyncClientBuilder = AmazonSQSAsyncClientBuilder.standard();
        amazonSQSAsyncClientBuilder.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpoint, region));
        return amazonSQSAsyncClientBuilder.build();
    }

    @Bean
    public QueueMessagingTemplate queueMessagingTemplate(AmazonSQSAsync amazonSQSAsync) {
        return new QueueMessagingTemplate(amazonSQSAsync);
    }


//    @Bean
//    public AmazonSQS amazonSqs() {
//        AmazonSQSClientBuilder amazonSQSClientBuilder = AmazonSQSClientBuilder.standard();
//        return amazonSQSClientBuilder.build();
//    }

//    @Bean
//    public QueueMessagingTemplate queueMessagingTemplate(AmazonSQSAsync amazonSQSAsync) {
//        return new QueueMessagingTemplate(amazonSQSAsync);
//    }

//    @Bean
//    public QueueMessageHandlerFactory queueMessageHandlerFactory(MessageConverter messageConverter) {
//        var factory = new QueueMessageHandlerFactory();
//        factory.setArgumentResolvers(List.of(new NotificationMessageArgumentResolver(messageConverter)));
//        return factory;
//    }

    @Bean
    public QueueMessageHandlerFactory queueMessageHandlerFactory() {
        QueueMessageHandlerFactory factory = new QueueMessageHandlerFactory();
        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
        messageConverter.setStrictContentTypeMatch(false);
        factory.setArgumentResolvers(Collections.singletonList(new PayloadMethodArgumentResolver(messageConverter)));
        return factory;
    }

//    @Bean
//    protected MessageConverter messageConverter() {
//        var converter = new MappingJackson2MessageConverter();
//        converter.setSerializedPayloadClass(String.class);
//        converter.setStrictContentTypeMatch(false);
//        return converter;
//    }

//    @Bean
//    public Jackson2ObjectMapperBuilder jacksonBuilder() {
//        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
//        // builder.indentOutput(true).dateFormat(new
//        // SimpleDateFormat("yyyy-MM-dd"));
//        builder.indentOutput(true).serializationInclusion(JsonInclude.Include.NON_NULL);
//        return builder;
//    }


//    @Bean
//    public SimpleMessageListenerContainerFactory simpleMessageListenerContainerFactory(AmazonSQSAsync amazonSqs) {
//        SimpleMessageListenerContainerFactory factory = new SimpleMessageListenerContainerFactory();
//        factory.setAmazonSqs(amazonSqs);
//        factory.setAutoStartup(true);
//        factory.setMaxNumberOfMessages(10);
//        factory.setWaitTimeOut(10);
//        factory.setBackOffTime(Long.valueOf(2000));
//        return factory;
//    }

//    @Bean
//    public SimpleMessageListenerContainerFactory simpleMessageListenerContainerFactory(AmazonSQSAsync amazonSQSAsync) {
//        SimpleMessageListenerContainerFactory factory = new SimpleMessageListenerContainerFactory();
//        factory.setAmazonSqs(amazonSQSAsync);
//        factory.setAutoStartup(true);
//        factory.setMaxNumberOfMessages(10);
//        factory.setWaitTimeOut(10);
//        factory.setTaskExecutor(createDefaultTaskExecutor());
//        return factory;
//    }


//
//    protected AsyncTaskExecutor createDefaultTaskExecutor() {
//        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
//        threadPoolTaskExecutor.setThreadNamePrefix("SQSExecutor - ");
//        threadPoolTaskExecutor.setCorePoolSize(100);
//        threadPoolTaskExecutor.setMaxPoolSize(100);
//        threadPoolTaskExecutor.setQueueCapacity(2);
//        threadPoolTaskExecutor.afterPropertiesSet();
//        return threadPoolTaskExecutor;
//    }


//    @Value("${cloud.aws.region.static}")
//    private String region;
//
//    @Value("${cloud.aws.sqs.endpoint}")
//    private String localStackSnsUrl;


//    @Bean
//    public EndpointConfiguration amazonSQSAsyncs() {
//        return new EndpointConfiguration(localStackSnsUrl, region);
//    }
//
//    @Bean
//    @Primary
//    public AmazonSQSAsync amazonSQSAsync(EndpointConfiguration endpointConfiguration1) {
//        AmazonSQSAsyncClientBuilder standard = AmazonSQSAsyncClientBuilder.standard();
//        standard.withEndpointConfiguration(endpointConfiguration1);
//        return standard.build();
//    }
}
