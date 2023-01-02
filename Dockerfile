FROM openjdk
MAINTAINER hamid
WORKDIR /usr/src/myapp
COPY . /usr/src/myapp/
ADD target/Example3-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]