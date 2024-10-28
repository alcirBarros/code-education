#!/usr/bin/env bash

awslocal --endpoint-url=http://localhost:4566 secretsmanager create-secret --name my-secret-name --secret-string "{\"user\":\"diegor\",\"password\":\"EXAMPLE-PASSWORD\"}"