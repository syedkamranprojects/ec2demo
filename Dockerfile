FROM openjdk:24-jdk
EXPOSE 9191
ADD  target/ec2demo.jar ec2demo.jar
ENTRYPOINT ["java","-jar","/ec2demo.jar"]

