./gradlew assemble
native-image --no-server --no-fallback --class-path build/libs/views-graal-*.jar -H:+ReportExceptionStackTraces \
    --initialize-at-build-time=sun.security.provider.NativePRNG
