FROM openjdk:17-jdk-slim

WORKDIR /app

COPY ToDoAppServer/target/*.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]