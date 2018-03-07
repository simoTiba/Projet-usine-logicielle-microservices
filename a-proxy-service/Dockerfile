FROM openjdk:8-jre-alpine
#VOLUME /tmp
COPY target/proxy-service-0.0.1-SNAPSHOT.jar /opt/proxy-service-0.0.1-SNAPSHOT.jar
#EXPOSE 9999
ENTRYPOINT exec java -jar /opt/proxy-service-0.0.1-SNAPSHOT.jar 