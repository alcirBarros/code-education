//package br.com.context.amazon.s3;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.testcontainers.containers.DockerComposeContainer;
//
//import java.io.File;
//
//@SpringBootTest
//public class DockerComposeContainerTest {
//
//
////    @Test
////    public void testWaitOnMultipleStrategiesPassing() {
////        File file = new File("src/test/resources/docker-compose.yml");
////        DockerComposeContainer composeContainer = new DockerComposeContainer(file);
////        composeContainer.start();
////    }
//
//
//    //    @Test
////    void test02() throws Exception {
////        // AWS SDK v2
////        S3Client s3 = S3Client
////                .builder()
////                .endpointOverride(localstack.getEndpointOverride(LocalStackContainer.Service.S3))
////                .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(
////                        localstack.getAccessKey(), localstack.getSecretKey()
////                )))
////                .region(Region.of(localstack.getRegion()))
////                .build();
////
////        s3.createBucket(b -> b.bucket("foo"));
////        s3.putObject(b -> b.bucket("foo").key("bar"), RequestBody.fromBytes("baz".getBytes()));
////    }
//}
//
//
