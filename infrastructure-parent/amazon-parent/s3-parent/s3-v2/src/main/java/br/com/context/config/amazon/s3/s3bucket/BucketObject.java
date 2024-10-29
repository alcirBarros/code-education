package br.com.context.config.amazon.s3.s3bucket;

public class BucketObject {

    public BucketObject(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
