FROM openjdk:8-jre-alpine
#VOLUME /tmp
COPY target/diplome-service-0.0.1-SNAPSHOT.jar /opt/diplome-service-0.0.1-SNAPSHOT.jar
#EXPOSE 3333
ENTRYPOINT exec java -jar /opt/diplome-service-0.0.1-SNAPSHOT.jar