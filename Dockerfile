#first stage build
FROM gradle:jdk11 AS builder
COPY . /home/maven/src
WORKDIR /home/maven/src
USER root
RUN gradle build

#second stage run
FROM openjdk:11-jre-slim
EXPOSE 8080
#COPY --from=builder /home/maven/src/target/*.jar /app/
COPY --from=builder /home/maven/src/build/libs/*.jar /app/
#not only the jar, copy the config txts too
COPY --from=builder /home/maven/src/lib/ojdbc8.jar /app/lib/
USER root
#copy the things here into lib
RUN chmod -R 777 /app
RUN ls -al /app
WORKDIR /app
CMD ["java", "-classpath","/app/lib/ojdbc8.jar", "-jar","gs-spring-boot-docker-0.1.0.jar"]

