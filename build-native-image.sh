#!/bin/bash

./gradlew nativeCompile
cp build/native/nativeCompile/views-pebble .
