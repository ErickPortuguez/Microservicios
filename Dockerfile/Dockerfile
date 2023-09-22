# Utiliza la imagen base Alpine con OpenJDK
FROM alpine:3.14

# Etiqueta del Dockerfile
LABEL maintainer="02_AngeloLaMadrid_JAVA"

# Actualiza el sistema e instala OpenJDK 11 y curl
RUN apk update && apk add --no-cache openjdk11-jre curl

# Establece el directorio para el .jar
WORKDIR /app

# Clonar el archivo microservicio
# Aqui debe ir el archivo microservicio.jar

# Comando para ejecutar el archivo .jar //debes tener el microservicio.jar y luego descomentar para iniciar el siguiente comando CMD
#CMD ["java", "-jar", "microservicio.jar"]