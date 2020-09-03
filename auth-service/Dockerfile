FROM openjdk:11.0
WORKDIR /opt/app
ARG JAR_FILE=build/libs/*.jar
COPY $JAR_FILE app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]