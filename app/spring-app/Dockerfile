FROM adoptopenjdk/openjdk11:jdk-11.0.6_10-alpine-slim

COPY ./target/*.jar app.jar

EXPOSE 8080

WORKDIR /app

ENTRYPOINT ["java", "-jar", "/app.jar"]