#
# Package stage
#
FROM adoptopenjdk/openjdk11:latest

WORKDIR /opt

ENV PORT 8080

EXPOSE 8080

COPY target/*.jar /opt/SpringKubernates-1.0.0.jar

ENTRYPOINT exec java $JAVA_OPTA -jar SpringKubernates-1.0.0.jar