#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER smart-find-parking-system

# Add the application's jar to the container
COPY target/config-server-service-1.0.jar config-server-service-1.0.jar

#execute the application
ENTRYPOINT ["java","-jar","/config-server-service-1.0.jar"]