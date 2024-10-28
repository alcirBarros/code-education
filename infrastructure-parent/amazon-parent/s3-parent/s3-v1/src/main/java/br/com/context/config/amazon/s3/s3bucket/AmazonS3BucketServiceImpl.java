package br.com.context.config.amazon.s3.s3bucket;

import com.amazonaws.services.s3.model.Bucket;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Log4j2
@Service
public class AmazonS3BucketServiceImpl {

    @Autowired
    private AmazonS3BucketClient amazonS3BucketClient;

    @Autowired
    private ModelMapper modelMapper;

    public BucketObject save(String bucketName) {
        Bucket bucket = amazonS3BucketClient.save(bucketName);
        return modelMapper.map(bucket, BucketObject.class);
    }

    public List<BucketObject> findAll() {
        List<Bucket> bucketList = amazonS3BucketClient.findAll();
        log.info("AmazonS3BucketServiceImpl.findAll: {}", bucketList.size());
        return Arrays.asList(modelMapper.map(bucketList, BucketObject[].class));
    }
}
