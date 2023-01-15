FROM openjdk:11-jre-slim
CMD ["mvn", "clean", "install"]
COPY build/libs/*.jar app.jar
EXPOSE 6969
EXPOSE 2137
CMD ["java", "-jar", "*.jar"]