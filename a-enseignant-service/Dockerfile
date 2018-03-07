FROM openjdk:8-jre-alpine
#VOLUME /tmp
COPY target/enseignant-service-0.0.1-SNAPSHOT.jar /opt/enseignant-service-0.0.1-SNAPSHOT.jar
#EXPOSE 2222
ENTRYPOINT exec java -jar /opt/enseignant-service-0.0.1-SNAPSHOT.jar 