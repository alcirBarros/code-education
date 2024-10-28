//package br.com.amazon.services;
//
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.model.Bucket;
//import com.amazonaws.services.s3.model.PutObjectResult;
//import com.amazonaws.services.s3.model.S3Object;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class S3Service {
//
//    @Autowired
//    private AmazonS3 amazonS3;
//
//    public List<Bucket> listBuckets() {
//        return amazonS3.listBuckets();
//    }
//
//    public Bucket createBucket(String bucketName) {
//        return amazonS3.createBucket(bucketName);
//    }
//
//    public S3Object getObject(String bucketName, String key) {
//        return amazonS3.getObject(bucketName, key);
//    }
//
//    public PutObjectResult putObject(String bucketName, String key, String value) {
//        return amazonS3.putObject(bucketName, key, value);
//    }
//}
