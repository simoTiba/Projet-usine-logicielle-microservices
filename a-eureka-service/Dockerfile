FROM openjdk:8-jre-alpine
#VOLUME /tmp
COPY target/eureka-service-0.0.1-SNAPSHOT.jar /opt/eureka-service-0.0.1-SNAPSHOT.jar
#EXPOSE 8761
ENTRYPOINT exec java -jar /opt/eureka-service-0.0.1-SNAPSHOT.jar 