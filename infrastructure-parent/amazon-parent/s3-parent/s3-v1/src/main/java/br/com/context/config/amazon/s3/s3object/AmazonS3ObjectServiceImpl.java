package br.com.context.config.amazon.s3.s3object;

import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.transfer.TransferManager;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Service
public class AmazonS3ObjectServiceImpl {

    @Autowired
    private AmazonS3ObjectClient amazonS3ObjectClient;

    @Autowired
    private ModelMapper modelMapper;

    public void save(String bucketName, String key, String body) {
        amazonS3ObjectClient.save(bucketName, key, body);
    }

    public void delete(String bucketName, String key) {
        amazonS3ObjectClient.delete(bucketName, key);
    }

    public InputStream findByBucketNameAndKey(String bucketName, String key) {
        S3Object s3Object = amazonS3ObjectClient.findByBucketNameAndKey(bucketName, key);
        S3ObjectInputStream objectContent = s3Object.getObjectContent();
        return objectContent.getDelegateStream();
    }

    public StorageObject findByBucketNameAndPrefixAndKey(String bucketName, String key) {
        S3Object s3Object = amazonS3ObjectClient.findByBucketNameAndKey(bucketName, key);
        return modelMapper.map(s3Object, StorageObject.class);
    }

    public List<StorageObject> findAllByBucket(String bucketName) {
        List<S3ObjectSummary> s3ObjectSummaryList = amazonS3ObjectClient.findAllByBucket(bucketName);
        return Arrays.asList(modelMapper.map(s3ObjectSummaryList, StorageObject[].class));
    }

    public List<StorageObject> findAllByBucketAndPrefix(String bucketName, String prefix) {
        List<S3ObjectSummary> s3ObjectSummaryList = amazonS3ObjectClient.findAllByBucketAndPrefix(bucketName, prefix);
        return Arrays.asList(modelMapper.map(s3ObjectSummaryList, StorageObject[].class));
    }

    public void toMove(StorageObject storageObject, String bucketNameDestination, String storageObjectKeyDestination) {
        String bucketName = storageObject.getBucketName();
        String storageObjectKey = storageObject.getKey();
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest();
        copyObjectRequest.setSourceBucketName(bucketName);
        copyObjectRequest.setSourceKey(storageObjectKey);
        copyObjectRequest.setDestinationBucketName(bucketNameDestination);
        copyObjectRequest.setDestinationKey(storageObjectKeyDestination);
        TransferManager transferManager = amazonS3ObjectClient.transfer();
        transferManager.copy(copyObjectRequest, (transfer, transferState) -> {
            if (transfer.isDone()) {
                switch (transfer.getState()) {
                    case Completed:
                        this.delete(bucketName, storageObjectKey);
                        break;
                }
            }
        });
    }

}
