#!/bin/bash

BUCKET_EXISTS=$(awslocal s3api head-bucket --bucket $CUSTOM_BUCKET_NAME --profile $CUSTOM_PROFILE --endpoint-url $CUSTOM_ENDPOINT 2>&1 || true)
if [ -z "$BUCKET_EXISTS" ]; then
  echo "Bucket already exists."
else
  echo "Bucket does not exist, creating a new one"
  awslocal s3api create-bucket --bucket $CUSTOM_BUCKET_NAME --profile $CUSTOM_PROFILE --endpoint-url $CUSTOM_ENDPOINT

ggg
awslocal --endpoint-url=$CUSTOM_ENDPOINT s3 cp .\s3\ s3://$CUSTOM_BUCKET_NAME --recursive