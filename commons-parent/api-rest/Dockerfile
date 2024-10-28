FROM openjdk:17
LABEL authors="CXXXXXXX"

ARG env

RUN echo $env

COPY target/api-rest-0.0.1-SNAPSHOT.jar application.jar

COPY entrypoint.sh /

ENTRYPOINT ["/entrypoint.sh"]
