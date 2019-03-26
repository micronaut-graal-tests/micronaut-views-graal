FROM oracle/graalvm-ce:1.0.0-rc13 as graalvm
COPY . /home/app/views-graal
WORKDIR /home/app/views-graal
RUN native-image --no-server -cp build/libs/views-graal-*.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/views-graal .
ENTRYPOINT ["./views-graal"]
