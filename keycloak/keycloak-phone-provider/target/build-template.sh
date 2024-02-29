#!/bin/sh

if [ "$1" = "test" ] || [[ 2.3.4-snapshot = *"snapshot" ]] || [[ 2.3.4-snapshot = *"SNAPSHOT" ]]
then
  docker build -t coopersoft/keycloak:21.0.2_phone-2.3.4-snapshot .
else
  docker buildx build . --platform linux/amd64,linux/arm64 --push -t coopersoft/keycloak:21.0.2_phone-2.3.4-snapshot
fi
