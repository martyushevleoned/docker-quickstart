FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/docker-quickstart-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]