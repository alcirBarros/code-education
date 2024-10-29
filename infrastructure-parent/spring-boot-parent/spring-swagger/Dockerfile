FROM openjdk:17 as builder

WORKDIR /app

ARG JAR_FILE

RUN echo "JAR_FILE=$JAR_FILE"
RUN echo "COMPOSE_PROFILES=$COMPOSE_PROFILES"

ADD /target/$JAR_FILE .

ENTRYPOINT java -jar -Dspring.profiles.active=$COMPOSE_PROFILES *.jar














