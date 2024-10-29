package br.com.context.config.amazon.s3.s3bucket;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmazonS3BucketClient {

    @Autowired
    private AmazonS3 amazonS3;

    public Bucket save(String bucketName) {
        return amazonS3.createBucket(bucketName);
    }

    public List<Bucket> findAll() {
        return amazonS3.listBuckets();
    }
}
