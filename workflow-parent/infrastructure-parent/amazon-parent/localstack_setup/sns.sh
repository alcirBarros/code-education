#!/usr/bin/env bash

awslocal --endpoint-url=http://localhost:4566 sns create-topic --name DEV_IFOODOFFICE_TEST_EVENTS

awslocal --endpoint-url=http://localhost:4566 sns create-topic --name DEV_IFOODOFFICE_NOTIFICATIONS

awslocal --endpoint-url=http://localhost:4566 sns publish --topic-arn arn:aws:sns:us-east-1:000000000000:DEV_IFOODOFFICE_EMPLOYEE_EVENTS --message "file://message-dev-ifoodoffice-employee-events.json" --cli-connect-timeout 60000
