#!/bin/bash

# Define your image and tag
IMAGE_NAME="your-image-name"
CURRENT_TAG="latest"

# Pull the latest information about the image from the registry
docker pull $IMAGE_NAME:$CURRENT_TAG

# Get the digest of the currently pulled image
CURRENT_DIGEST=$(docker inspect --format='{{index .RepoDigests 0}}' $IMAGE_NAME:$CURRENT_TAG)

# Get the digest of the latest image available in the registry
LATEST_DIGEST=$(docker manifest inspect $IMAGE_NAME:$CURRENT_TAG | jq -r '.config.digest')

# Compare digests to check for updates
if [ "$CURRENT_DIGEST" != "$LATEST_DIGEST" ]; then
    echo "There is an updated version available."
else
    echo "The current version is up to date."
fi
