./gradlew assemble
native-image --no-fallback --class-path build/libs/views-graal-*-all.jar
