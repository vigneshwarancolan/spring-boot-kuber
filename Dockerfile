FROM tomcat:8.0.51-jre8-alpine
#RUN rm -rf /usr/local/tomcat/webapps/*
COPY  target/docker-kuber-0.0.1-SNAPSHOT.jar docker-kuber-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "docker-kuber-0.0.1-SNAPSHOT.jar"]