FROM openjdk:11

LABEL maintainer="Vikrant Sonawane"

WORKDIR /usr/local/bin/

COPY target/product-service-0.0.1-SNAPSHOT.jar product-service.jar


CMD ["java","-jar","product-service.jar"]
