FROM openjdk:17-jdk-slim AS build
COPY ./target/todoapp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
