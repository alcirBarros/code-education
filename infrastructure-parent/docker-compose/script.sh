#!/bin/bash

function principal() {
 echo "------------------------------------------"
 echo "Restauar Backup SaluteWeb"
 echo "------------------------------------------"
 echo "Opções:"
 echo
 echo "a. Conectar VPN Desenvolvimento"
 echo "b. Conectar VPN São Paulo"
 echo "2. Limpar Docker"
 echo "v. Versão Script"
 echo
 echo -n "Qual a opção desejada? "
 read OPTION
 options
 principal
}

function options(){
 case $OPTION in
  a) conectarVpn;;
  b) conectarVpnSaopaulo;;
  2) dockerPruneAll;;
  bb)dockerComposeUp;;
  v) versaoScript;;
  *) "Opção desconhecida." ; echo ; principal ;;
 esac
}

function conectarVpn(){
    sudo openvpn --config /home/alci.barros/Desenvolvimento/OpenVPN/Ifood/client.ovpn --auth-user-pass ~/Desenvolvimento/OpenVPN/Ifood/vpn.auth --auth-retry interact
}

function conectarVpnSaopaulo(){
    sudo openvpn --config /home/alci.barros/Desenvolvimento/OpenVPN/Ifood/vpn-saopaulo.dc.ifood.com.br/client.ovpn --auth-user-pass ~/Desenvolvimento/OpenVPN/Ifood/vpn.auth --auth-retry interact
}

function dockerConectMysql(){
    docker container exec -it eats.mysql mysql -upagamento -p eats_pagamento
}

function dockerPruneAll(){
    docker stop $(docker ps -a -q)
    docker system prune --all --force --volumes
    docker network prune
}

function migration(){
    ./flyway-migrate-db.sh dev sa-east-1-database-rw1.aws-development.dc-ifood.com ifoodoffice-card-service
}

function ktlint(){
    mvn antrun:run@ktlint-format
    mvn antrun:run@ktlint
}

function dockerComposeUp(){
  docker-compose -f docker-compose.yml up
}

function dockerComposeDown(){
  docker-compose -f docker-compose.yml down
}

function versaoScript(){
 echo "Versão Script: "$VERSAO_SCRIPT
}

while getopts "d:b12345678v" OPTION
do
 options
done

if [ $# -lt 1 ]; then
	principal
fi
