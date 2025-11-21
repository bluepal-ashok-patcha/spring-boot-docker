FROM  eclipse-temurin:17-jdk

COPY target/spring-boot-docker-app-0.0.1-SNAPSHOT.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT [ "java", "-jar" , "spring-boot-docker-app-0.0.1-SNAPSHOT.jar" ]
