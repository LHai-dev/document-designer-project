#FROM gradle:8.4-jdk17-alpine As builder
#WORKDIR /app
#COPY / .
## Build the application
#RUN gradle build --no-daemon
FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /app
COPY / .
# Build the application
RUN mvn clean install

FROM openjdk:17
## Copy the jar file from the build/libs directory to the Docker image
COPY --from=builder /app/target/doc-api-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 9091
#,"-Dspring.profiles.active=stage"
