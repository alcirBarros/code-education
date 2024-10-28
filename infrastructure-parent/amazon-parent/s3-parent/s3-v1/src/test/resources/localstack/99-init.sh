#!/bin/sh

aws --endpoint-url=http://localhost:4566 s3 ls
aws --endpoint-url=http://localhost:4566 s3 mb s3://a205451-br-services-ci-us-east-1
aws --endpoint-url=http://localhost:4566 s3 cp .\s3\ s3://a205451-br-services-ci-us-east-1 --recursive

# aws --endpoint-url=http://localhost:4566 s3api create-bucket --bucket a205451-br-services-ci-us-east-1


aws --endpoint-url=http://localhost:4566 s3 cp .\s1000.xml s3://a205451-br-services-ci-us-east-1

aws --endpoint-url=http://localhost:4566 s3 ls s3://a205451-br-services-ci-us-east-1

echo "Initialized."
