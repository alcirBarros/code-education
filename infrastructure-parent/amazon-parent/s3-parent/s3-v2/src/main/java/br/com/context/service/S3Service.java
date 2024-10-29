package br.com.context.service;

import br.com.context.config.amazon.s3.s3bucket.AmazonS3BucketClient;
import br.com.context.config.amazon.s3.s3bucket.AmazonS3BucketServiceImpl;
import br.com.context.config.amazon.s3.s3bucket.BucketObject;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class S3Service {

//    @Autowired
//    private AmazonS3ObjectClient amazonS3ObjectClient;

    @Autowired
    private AmazonS3BucketClient amazonS3BucketClient;

    @Autowired
    private AmazonS3BucketServiceImpl amazonS3BucketService;

//    public Bucket save(String bucketName) {
//        return amazonS3BucketClient.save(bucketName);
//    }

    public List<BucketObject> findAll() {
        return amazonS3BucketService.findAll();
    }

//    public PutObjectResult save(String bucketName, String key, String value) {
//        return amazonS3ObjectClient.save(bucketName, key, value);
//    }
//
//    public S3Object findByBucketNameAndKey(String bucketName, String key) {
//        return null;
//    }
//
//    public List<S3ObjectSummary> findAllByBucketAndPath(String bucketName, String path) {
//        return null;
//    }

//    private Logger logger = LoggerFactory.getLogger(S3ServicesImpl.class);
//
//    @Autowired
//    private AmazonS3 s3client;
//
//    @Value("${gkz.s3.bucket}")
//    private String bucketName;
//
//
//    public ByteArrayOutputStream downloadFile(String keyName) {
//        try {
//            S3Object s3object = s3client.getObject(new GetObjectRequest(bucketName, keyName));
//
//            InputStream is = s3object.getObjectContent();
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            int len;
//            byte[] buffer = new byte[4096];
//            while ((len = is.read(buffer, 0, buffer.length)) != -1) {
//                baos.write(buffer, 0, len);
//            }
//
//            return baos;
//        } catch (IOException ioe) {
//            logger.error("IOException: " + ioe.getMessage());
//        } catch (AmazonServiceException ase) {
//            logger.info("sCaught an AmazonServiceException from GET requests, rejected reasons:");
//            logger.info("Error Message:    " + ase.getMessage());
//            logger.info("HTTP Status Code: " + ase.getStatusCode());
//            logger.info("AWS Error Code:   " + ase.getErrorCode());
//            logger.info("Error Type:       " + ase.getErrorType());
//            logger.info("Request ID:       " + ase.getRequestId());
//            throw ase;
//        } catch (AmazonClientException ace) {
//            logger.info("Caught an AmazonClientException: ");
//            logger.info("Error Message: " + ace.getMessage());
//            throw ace;
//        }
//
//        return null;
//    }
//
//
//    public void uploadFile(String keyName, MultipartFile file) {
//        try {
//            ObjectMetadata metadata = new ObjectMetadata();
//            metadata.setContentLength(file.getSize());
//            PutObjectResult putObject = s3client.putObject(bucketName, keyName, file.getInputStream(), metadata);
//        } catch (IOException ioe) {
//            logger.error("IOException: " + ioe.getMessage());
//        } catch (AmazonServiceException ase) {
//            logger.info("Caught an AmazonServiceException from PUT requests, rejected reasons:");
//            logger.info("Error Message:    " + ase.getMessage());
//            logger.info("HTTP Status Code: " + ase.getStatusCode());
//            logger.info("AWS Error Code:   " + ase.getErrorCode());
//            logger.info("Error Type:       " + ase.getErrorType());
//            logger.info("Request ID:       " + ase.getRequestId());
//            throw ase;
//        } catch (AmazonClientException ace) {
//            logger.info("Caught an AmazonClientException: ");
//            logger.info("Error Message: " + ace.getMessage());
//            throw ace;
//        }
//    }
//
//    public List<String> listFiles() {
//
//        ListObjectsRequest listObjectsRequest = new ListObjectsRequest().withBucketName(bucketName);
//        //.withPrefix("test" + "/");
//
//        List<String> keys = new ArrayList<>();
//
//        ObjectListing objects = s3client.listObjects(listObjectsRequest);
//
//        while (true) {
//            List<S3ObjectSummary> summaries = objects.getObjectSummaries();
//            if (summaries.size() < 1) {
//                break;
//            }
//
//            for (S3ObjectSummary item : summaries) {
//                if (!item.getKey().endsWith("/")) {
//                    keys.add(item.getKey());
//                }
//            }
//
//            objects = s3client.listNextBatchOfObjects(objects);
//        }
//
//        return keys;
//    }
}
