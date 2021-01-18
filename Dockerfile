FROM openjdk:14
ADD target/sews-docker-spring.jar sews-docker-spring.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "sews-docker-spring.jar"]