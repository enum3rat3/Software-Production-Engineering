FROM maven AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package

FROM openjdk:17

WORKDIR /app

COPY --from=build  /app/target/calculator-1.0.jar .

CMD ["java", "-cp", "calculator-1.0.jar", "com.enum3rat3.Calc"]