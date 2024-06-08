FROM openjdk:17-alpine
EXPOSE 8080
COPY target/*.jar order-cicd-service.jar
ENTRYPOINT ["java","-jar","/order-cicd-service.jar"]