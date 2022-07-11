FROM openjdk:16-alpine3.13

WORKDIR /app

COPY .mvn/ *.jar
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["JAVA","jar", "/RestapiApp-0.0.1-SNAPSHOT.jar.original"]