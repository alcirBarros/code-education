package com.myorg;

import software.amazon.awscdk.CfnOutput;
import software.amazon.awscdk.Fn;
import software.amazon.awscdk.RemovalPolicy;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate;
import software.amazon.awscdk.services.cloudfront.*;
import software.amazon.awscdk.services.route53.*;
import software.amazon.awscdk.services.route53.targets.CloudFrontTarget;
import software.amazon.awscdk.services.s3.BlockPublicAccess;
import software.amazon.awscdk.services.s3.Bucket;
import software.amazon.awscdk.services.s3.deployment.BucketDeployment;
import software.amazon.awscdk.services.s3.deployment.Source;
import software.constructs.Construct;

import java.util.Arrays;
import java.util.Collections;

public class CloudFrontStack extends Stack {

    public CloudFrontStack(final Construct scope, final String id) {
        super(scope, id);

        Bucket bucket = Bucket.Builder.create(this, "brotheroots.com.br")
                .bucketName("brotheroots.com.br")
                .publicReadAccess(false)
                .versioned(false)
                .autoDeleteObjects(true) //Not recommended for production code
                .blockPublicAccess(BlockPublicAccess.BLOCK_ALL)
                .removalPolicy(RemovalPolicy.DESTROY)
                .build();


        BucketDeployment build = BucketDeployment.Builder
                .create(this, "bucket-deployment")
                .sources(Collections.singletonList(Source.asset("./admin")))
                .destinationBucket(bucket)
                .build();

//
//        BehaviorOptions behaviorOptions = BehaviorOptions.builder()
//                .origin(S3Origin.Builder.create(bucket).build())
//                .compress(true)
//                .viewerProtocolPolicy(ViewerProtocolPolicy.ALLOW_ALL)
//                .cachePolicy(CachePolicy.CACHING_OPTIMIZED)
//                .build();
//
//
//        Distribution build3 = Distribution.Builder.create(this, "distribution-site")
//                .defaultRootObject("index.html")
//                .defaultBehavior(behaviorOptions)
//                .httpVersion(HttpVersion.HTTP2)
//                .build();


        OriginAccessIdentity originAccessIdentity = OriginAccessIdentity.Builder.create(this, "OriginAccessIdentity")
                .comment("Cloudfront OAI for the landing page")
                .build();


        S3OriginConfig s3OriginConfig = S3OriginConfig.builder()
                .s3BucketSource(bucket)
                .originAccessIdentity(originAccessIdentity)
                .build();

        Behavior behavior = Behavior.builder()
                .isDefaultBehavior(true)
                .compress(true)
//                .cachedMethods(CloudFrontAllowedCachedMethods.GET_HEAD)
                .viewerProtocolPolicy(ViewerProtocolPolicy.REDIRECT_TO_HTTPS)
                .allowedMethods(CloudFrontAllowedMethods.GET_HEAD)
                .build();

        SourceConfiguration sourceConfiguration = SourceConfiguration.builder()
                .s3OriginSource(s3OriginConfig)
                .behaviors(Collections.singletonList(behavior))
                .build();


        PublicHostedZoneAttributes build1 = PublicHostedZoneAttributes.builder()
                .hostedZoneId("")
                .zoneName("")
                .build();

        IHostedZone hostedzone1 = HostedZone.fromHostedZoneAttributes(this, "", build1);
        IHostedZone hostedzone2 = HostedZone.fromHostedZoneId(this, "hostedzone", "");

        PublicHostedZone hostedzone = PublicHostedZone.Builder.create(this, "hostedzone")
                .zoneName("florescermultiterapia.com.br")
                .build();

        String select = Fn.select(0, hostedzone.getHostedZoneNameServers());

        CfnOutput.Builder.create(this, id + "-PublicHostedZone").value(select).build();

        DnsValidatedCertificate dnsValidatedCertificate = DnsValidatedCertificate.Builder.create(this, "certificate")
                .domainName("brotheroots.com.br")
                .subjectAlternativeNames(Arrays.asList("*.brotheroots.com.br"))
                .hostedZone(hostedzone)
                .region("us-east-1")
                .build();

        ViewerCertificateOptions viewerCertificateOptions = ViewerCertificateOptions.builder()
                .aliases(Arrays.asList("brotheroots.com.br", "www.brotheroots.com.br"))
                .sslMethod(SSLMethod.SNI)
                .securityPolicy(SecurityPolicyProtocol.TLS_V1_2_2021)
                .build();

        ViewerCertificate viewerCertificate = ViewerCertificate.fromAcmCertificate(dnsValidatedCertificate, viewerCertificateOptions);

        CloudFrontWebDistribution cloudFrontWebDistribution = CloudFrontWebDistribution.Builder.create(this, "cloud-front")
                .originConfigs(Collections.singletonList(sourceConfiguration))
                .enabled(true)
                .priceClass(PriceClass.PRICE_CLASS_ALL)
                .viewerCertificate(viewerCertificate)
                .httpVersion(HttpVersion.HTTP2)
                .defaultRootObject("index.html")
                .enableIpV6(true)
                .build();

        CloudFrontTarget cloudFrontTarget = new CloudFrontTarget(cloudFrontWebDistribution);

        RecordTarget recordTarget = RecordTarget.fromAlias(cloudFrontTarget);

        AaaaRecord AaaaRecordDefault = AaaaRecord.Builder.create(this, "aaaa-record-default")
                .zone(hostedzone)
                .target(recordTarget)
                .build();

        AaaaRecord AaaaRecordWwww = AaaaRecord.Builder.create(this, "aaaa-record-wwww")
                .recordName("www")
                .zone(hostedzone)
                .target(recordTarget)
                .build();

        CfnOutput.Builder.create(this, "ZA RegionOutput")
                .description("")
                .value("Region:"+ this.getRegion())
                .build();

        CfnOutput.Builder.create(this, "ZB S3 Bucket")
                .description("")
                .value("S3 Bucket:"+ bucket.getBucketName())
                .build();

        CfnOutput.Builder.create(this, id + "DeployURL").value(cloudFrontWebDistribution.getDistributionDomainName()).build();

    }
}
