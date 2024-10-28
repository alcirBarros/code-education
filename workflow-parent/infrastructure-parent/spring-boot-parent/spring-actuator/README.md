
# Requisitos 
* Sistema operacional Linux (Opcional)
* Git: 2.34.1
* Java: openjdk 17
* Mavan: 3.6.3
* Docker: 20.10.17
* Docker Compose: 1.29.2

# Executar projeto 
```shell
mvn install
mvn spring-boot:run
```

## Executar imagem docker
```shell
docker run -p 8080:8080 alcirbarros/educa-facil:0.0.1-SNAPSHOT
```

## Utilizando

Para utilizar o Postman Collection, execute a ação abaixo

[![Run in Postman](https://run.pstmn.io/button.svg)](https://www.postman.com/educafacil/workspace/3337e2cb-8e48-4ff6-a6d1-dcafd2a98e87/request/9776355-5f5af3ac-484e-43e4-b268-5e8c4027a833)

## Acessar link local
[http://localhost:8080/](http://localhost:8080/)

---

## Comandos do plugin dockerfile 
```shell
mvn dockerfile:push
```
