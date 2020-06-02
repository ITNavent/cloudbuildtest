FROM openjdk:8-jdk-alpine
RUN mkdir -p /app/log
COPY build/libs/*.jar /app/api.jar
WORKDIR /app
RUN chmod a+x api.jar

EXPOSE 8080
ENTRYPOINT exec java -jar api.jar  > log/api.log