package br.com.context.config.amazon.s3.s3bucket;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;

@Service
public class AmazonS3BucketClient {

    @Autowired
    private S3Client s3Client;

//    public Bucket save(String bucketName) {
//        return s3Client.createBucket(bucketName);
//    }

    public List<Bucket> findAll() {
        return s3Client.listBuckets().buckets();
    }
}
