#!/bin/bash
# exit immediately if any unexpected error occurs
set -e

# Get clones of OpenJ9 absent repositories
git pull

cd ./openj9
git pull

cd ../omr
git pull


