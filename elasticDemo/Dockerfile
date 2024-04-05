# Use an OpenJDK base image
FROM eclipse-temurin:17-jdk-focal

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/elasticDemo-0.0.1-SNAPSHOT.jar /app

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Run the Spring Boot application when the container starts
CMD ["java", "-jar", "elasticDemo-0.0.1-SNAPSHOT.jar"]
