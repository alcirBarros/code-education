package com.myorg;

import software.amazon.awscdk.*;
import software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps;
import software.amazon.awscdk.services.ecs.*;
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService;
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions;
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck;
import software.amazon.awscdk.services.events.targets.SnsTopic;
import software.amazon.awscdk.services.logs.LogGroup;
import software.constructs.Construct;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Service01Stack extends Stack {


    public Service01Stack(final Construct scope, final String id, Cluster cluster, SnsTopic snsTopic) {
        this(scope, id, null, cluster, snsTopic);
    }

    public Service01Stack(final Construct scope, final String id, final StackProps props, Cluster cluster, SnsTopic snsTopic) {
        super(scope, id, props);


        ApplicationLoadBalancedFargateService service01 = ApplicationLoadBalancedFargateService.Builder.create(this, "ALB01")
                .serviceName("service-01")
                .cluster(cluster)
                .cpu(512)
                .memoryLimitMiB(1024)
                .desiredCount(2)
                .listenerPort(8080)
                .assignPublicIp(true)
                .taskImageOptions(
                        ApplicationLoadBalancedTaskImageOptions.builder()
                                .containerName("aws_project01")
                                .image(ContainerImage.fromRegistry("alcirbarros/educa-facil:latest"))
                                .containerPort(8080)
                                .logDriver(LogDriver.awsLogs(AwsLogDriverProps.builder()
                                        .logGroup(LogGroup.Builder.create(this, "Service01LogGroup")
                                                .logGroupName("Service01")
                                                .removalPolicy(RemovalPolicy.DESTROY)
                                                .build())
                                        .streamPrefix("Service01")
                                        .build()))
                                .environment(
                                        new HashMap<String, String>() {{
                                            put("UUID", UUID.randomUUID().toString());
                                            put("COMPOSE_PROFILES", "development,logging,h2");
//                                            put("SPRING_DATASOURCE_URL", "jdbc:mariadb://"+Fn.importValue("rds-endpoint")+":3306/aws_project01?createDatabaseIfNotExist=true");
//                                            put("SPRING_DATASOURCE_USERNAME", Fn.importValue("rds-username"));
//                                            put("SPRING_DATASOURCE_PASSWORD", Fn.importValue("rds-password"));
                                            put("CLOUD_AWS_SNS_ARN", snsTopic.getTopic().getTopicArn());
                                        }}
                                )
                                .build())
                .publicLoadBalancer(true)
                .build();

        service01.getTargetGroup().configureHealthCheck(new HealthCheck.Builder()
                .path("/actuator/health")
                .port("8080")
                .healthyHttpCodes("200")
                .build());


        ScalableTaskCount scalableTaskCount = service01.getService().autoScaleTaskCount(EnableScalingProps.builder()
                .minCapacity(2)
                .maxCapacity(4)
                .build());


        scalableTaskCount.scaleOnCpuUtilization("Service01AutoScaling", CpuUtilizationScalingProps.builder()
                .targetUtilizationPercent(50)
                .scaleInCooldown(Duration.seconds(60))
                .scaleOutCooldown(Duration.seconds(60))
                .build());


        snsTopic.getTopic().grantPublish(service01.getTaskDefinition().getTaskRole());

    }
}
