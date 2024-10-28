package com.myorg;

import software.amazon.awscdk.*;
import software.amazon.awscdk.services.ec2.*;
import software.amazon.awscdk.services.rds.*;
import software.constructs.Construct;

import java.util.Collections;
import java.util.List;

public class RdsMysqlStack extends Stack {

    public RdsMysqlStack(final Construct scope, final String id, Vpc vpc) {
        this(scope, id, null, vpc);
    }

    public RdsMysqlStack(final Construct scope, final String id, final StackProps props, Vpc vpc) {
        super(scope, id, props);

     //   CfnParameter cfnParameter = CfnParameter.Builder.create(this, "databassPassword").type("String").build();

//        PostgresInstanceEngineProps postgresInstanceEngineProps = PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_14_1).build();
//        IInstanceEngine iInstanceEngine = DatabaseInstanceEngine.postgres(postgresInstanceEngineProps);

        MySqlInstanceEngineProps mySqlInstanceEngineProps = MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_5_7).build();
        IInstanceEngine iInstanceEngine = DatabaseInstanceEngine.mysql(mySqlInstanceEngineProps);

        ISecurityGroup iSecurityGroup = SecurityGroup.fromSecurityGroupId(this, id, vpc.getVpcDefaultSecurityGroup());
        iSecurityGroup.addEgressRule(Peer.anyIpv4(), Port.tcp(3306));

        CredentialsFromUsernameOptions credentialsFromUsernameOptions = CredentialsFromUsernameOptions.builder().password(SecretValue.plainText("admin123")).build();
        Credentials credentials = Credentials.fromUsername("admin", credentialsFromUsernameOptions);

        SubnetSelection subnetSelection = SubnetSelection.builder()
                .subnets(vpc.getPublicSubnets())
                .build();

        List<ISecurityGroup> iSecurityGroups = Collections.singletonList(iSecurityGroup);

        InstanceType instanceType = InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO);

        DatabaseInstance databaseInstance = DatabaseInstance.Builder.create(this, "Rds01")
                .instanceIdentifier("aws-project01-db")
                .engine(iInstanceEngine)
                .vpc(vpc)
                .credentials(credentials)
                .instanceType(instanceType)
                .multiAz(false)
                .allocatedStorage(10)
                .securityGroups(iSecurityGroups)
                .vpcSubnets(subnetSelection)
                .build();


        String username = credentials.getUsername();
        String password = credentials.getPassword().toString();

        CfnOutput.Builder.create(this, "rds-endpoint").exportName("rds-endpoint").value(databaseInstance.getDbInstanceEndpointAddress()).build();
        CfnOutput.Builder.create(this, "rds-username").exportName("rds-username").value(username).build();
        CfnOutput.Builder.create(this, "rds-password").exportName("rds-password").value(password).build();

    }
}
