FROM openjdk:8-jre-alpine
#VOLUME /tmp
COPY target/config-service-0.0.1-SNAPSHOT.jar /opt/config-service-0.0.1-SNAPSHOT.jar
#EXPOSE 8888
ENTRYPOINT exec java -jar /opt/config-service-0.0.1-SNAPSHOT.jar 