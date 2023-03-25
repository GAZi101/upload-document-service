FROM openjdk:17 as RUN-APPS
LABEL DEVELOPER="gemardy@gmail.com"
LABEL APPS-NAME="upload-document-service"
USER root
WORKDIR /apps
#COPY --from=BUILD-APPS /build-apps/app/target/*.jar /apps/apps.jar
COPY target/*.jar /apps/app.jar
RUN ls -ltr
ENTRYPOINT [ "java","-jar","app.jar"]
