#!/bin/bash

yes | docker-compose -f run-all.yml stop
yes | docker-compose -f run-all.yml rm

