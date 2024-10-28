FROM openjdk:11
RUN apt-get update
WORKDIR /tmp/workdir

#RUN apt-get update
#
#RUN apt-get install -y \
#    ca-certificates \
#    tzdata
#
#COPY ./alelo-cloud-*.pem /usr/local/share/ca-certificates/
#
#RUN update-ca-certificates
#RUN keytool -importcert -alias alelo-cloud-pet    -keypass changeit -file /usr/local/share/ca-certificates/alelo-cloud-pet.pem      -keystore /usr/local/openjdk-11/lib/security/cacerts -noprompt -storepass changeit
#RUN keytool -importcert -alias alelo-cloud-mgr    -keypass changeit -file /usr/local/share/ca-certificates/alelo-cloud-mgr.pem      -keystore /usr/local/openjdk-11/lib/security/cacerts -noprompt -storepass changeit
#RUN keytool -importcert -alias alelo-cloud-com-br -keypass changeit -file /usr/local/share/ca-certificates/alelo-cloud-com-br.pem   -keystore /usr/local/openjdk-11/lib/security/cacerts -noprompt -storepass changeit
#
#RUN ls /usr/share/zoneinfo
#
#RUN cp /usr/share/zoneinfo/America/Bahia /etc/localtime
#
#RUN echo "America/Bahia" >  /etc/timezone
# sudo timedatactl set-timezone America/Bahia




COPY target/client-ssl-1.0-SNAPSHOT.jar target/client-ssl-1.0-SNAPSHOT.jar
COPY ./src/main/resources/certificate.p12 /usr/local/share/ca-certificates/

#RUN keytool -import -alias certificate.p12-alias  -keypass changeit -file /usr/local/share/ca-certificates/certificate.p12  -keystore /usr/local/openjdk-11/lib/security/cacerts -noprompt -storepass changeit

COPY entrypoint.sh /

ENTRYPOINT ["/entrypoint.sh"]