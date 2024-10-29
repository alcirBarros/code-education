package com.myorg;

import software.amazon.awscdk.RemovalPolicy;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate;
import software.amazon.awscdk.services.cloudfront.*;
import software.amazon.awscdk.services.route53.ARecord;
import software.amazon.awscdk.services.route53.PublicHostedZone;
import software.amazon.awscdk.services.route53.RecordTarget;
import software.amazon.awscdk.services.route53.targets.CloudFrontTarget;
import software.amazon.awscdk.services.s3.BlockPublicAccess;
import software.amazon.awscdk.services.s3.Bucket;
import software.amazon.awscdk.services.s3.deployment.BucketDeployment;
import software.amazon.awscdk.services.s3.deployment.Source;
import software.constructs.Construct;

import java.util.Arrays;
import java.util.Collections;

public class CloudFrontStack2 extends Stack {

    public CloudFrontStack2(final Construct scope, final String id) {
        super(scope, id);
    }

    private Bucket build() {
        Bucket bucket = createSiteBucket();
        deployAdminFilesToBucket(bucket);
        OriginAccessIdentity originAccessIdentity = createOriginAccessIdentity();
        S3OriginConfig s3OriginConfig = createS3OriginConfig(bucket, originAccessIdentity);
        Behavior behavior = createDefaultBehavior(s3OriginConfig);
        SourceConfiguration sourceConfiguration = createSourceConfiguration(s3OriginConfig, behavior);
        PublicHostedZone hostedZone = createPublicHostedZone();
        DnsValidatedCertificate certificate = createDnsValidatedCertificate(hostedZone);
        ViewerCertificate viewerCertificate = createViewerCertificate(certificate);
        CloudFrontWebDistribution cloudFrontWebDistribution = createCloudFrontWebDistribution(sourceConfiguration, viewerCertificate);
        createDnsRecord(hostedZone, cloudFrontWebDistribution);
        return bucket;
    }

    private Bucket createSiteBucket() {
        return Bucket.Builder.create(this, "SiteBucket")
                .bucketName("site.0002")
                .publicReadAccess(false)
                .versioned(false)
                .blockPublicAccess(BlockPublicAccess.BLOCK_ALL)
                .removalPolicy(RemovalPolicy.RETAIN)
                .build();
    }

    private void deployAdminFilesToBucket(Bucket bucket) {
        BucketDeployment.Builder
                .create(this, "AdminFilesDeployment")
                .sources(Collections.singletonList(Source.asset("./admin")))
                .destinationBucket(bucket)
                .build();
    }

    private OriginAccessIdentity createOriginAccessIdentity() {
        return OriginAccessIdentity.Builder.create(this, "OriginAccessIdentity")
                .comment("Cloudfront OAI for the landing page")
                .build();
    }

    private S3OriginConfig createS3OriginConfig(Bucket bucket, OriginAccessIdentity originAccessIdentity) {
        return S3OriginConfig.builder()
                .s3BucketSource(bucket)
                .originAccessIdentity(originAccessIdentity)
                .build();
    }

    private Behavior createDefaultBehavior(S3OriginConfig s3OriginConfig) {
        return Behavior.builder()
                .isDefaultBehavior(true)
                .compress(true)
                .viewerProtocolPolicy(ViewerProtocolPolicy.REDIRECT_TO_HTTPS)
                .allowedMethods(CloudFrontAllowedMethods.GET_HEAD)
                .build();
    }

    private SourceConfiguration createSourceConfiguration(S3OriginConfig s3OriginConfig, Behavior behavior) {
        return SourceConfiguration.builder()
                .s3OriginSource(s3OriginConfig)
                .behaviors(Collections.singletonList(behavior))
                .build();
    }

    private PublicHostedZone createPublicHostedZone() {
        return PublicHostedZone.Builder.create(this, "HostedZone")
                .zoneName("florescermultiterapia.com.br")
                .build();
    }


    private DnsValidatedCertificate createDnsValidatedCertificate(PublicHostedZone hostedZone) {
        return DnsValidatedCertificate.Builder.create(this, "Certificate")
                .domainName("florescermultiterapia.com.br")
                .subjectAlternativeNames(Arrays.asList("*.florescermultiterapia.com.br"))
                .hostedZone(hostedZone)
                .region("us-east-1")
                .build();
    }
    private ViewerCertificate createViewerCertificate(DnsValidatedCertificate certificate) {
        ViewerCertificateOptions viewerCertificateOptions = ViewerCertificateOptions.builder()
                .aliases(Arrays.asList("florescermultiterapia.com.br", "www.florescermultiterapia.com.br"))
                .sslMethod(SSLMethod.SNI)
                .securityPolicy(SecurityPolicyProtocol.TLS_V1_2_2021)
                .build();

        return ViewerCertificate.fromAcmCertificate(certificate, viewerCertificateOptions);
    }

    private CloudFrontWebDistribution createCloudFrontWebDistribution(SourceConfiguration sourceConfiguration, ViewerCertificate viewerCertificate) {
        return CloudFrontWebDistribution.Builder.create(this, "CloudFrontWebDistribution")
                .originConfigs(Collections.singletonList(sourceConfiguration))
                .defaultRootObject("index.html")
                .priceClass(PriceClass.PRICE_CLASS_ALL)
                .httpVersion(HttpVersion.HTTP2)
                .enableIpV6(true)
                .enabled(true)
                .viewerCertificate(viewerCertificate)
                .build();
    }

    private void createDnsRecord(PublicHostedZone hostedZone, CloudFrontWebDistribution cloudFrontWebDistribution) {
        ARecord.Builder.create(this, "DnsRecord")
                .recordName("florescermultiterapia.com.br")
                .zone(hostedZone)
                .target(RecordTarget.fromAlias(new CloudFrontTarget(cloudFrontWebDistribution)))
                .build();
    }
}
