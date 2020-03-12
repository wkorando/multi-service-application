FROM adoptopenjdk/openjdk8-openj9:alpine-slim

COPY target/multi-service-application.jar /

ENTRYPOINT ["java", "-jar", "multi-service-application.jar" ]
