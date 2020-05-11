./gradlew assemble
native-image --no-server --no-fallback --static --class-path build/libs/views-graal-*-all.jar --native-image-info --verbose
