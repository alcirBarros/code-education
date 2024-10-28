# AWS KMS code examples for the SDK for .NET

## Overview

The examples in this section show how to use the AWS SDK for .NET with AWS Key Management Service (AWS KMS) to create and manage keys, grants, and policies.

AWS KMS is an encryption and key management service scaled for the cloud. AWS KMS keys and functionality are used by other AWS services, and you can use them to protect data in your own applications that use AWS.

## ⚠️ Important
* Running this code might result in charges to your AWS account.
* Running the tests might result in charges to your AWS account.
* We recommend that you grant your code least privilege. At most, grant only the minimum permissions required to perform the task. For more information, see [Grant least privilege](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#grant-least-privilege).
* This code is not tested in every AWS Region. For more information, see [AWS Regional Services](https://aws.amazon.com/about-aws/global-infrastructure/regional-product-services).

## Code examples

### Single actions
Code excerpts that show you how to call individual service functions.

- [Create a grant for a key](CreateGrantExample/CreateGrant.cs) (`CreateGrantAsync`)
- [Create a key](CreateKeyExample/CreateKey.cs) (`CreateKeyAsync`)
- [Create an alias for a key](CreateAliasExample/CreateAlias.cs) (`CreateAliasAsync`)
- [Describe a key](DescribeKeyExample/DescribeKey.cs) (`DescribeKeyAsync`)
- [Disable a key](DisableKeyExample/DisableKey.cs) (`DisableKeyAsync`)
- [Enable a key](EnableKeyExample/EnableKey.cs) (`EnableKeyAsync`)
- [List aliases for a key](ListAliasesExample/ListAliases.cs) (`ListAliasesAsync`)
- [List grants for a key](ListGrantsExample/ListGrants.cs) (`ListGrantsAsync`)
- [List keys](ListKeysExample/ListKeys.cs) (`ListKeysAsync`)

## Run the examples

### Prerequisites
* To find prerequisites for running these examples, see the
  [README](../README.md#Prerequisites) in the dotnetv3 folder.

The examples in this folder use the default user account. The call to
initialize the client object does not specify the AWS Region. The following
example shows how to supply the AWS Region to match your own as a
parameter to the client constructor:

```
var client = new AmazonKeyManagementServicelient(Amazon.RegionEndpoint.USWest2);
```

After the example compiles, you can run it from the command line. To do so,
navigate to the folder that contains the .csproj file and run the following
command:

```
dotnet run
```

Alternatively, you can run the example from within your IDE.

## Additional resources
* [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/overview.html)
* [AWS KMS API Reference](https://docs.aws.amazon.com/kms/latest/APIReference/Welcome.html)
* [AWS SDK for .NET KMS](https://docs.aws.amazon.com/sdkfornet/v3/apidocs/items/KeyManagementService/NKeyManagementService.html)
* [AWS SDK for .NET Developer Guide](https://docs.aws.amazon.com/sdk-for-net/v3/developer-guide/welcome.html)

Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved. SPDX-License-Identifier: Apache-2.0
