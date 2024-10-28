//package br.com.context;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.model.Bucket;
//import com.amazonaws.services.s3.model.ListObjectsRequest;
//import com.amazonaws.services.s3.model.ObjectListing;
//import com.amazonaws.services.s3.model.PutObjectRequest;
//import com.amazonaws.services.s3.model.PutObjectResult;
//import com.amazonaws.services.s3.model.S3ObjectInputStream;
//import com.amazonaws.services.s3.model.S3ObjectSummary;
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.testcontainers.shaded.org.apache.commons.io.IOUtils;
//
//@SpringBootTest
//public class AmazonS3Test {
//
//  private static final String BUCKET_NAME = "a205451-br-services-ci-us-east-1";
//
//  @Autowired
//  private AmazonS3 amazonS3;
//
////  @Test
////  void shouldStoreAndRetrieveDataFromS3Bucket() {
////    Bucket bucket = s3Service.createBucket(bucketName);
////    List<Bucket> buckets = s3Service.listBuckets();
////    PutObjectResult putObjectResult = s3Service.putObject(bucketName, "my-key-1", "my-value-1");
////    S3Object s3Object = s3Service.getObject(bucketName, "my-key-1");
////    assertThat(s3Object.getObjectContent()).hasSameContentAs(new ByteArrayInputStream("my-value-1".getBytes()));
////  }
//
//
//  @Test
//  void test01() throws Exception {
//    List<Bucket> buckets = amazonS3.listBuckets();
//    assertThat(buckets).hasSize(0);
//  }
//
//  @Test
//  void test02() throws Exception {
//    Bucket bucket = amazonS3.createBucket("s3bucketnametest");
//    System.out.println(bucket);
//  }
//
//
//  @Test
//  void test03() throws Exception {
//    Bucket bucket = amazonS3.createBucket("bucketname234563456787865566456");
//    String bucketName = bucket.getName();
//
//    String key = "s3-key";
//    String content = "Hello World";
//    PutObjectResult putObjectResult = amazonS3.putObject(bucketName, key, content);
//
//    S3ObjectInputStream objectContent = amazonS3.getObject(bucketName, key).getObjectContent();
//    List<String> results = IOUtils.readLines(objectContent, "utf-8");
//
//    assertThat(results).hasSize(1);
//    assertThat(results.get(0)).isEqualTo(content);
//  }
//
//  @Test
//  void test04() throws Exception {
//    String key = "s3-02-key";
//    String content = "Hello World";
//    PutObjectResult putObjectResult = amazonS3.putObject(BUCKET_NAME, key, content);
//    System.out.println(putObjectResult);
//  }
//
//  @Test
//  void test05() {
//    String key = "s3-03-key";
//    PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKET_NAME, key, "classpath:application.properties");
//    PutObjectResult putObjectResult = amazonS3.putObject(putObjectRequest);
//    System.out.println(putObjectResult);
//  }
//
//  @Test
//  void test06() throws Exception {
//    String key = "s1000.xml";
//    S3ObjectInputStream objectContent = amazonS3.getObject(BUCKET_NAME, key).getObjectContent();
//    InputStream inputStream = objectContent.getDelegateStream();
//    List<String> results = IOUtils.readLines(inputStream, "utf-8");
//    System.out.println(results);
//  }
//
//  @Test
//  void test07() {
//    ListObjectsRequest listObjectsRequest = new ListObjectsRequest();
//    listObjectsRequest.withBucketName(BUCKET_NAME);
//    ObjectListing objects = amazonS3.listObjects(listObjectsRequest);
//    List<S3ObjectSummary> s3ObjectSummaryList = objects.getObjectSummaries();
//    System.out.println(s3ObjectSummaryList);
//  }
//
//  @Test
//  void test08() throws IOException {
//    File tempFile = File.createTempFile("TEST-0001", ".txt");
//    System.out.println(tempFile);
//  }
//
//}
