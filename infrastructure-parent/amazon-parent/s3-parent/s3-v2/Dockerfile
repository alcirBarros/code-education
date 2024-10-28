FROM amazoncorretto:17

ARG JAR_FILE=target/s3*.jar

COPY $JAR_FILE app.jar

CMD ["java", "-jar", "app.jar"]

EXPOSE 8080
EXPOSE 5885