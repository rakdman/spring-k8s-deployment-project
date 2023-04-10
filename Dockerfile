FROM openjdk:17-alpine
EXPOSE 8080
ADD target/spring-k8s-project.jar spring-k8s-project.jar
ENTRYPOINT ["java","-jar","/spring-k8s-project.jar"]