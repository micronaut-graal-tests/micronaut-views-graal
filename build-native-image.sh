./gradlew assemble
native-image --no-server --no-fallback --class-path build/libs/views-graal-*.jar --initialize-at-build-time=ch.qos.logback,com.fasterxml.jackson,fresh.graal,io.micronaut,io.netty,io.reactivex,org.reactivestreams,org.slf4j,org.yaml.snakeyaml,javax
