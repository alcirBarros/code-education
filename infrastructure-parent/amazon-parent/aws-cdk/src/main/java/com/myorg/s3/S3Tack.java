package com.myorg.s3;

import software.amazon.awscdk.CfnOutput;
import software.amazon.awscdk.RemovalPolicy;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.services.s3.BlockPublicAccess;
import software.amazon.awscdk.services.s3.Bucket;
import software.amazon.awscdk.services.s3.deployment.BucketDeployment;
import software.amazon.awscdk.services.s3.deployment.Source;
import software.constructs.Construct;

import java.util.Collections;

public class S3Tack extends Stack {

    public S3Tack(final Construct scope, final String id) {
        super(scope, id);


        Bucket bucket = Bucket.Builder.create(this, "CdkS3")
                .bucketName("site.0002")
                .websiteIndexDocument("index.html")
                .publicReadAccess(true)
                //.blockPublicAccess(BlockPublicAccess.BLOCK_All) Testar essa configuração
                .autoDeleteObjects(true) //Not recommended for production code
                .removalPolicy(RemovalPolicy.DESTROY)
                .build();

        BucketDeployment build = BucketDeployment.Builder
                .create(this, "bucket-deployment")
                .sources(Collections.singletonList(Source.asset("./admin")))
                .destinationBucket(bucket)
                .destinationKeyPrefix("web/static")
                .contentType("text/html")
                .build();

        CfnOutput.Builder.create(this, id + "-URL").value(bucket.getBucketWebsiteUrl()).build();


    }
}
