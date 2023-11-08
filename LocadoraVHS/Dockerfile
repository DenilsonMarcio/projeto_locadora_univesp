FROM ubuntu:10.04 AS build

# Install required packages
RUN apt-get update && apt-get install -y openjdk-17-jdk maven

# Set the working directory
WORKDIR /app

# Copy only the necessary files into the build context
COPY pom.xml .
COPY src ./src

# Build the project
RUN mvn clean install

# Final stage
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Expose the port
EXPOSE 8080

# Copy the JAR file from the build stage
COPY --from=build /app/target/locadora-1.0.0.jar app.jar

# Define the entry point
ENTRYPOINT ["java", "-jar", "app.jar"]
