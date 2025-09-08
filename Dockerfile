FROM openjdk:24-jdk
ADD  target/ec2demo.jar ec2demo.jar
ENTRYPOINT ["java","-jar","/ec2demo.jar"]

