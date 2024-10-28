package com.myorg;

import software.amazon.awscdk.App;

public class AwsCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        CloudFrontStack cloudFrontStack = new CloudFrontStack(app, "CdkCloudFrontTask004");

//        VpcStack vpcStack = new VpcStack(app, "Vpc");
//
//        ClusterStack clusterStack = new ClusterStack(app, "Cluster", vpcStack.getVpc());
//        clusterStack.addDependency(vpcStack);
//
//        RdsMysqlStack rdsMysqlStack = new RdsMysqlStack(app, "Rds", vpcStack.getVpc());
//        rdsMysqlStack.addDependency(vpcStack);
//
//        SnsStack snsStack = new SnsStack(app, "Sns");
//
//        Service01Stack service01Stack = new Service01Stack(app, "Service01", clusterStack.getCluster(), snsStack.getSnsTopic());
//        service01Stack.addDependency(clusterStack);
//        service01Stack.addDependency(rdsMysqlStack);
//        service01Stack.addDependency(snsStack);


        // new AwsCdkStack(app, "AwsCdkStack", StackProps.builder()
                // If you don't specify 'env', this stack will be environment-agnostic.
                // Account/Region-dependent features and context lookups will not work,
                // but a single synthesized template can be deployed anywhere.

                // Uncomment the next block to specialize this stack for the AWS Account
                // and Region that are implied by the current CLI configuration.
                /*
                .env(Environment.builder()
                        .account(System.getenv("CDK_DEFAULT_ACCOUNT"))
                        .region(System.getenv("CDK_DEFAULT_REGION"))
                        .build())
                */

                // Uncomment the next block if you know exactly what Account and Region you
                // want to deploy the stack to.
                /*
                .env(Environment.builder()
                        .account("123456789012")
                        .region("us-east-1")
                        .build())
                */

                // For more information, see https://docs.aws.amazon.com/cdk/latest/guide/environments.html
         //       .build());

        app.synth();
    }
}

