FROM java:8

ADD springbootchapter10-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/app.jar"]
#
#COPY docker/base/jdk-8u181-linux-x64.tar.gz /data/soft/
#RUN cd /data/soft && tar -zxvf jdk-8u181-linux-x64.tar.gz
#ENV JAVA_HOME /data/soft/jdk1.8.0_181


