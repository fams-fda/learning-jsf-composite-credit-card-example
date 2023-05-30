FROM maven:3.8.5-openjdk-17 as builder
WORKDIR /usr/src/mymaven
COPY . /usr/src/mymaven/
CMD [ "mvn","clean", "compile", "package", "org.apache.tomee.maven:tomee-embedded-maven-plugin:run"]