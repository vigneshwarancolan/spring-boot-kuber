FROM maven:3.6.3-jdk-11

WORKDIR ./docker-kuber

COPY . .

CMD mvn clean install 

CMD mvn spring-boot:run