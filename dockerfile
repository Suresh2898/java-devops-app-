FROM eclipse-temurin:17-jre

LABEL maintainer="suresh"

WORKDIR /app

COPY target/java-devops-app-1.0.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]