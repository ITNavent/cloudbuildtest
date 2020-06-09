FROM openjdk:8-jdk-alpine
RUN mkdir -p /app/log
COPY build/libs/*.jar /app/app.jar
WORKDIR /app
RUN chmod a+x app.jar

EXPOSE 8080
ENTRYPOINT exec java -jar app.jar  > log/app.log
