FROM java:openjdk-8-jdk

ADD target/demo-swarm.jar /opt/demo-swarm.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/demo-swarm.jar"]