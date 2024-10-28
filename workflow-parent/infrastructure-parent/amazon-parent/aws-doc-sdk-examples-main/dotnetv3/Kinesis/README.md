# Amazon Kinesis code examples for the SDK for .NET

## Overview

The examples in this section show how to use the AWS SDK for .NET with Amazon Kinesis features such as streams and consumers.

Amazon Kinesis makes it easy to collect, process, and analyze video and data streams in real time.

## ⚠️ Important
* Running this code might result in charges to your AWS account.
* Running the tests might result in charges to your AWS account.
* We recommend that you grant your code least privilege. At most, grant only the minimum permissions required to perform the task. For more information, see [Grant least privilege](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#grant-least-privilege).
* This code is not tested in every AWS Region. For more information, see [AWS Regional Services](https://aws.amazon.com/about-aws/global-infrastructure/regional-product-services).

## Code examples

### Single actions
Code excerpts that show you how to call individual service functions.

- [Add tags](TagStreamExample/TagStreamExample/TagStream.cs) (`AddTagsAsync`)
- [Create a stream](CreateStreamExample/CreateStreamExample/CreateStream.cs) (`CreateStreamAsync`)
- [Delete a stream](DeleteStreamExample/DeleteStreamExample/DeleteStream.cs) (`DeleteStreamAsync`)
- [Deregister a consumer](DeregisterConsumerExample/DeregisterConsumerExample/DeregisterConsumer.cs) (`DeregisterConsumerAsync`)
- [List streams](ListStreamsExample/ListStreamsExample/ListStreams.cs) (`ListStreamsAsync`)
- [List tags](ListTagsExample/ListTagsExample/ListTags.cs) (`ListTagsAsync`)
- [List the consumers of a stream](ListConsumersExample/ListConsumersExample/ListConsumers.cs) (`ListConsumersAsync`)
- [Register a consumer](RegisterConsumerExample/RegisterConsumerExample/RegisterConsumer.cs) (`RegisterConsumerAsync`)

## Run the examples

### Prerequisites
* To find prerequisites for running these examples, see the
  [README](../README.md#Prerequisites) in the dotnetv3 folder.

The examples in this folder use the default user account. The call to
initialize the client object does not specify the AWS Region. The following
example shows how to supply the AWS Region to match your own as a
parameter to the client constructor:

```
var client = new AmazonKinesisClient(Amazon.RegionEndpoint.USWest2);
```

After the example compiles, you can run it from the command line. To do so,
navigate to the folder that contains the .csproj file and run the following
command:

```
dotnet run
```

Alternatively, you can run the example from within your IDE.

## Tests

⚠ Running the tests might result in charges to your AWS account.

To find instructions for running these tests, see the [README](../README.md#Tests)
in the `dotnetv3` folder.

## Additional resources
* [Amazon Kinesis Developer Guide](https://docs.aws.amazon.com/streams/latest/dev/introduction.html)
* [Amazon Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/Welcome.html)
* [AWS SDK for .NET Kinesis](https://docs.aws.amazon.com/sdkfornet/v3/apidocs/items/Kinesis/NKinesis.html)
* [AWS SDK for .NET Developer Guide](https://docs.aws.amazon.com/sdk-for-net/v3/developer-guide/welcome.html)

Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved. SPDX-License-Identifier: Apache-2.0

