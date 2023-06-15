FROM openjdk:17-alpine
ADD target/mydemojar.jar mydemojar.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar",  "mydemojar.jar"]