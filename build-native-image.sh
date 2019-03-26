./gradlew assemble
native-image --no-server --class-path build/libs/views-graal-*.jar
