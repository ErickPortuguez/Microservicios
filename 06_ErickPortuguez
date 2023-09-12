# Hecho por ErickPortuguez
# Nota: En algunos comandos uso --no-cache para evitar el almacenamiento en la caché lo que ayuda a mantener el tamaño de la imagen más pequeño
# Utiliza la imagen base Alpine 3.18
FROM alpine:3.18

# Etiqueta del Dockerfile
LABEL maintainer="06_ErickPortuguez"

# Actualizar el sistema e instala Python y curl
RUN apk update && apk add --no-cache python3 curl

# Crea una carpeta llamada "Microservicio" en el escritorio
RUN mkdir -p /root/Desktop/Microservicio


# Establece el directorio de trabajo dentro de la imagen
WORKDIR /root/Desktop/Microservicio

