# About
This is a simple example web project that uses a JSF component built with ui:composite.

3 simple components create a list of a customer's credit/debit cards with a component to perform actions on the project.

- lock / unlock
- enable international purchases
- enable contactless purchases
- Access purchase extract

The cardControls component can be enabled and disabled via the enableControls property set on the cardComponent.

The components are in the src/webapp/resources/card directory.

A responsive css with CSS flexbox is applied to align the objects.

Technologies.
- Java 17
- css3
- html5
- JSF 4.0
- Primefaces 12
- TomEE 9 - embedded
- Maven 3.6.3

Standards.
- MVC
- CQRS (Segregation of Command and Consultation Responsibility)
- DDD (Domain Driven Design)
- Clean Architecture

# Build

if you have docker installed. Compile and run:

    docker run -it --rm --name my-maven-project -p 8080:8080 -v maven-repo:/root/.m2 -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3.8.5-openjdk-17 mvn clean compile package org.apache.tomee.maven:tomee-embedded-maven-plugin:run

If you prefer to use java 17 on your machine:

    mvn clean compile package

# Run
    mvn org.apache.tomee.maven:tomee-embedded-maven-plugin:run

# Access
    http://localhost:8080/index.jsf

Card component is responsive using flexbox css.