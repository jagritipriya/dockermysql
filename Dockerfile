FROM openjdk:8
VOLUME /tmp
ADD target/dockermysql.jar dockermysql.jar
EXPOSE 8093
ENTRYPOINT ["java","-jar","dockermysql.jar"]