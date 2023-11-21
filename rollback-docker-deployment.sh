#!/bin/bash

docker service ls
docker service rollback SERVICE_NAME --update-parallelism 1 --update-failure-action rollback --update-delay 0s TARGET_VERSION

docker service ps SERVICE_NAME
docker service inspect --pretty SERVICE_NAME
docker service rollback my_web_app --update-parallelism 1 --update-failure-action rollback --update-delay 0s 2
