#!/bin/sh
echo "start configuration"

#aws configure set aws_access_key_id $CUSTOM_AWS_ACESS_KEY_ID --profile $CUSTOM_PROFILE
#aws configure set aws_secret_access_key $CUSTOM_AWS_ACESS_KEY_SECRET --profile $CUSTOM_PROFILE
#aws configure set default.region $AWS_DEFAULT_REGION --profile $CUSTOM_PROFILE

aws configure set aws_access_key_id dummyKey --profile localstack
aws configure set aws_secret_access_key dummySecret --profile localstack
aws configure set default.region us-west-2 --profile localstack
echo "finished configuration"