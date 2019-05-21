./gradlew assemble
native-image --no-server --no-fallback --class-path build/libs/views-graal-*.jar --initialize-at-build-time=com.github.jknack.handlebars
