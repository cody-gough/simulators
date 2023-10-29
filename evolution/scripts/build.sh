#!/bin/sh
set -euo pipefail

./gradlew clean build
docker build ./main/ -t evolution-simulator:SNAPSHOT
