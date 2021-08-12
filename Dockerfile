FROM openjdk:16-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
USER spring:spring
ENTRYPOINT ["java","-jar","app.jar"]