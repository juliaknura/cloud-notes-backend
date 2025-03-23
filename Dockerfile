FROM openjdk:17-alpine
WORKDIR /app
COPY pom.xml mvnw mvnw.cmd ./
COPY .mvn/ ./.mvn
RUN ./mvnw dependency:go-offline
COPY src ./src
EXPOSE 8080
CMD ["./mvnw", "spring-boot:run"]