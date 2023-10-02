FROM openjdk:19

#dossier de travail de docker
WORKDIR /travail

#ENV PORT 8093 ???

#copier le target/.jar dans l'image
##COPY target/dock_spring-0.0.1-SNAPSHOT.jar /travail/dock_spring-0.0.1-SNAPSHOT.jar
COPY target/*.jar /travail/app.jar
#COPY target/*.jar /app.jar

#la commande qui éxécute le projet
#ENTRYPOINT ["java", "-jar", "/docker18-demo-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080
