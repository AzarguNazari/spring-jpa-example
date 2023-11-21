#!/bin/bash

BRANCH="main"

if [ -n "$(git status --porcelain)" ]; then
    git status --porcelain | while read -r line; do
        FILE=$(echo "$line" | awk '{print $2}')
        COMMIT_MESSAGE="Change (refactored) to $FILE"
        git add "$FILE"
        git commit -m "$COMMIT_MESSAGE"
    done

    git push

    echo "Changes committed and pushed to $BRANCH branch."
else
    echo "No changes in the working directory. Nothing to commit."
fi