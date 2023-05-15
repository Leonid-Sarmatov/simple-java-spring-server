FROM adoptopenjdk:11-jre-hotspot
ADD /build/libs/Leonid-Sramatov-simple-java-server-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
