
#Criando a imagem docker com o dockerfile maven
mvn package

#Testando o projeto com a imagem docker gerada
docker run -p 8080:8080 alcirbarros/educa-facil:0.0.1-SNAPSHOT

#Acessar link local
http://localhost:8080/actuator

#Enviando imagem docker para o docker hub

&: docker login

mvn dockerfile:build

mvn dockerfile:push

