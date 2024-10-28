//package br.com.amazon;
//
//import com.amazonaws.services.sqs.AmazonSQS;
//import com.amazonaws.services.sqs.AmazonSQSAsync;
//import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;
//import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
//import com.amazonaws.services.sqs.model.CreateQueueRequest;
//import com.amazonaws.services.sqs.model.MessageAttributeValue;
//import com.amazonaws.services.sqs.model.SendMessageRequest;
//import com.amazonaws.services.sqs.model.SendMessageResult;
//import org.junit.jupiter.api.Test;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.testcontainers.containers.localstack.LocalStackContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import org.testcontainers.utility.DockerImageName;
//
//import java.util.Collections;
//import java.util.Map;
//
//import static org.testcontainers.containers.localstack.LocalStackContainer.Service.SQS;
//
//@Testcontainers
//public class LocalStackBugTest {
//
//    @Container
//    public static LocalStackContainer localstack = new LocalStackContainer(DockerImageName.parse("localstack/localstack:0.11.3"))
//            .withServices(SQS);
//
//
//    @DynamicPropertySource
//    static void setup(DynamicPropertyRegistry registry) {
//
//        AmazonSQS amazonSQS = AmazonSQSClientBuilder.standard()
//                .withEndpointConfiguration(localstack.getEndpointConfiguration(LocalStackContainer.Service.SQS))
//                .withCredentials(localstack.getDefaultCredentialsProvider())
//                .build();
//
//        amazonSQS.createQueue("demoQueue");
//
//        registry.add("cloud.aws.credentials.access-key", localstack::getAccessKey);
//        registry.add("cloud.aws.credentials.secret-key", localstack::getSecretKey);
//        registry.add("cloud.aws.region.static", localstack::getRegion);
//        registry.add("cloud.aws.sqs.endpoint", localstack.getEndpointConfiguration(LocalStackContainer.Service.SQS)::getServiceEndpoint);
//    }
//
//    @Test
//    public void testSingleWebhook() {
//
//        AmazonSQSAsync amazonSQSClient = AmazonSQSAsyncClientBuilder
//                .standard()
//                .withCredentials(localstack.getDefaultCredentialsProvider())
//                .withEndpointConfiguration(localstack.getEndpointConfiguration(SQS))
//                .build();
//
//        //create queue
//        amazonSQSClient.createQueue(new CreateQueueRequest()
//                .withQueueName("localstack-que")
//                .withAttributes(Collections.singletonMap("VisibilityTimeout", "1")));
//
//
//        MessageAttributeValue messageAttributeValue = new MessageAttributeValue().withStringValue("1614717037").withDataType("java.lang.Long");
//
//        Map<String, MessageAttributeValue> timestamp = Collections.singletonMap("timestamp", messageAttributeValue);
//
//        SendMessageRequest sendMessageRequest = new SendMessageRequest()
//                .withQueueUrl(amazonSQSClient.getQueueUrl("localstack-que").getQueueUrl())
//                .withMessageAttributes(timestamp)
//                .withMessageBody("from-integration-test");
//
//
//        SendMessageResult sendMessageResult = amazonSQSClient.sendMessage(sendMessageRequest);
//
//        System.out.println(sendMessageResult);
//    }
//}
//
