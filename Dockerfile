# Java 17 runtime as a parent image
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/votingservice-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "votingservice-0.0.1-SNAPSHOT.jar" ]