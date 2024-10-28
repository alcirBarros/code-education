#!/bin/bash

awslocal kms create-key --region $AWS_DEFAULT_REGION --key-usage ENCRYPT_DECRYPT --bypass-policy-lockout-safety-check --endpoint-url $CUSTOM_ENDPOINT --profile $CUSTOM_PROFILE

# --> List keys
# aws dynamodb --profile $CUSTOM_PROFILE list-tables