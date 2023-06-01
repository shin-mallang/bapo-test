FROM openjdk:11

WORKDIR /usr/src/app

ARG JAR_PATH=./build/libs
ARG SOURCE_JAR_FILE=*.jar
ARG MY_JAR_NAME=mallang-app

COPY ${JAR_PATH}/${SOURCE_JAR_FILE} ${JAR_PATH}/${MY_JAR_NAME}.jar

ENTRYPOINT ["java","-jar","./build/libs/mallang-app.jar"]
