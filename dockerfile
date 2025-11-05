# Usa una imagen de Java
FROM openjdk:17-jdk-slim

# Directorio de trabajo
WORKDIR /app

# Copia el archivo jar ya compilado (ajusta el nombre según tu .jar)
COPY target/fleetguard360F3-0.0.1-SNAPSHOT.jar app.jar

# Puerto expuesto (ajusta si usas otro)
EXPOSE 8080

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]
