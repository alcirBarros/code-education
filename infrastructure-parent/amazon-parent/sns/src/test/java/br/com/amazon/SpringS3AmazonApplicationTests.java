package br.com.amazon;


import br.com.context.SpringSnsAmazonApplication;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.util.Topics;
import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.api.model.PortBinding;
import com.github.dockerjava.api.model.Ports;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.io.IOException;
import java.util.Map;

@Testcontainers
@SpringBootTest(classes = SpringSnsAmazonApplication.class)
public class SpringS3AmazonApplicationTests {

    private static DockerImageName localstackImage = DockerImageName.parse("localstack/localstack:0.11.3");

    @Container
    static LocalStackContainer container = new LocalStackContainer(localstackImage)
            .withServices(LocalStackContainer.Service.SNS)
            .withCreateContainerCmdModifier(cmd -> cmd.withHostConfig(
                    new HostConfig().withPortBindings(new PortBinding(Ports.Binding.bindPort(4566), new ExposedPort(4566)))
            ))
            .withEnv(Map.of(
                    "DEFAULT_REGION", "eu-west-1",
                    "DEBUG", "1",
                    "HOSTNAME_EXTERNAL", "localstack"
            ))
            .withClasspathResourceMapping("localstack", "/docker-entrypoint-initaws.d", BindMode.READ_ONLY)
            .waitingFor(Wait.forLogMessage(".*Ready.*", 1));

    @Autowired
    private AmazonSNS amazonSNS;

    @BeforeAll
    public static void beforeAll() {
    //    amazonSNS.createQueue(queue);
    }

    @Test
    public void testSubscriptions() {
        String s = Topics.subscribeQueue(amazonSNS, null, "topicArn", "queueUrl1");
    }

        @Test
    public void contextLoads() {
        AwsClientBuilder.EndpointConfiguration endpointConfiguration = container.getEndpointConfiguration(LocalStackContainer.Service.S3);
        String serviceEndpoint = endpointConfiguration.getServiceEndpoint();
        System.out.println("");
    }

}
