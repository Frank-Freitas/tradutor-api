# 1) Imagem base com Java
FROM openjdk:17-jdk-alpine

# 2) Cria a pasta de trabalho dentro do container
WORKDIR /app

# 3) Copia o JAR compilado pra dentro do container
COPY target/translate-0.0.1-SNAPSHOT.jar app.jar

# 4) Expõe a porta que o Spring Boot usa
EXPOSE 8080

# 5) Comando pra rodar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]