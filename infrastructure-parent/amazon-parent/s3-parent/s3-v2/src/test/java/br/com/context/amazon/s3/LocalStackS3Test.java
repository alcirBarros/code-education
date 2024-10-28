//package br.com.context.amazon.s3;
//
//
//import br.com.context.amazon.s3.config.LocalStackContainerTest;
//import static br.com.context.amazon.s3.config.LocalStackContainerTest.AmazonStorageS3ConfigTest;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.model.Bucket;
//import com.amazonaws.services.s3.model.ListObjectsRequest;
//import com.amazonaws.services.s3.model.ObjectListing;
//import com.amazonaws.services.s3.model.PutObjectRequest;
//import com.amazonaws.services.s3.model.PutObjectResult;
//import com.amazonaws.services.s3.model.S3ObjectInputStream;
//import com.amazonaws.services.s3.model.S3ObjectSummary;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Import;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import org.testcontainers.shaded.org.apache.commons.io.IOUtils;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@Testcontainers
//@SpringBootTest
//@Import(AmazonStorageS3ConfigTest.class)
//public class LocalStackS3Test extends LocalStackContainerTest {
//
//    @Autowired
//    private AmazonS3 amazonS3;
//
//    static String bucketName = "a205451-br-services-ci-us-east-1";
//
//    @Test
//    void test01() throws Exception {
//        Bucket bucket = amazonS3.createBucket(bucketName);
//
//        String key = "s3-key";
//        String content = "Hello World";
//        PutObjectResult putObjectResult = amazonS3.putObject(bucketName, key, content);
//
//        S3ObjectInputStream objectContent = amazonS3.getObject(bucketName, key).getObjectContent();
//        List<String> results = IOUtils.readLines(objectContent, "utf-8");
//
//        assertThat(results).hasSize(1);
//        assertThat(results.get(0)).isEqualTo(content);
//    }
//
//    @Test
//    void test02() throws Exception {
//        String key = "s3-02-key";
//        String content = "Hello World";
//        PutObjectResult putObjectResult = amazonS3.putObject(bucketName, key, content);
//        System.out.println(putObjectResult);
//    }
//
//    @Test
//    void test03() {
//        String key = "s3-03-key";
//        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, "classpath:application.properties");
//        PutObjectResult putObjectResult = amazonS3.putObject(putObjectRequest);
//        System.out.println(putObjectResult);
//    }
//
//    @Test
//    void test04() throws Exception {
//        String key = "s3-03-key";
//        S3ObjectInputStream objectContent = amazonS3.getObject(bucketName, key).getObjectContent();
//        InputStream inputStream = objectContent.getDelegateStream();
//        List<String> results = IOUtils.readLines(inputStream, "utf-8");
//        System.out.println(results);
//    }
//
//    @Test
//    void test05() {
//        ListObjectsRequest listObjectsRequest = new ListObjectsRequest();
//        listObjectsRequest.withBucketName(bucketName);
//        ObjectListing objects = amazonS3.listObjects(listObjectsRequest);
//        List<S3ObjectSummary> s3ObjectSummaryList = objects.getObjectSummaries();
//        System.out.println(s3ObjectSummaryList);
//    }
//
//    @Test
//    void test06() throws IOException {
//        File tempFile = File.createTempFile("TEST-0001", ".txt");
//        System.out.println(tempFile);
//    }
//}
//
//
