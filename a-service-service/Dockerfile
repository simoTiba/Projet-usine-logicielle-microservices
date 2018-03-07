FROM openjdk:8-jre-alpine
#VOLUME /tmp
COPY target/services-service-0.0.1-SNAPSHOT.jar /opt/services-service-0.0.1-SNAPSHOT.jar
#EXPOSE 1111
ENTRYPOINT exec java -jar /opt/services-service-0.0.1-SNAPSHOT.jar