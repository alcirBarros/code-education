#Requisitos
Sistema operacional Linux (Opcional)
Git: 2.34.1
Java: openjdk 17.0.4 2022-07-19
Mavan: 3.6.3
Docker: 20.10.17
Docker Compose: 1.29.2


# Baixando e executando
git clone https://github.com/alcirBarros/desafio-atech.git
cd desafio-atech
docker-compose -f up -d
mvn install
mvn spring-boot:run


