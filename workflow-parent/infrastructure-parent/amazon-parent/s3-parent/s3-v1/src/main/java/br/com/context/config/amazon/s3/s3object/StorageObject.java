package br.com.context.config.amazon.s3.s3object;

public class StorageObject {

    private String bucketName;
    private String key;

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
