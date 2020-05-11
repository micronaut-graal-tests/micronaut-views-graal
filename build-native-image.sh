git checkout no-static
./gradlew assemble
native-image --no-server --no-fallback --class-path build/libs/views-graal-*-all.jar
