FROM maven:3.8.3-openjdk-17 as BUILD-APPS

LABEL DEVELOPER="gemardy@gmail.com"
LABEL APPS-NAME="upload-document-service"
WORKDIR /build-apps

COPY . /build-apps/

RUN echo $(ls /build-apps/)

RUN mvn clean install -Dmaven.test.skip -q
RUN ls -ltr

FROM openjdk:17-alpine as RUN-APPS
USER root
LABEL DEVELOPER="gemardy@gmail.com"
LABEL APPS-NAME="upload-document-service"
WORKDIR /apps
COPY --from=BUILD-APPS /build-apps/target/*.jar /apps/apps.jar
RUN ls -ltr
ENTRYPOINT [ "java","-jar","apps.jar"]
