#!/usr/bin/env bash

##awslocal --endpoint-url=http://localhost:4566 sns create-topic --name topic-name
awslocal --endpoint-url=http://localhost:4566 sqs create-queue --queue-name output-queue
awslocal --endpoint-url=http://localhost:4566 sqs create-queue --queue-name input-queue
##awslocal --endpoint-url=http://localhost:4566 sqs create-queue --queue-name input-queue.fifo --attributes FifoQueue=true

##awslocal --endpoint-url=http://localhost:4566 sns subscribe --topic-arn arn:aws:sns:sa-east-1:000000000000:topic-name --protocol sqs --notification-endpoint arn:aws:sqs:sa-east-1:000000000000:order-queue

awslocal --endpoint-url=http://localhost:4566 sqs list-queues
##awslocal --endpoint-url=http://localhost:4566 sns list-subscriptions

##awslocal --endpoint-url=http://localhost:4566 sqs send-message --queue-url http://localhost:4566/000000000000/input-queue --message-body 'Test Message!'

echo "Localstack ready!"
