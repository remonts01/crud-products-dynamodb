FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/crud-products-dynamodb-1.0.0.jar crud-products-dynamodb-1.0.0.jar
EXPOSE 8080
CMD ["java", "-jar", "crud-products-dynamodb-1.0.0.jar"]