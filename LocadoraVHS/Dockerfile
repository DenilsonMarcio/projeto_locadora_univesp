FROM ubuntu:10.04 AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y

COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:8-jdk-slim

EXPOSE 8080

COPY --from=build /target/locadora-1.0.0.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]