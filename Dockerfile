FROM openjdk:17
EXPOSE 8082
ADD target/AQE205615.jar AQE205615.jar
ENTRYPOINT ["Java,"-jar","/AQE205615.jar"]