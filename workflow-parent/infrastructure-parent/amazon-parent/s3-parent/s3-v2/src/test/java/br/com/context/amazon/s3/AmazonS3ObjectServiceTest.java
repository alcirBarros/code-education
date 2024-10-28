//package br.com.context.amazon.s3;
//
//import br.com.context.amazon.s3.config.LocalStackContainerTest.AmazonStorageS3ConfigTest;
//import br.com.context.amazon.s3.config.LocalStackContainerTest;
//import br.com.context.config.amazon.s3.s3bucket.AmazonS3BucketServiceImpl;
//import br.com.context.config.amazon.s3.s3bucket.BucketObject;
//import br.com.context.config.amazon.s3.s3object.AmazonS3ObjectServiceImpl;
//import br.com.context.config.amazon.s3.s3object.StorageObject;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Import;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//import java.util.List;
//
//@Testcontainers
//@SpringBootTest
//@Import(AmazonStorageS3ConfigTest.class)
//public class AmazonS3ObjectServiceTest extends LocalStackContainerTest {
//
//  @Autowired
//  private AmazonS3ObjectServiceImpl amazonS3ObjectService;
//
//  @Autowired
//  private AmazonS3BucketServiceImpl amazonS3BucketService;
//
//  @Test
//  void test01() {
//    List<BucketObject> bucketList = amazonS3BucketService.findAll();
//    System.out.println(bucketList);
//  }
//
//  @Test
//  void test02() {
//    List<StorageObject> allByBucketAndPath = amazonS3ObjectService.findAllByBucketAndPrefix("adq-dsv-eligibility-hml",
//                                                                                            "bb/retorno/entrada/");
//    System.out.println(allByBucketAndPath);
//  }
//
//  @Test
//  void test03() {
//    String bucketName = "order-event-test2-bucket";
//    String storageObjectKey = "test/test/KEY_FILE_0001.txt";
//
//    amazonS3BucketService.save(bucketName);
//    amazonS3ObjectService.save(bucketName, storageObjectKey, "TEXTO");
//
//    StorageObject storageObject = amazonS3ObjectService.findByBucketNameAndPrefixAndKey(bucketName, storageObjectKey);
//
//    List<StorageObject> allByBucketAndPath2 = amazonS3ObjectService.findAllByBucket("order-event-test2-bucket");
//    List<StorageObject> allByBucketAndPath1 = amazonS3ObjectService.findAllByBucket("order-event-test-bucket");
//
//    amazonS3ObjectService.toMove(storageObject, "order-event-test-bucket", "test/moved/KEY_FILE_0001.txt");
//
//    List<StorageObject> allByBucketAndPath3 = amazonS3ObjectService.findAllByBucket("order-event-test2-bucket");
//    List<StorageObject> allByBucketAndPath4 = amazonS3ObjectService.findAllByBucket("order-event-test-bucket");
//    System.out.println("allByBucketAndPath");
//  }
//}
//
//
