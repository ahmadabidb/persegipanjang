FROM openjdk:8-jdk-alpine
RUN mkdir -p /app
WORKDIR /app

COPY app.java /app

#compile file java
RUN javac App.java

#running java
CMD ["java","App"]