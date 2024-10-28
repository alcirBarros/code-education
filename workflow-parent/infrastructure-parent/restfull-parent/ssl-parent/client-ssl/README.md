https://github.com/isaccanedo/X.509-Authentication-in-Spring-Security

Todos os comandos devem ser executados na raiz do projeto.

-----

[ca] criando autoridade certificadora

openssl req -x509 -sha256 -days 3650 -newkey rsa:4096 -passout pass:changeit -keyout script/01-ca/rootCA.key -out script/01-ca/rootCA.crt
'Country Name (2 letter code) [AU]' SP
'State or Province Name (full name) [Some-State]': São Paulo
'Locality Name (eg, city)': São Paulo
'Organization Name (eg, company) [Internet Widgits Pty Ltd]': Alelo
'Organizational Unit Name (eg, section) []': Alelo
'Common Name (e.g. server FQDN or YOUR name) []': Alelo.com
'Email Address []':

Arquivos 'rootCA.crt' e 'rootCA.key' criado com sucesso.

------

[servidor] criando certificado não assinado

openssl req -newkey rsa:2048 -passout pass:changeit -keyout script/02-servidor/localhost.key -out script/02-servidor/localhost.csr
'Country Name (2 letter code) [AU]': SP
'State or Province Name (full name) [Some-State]': São Paulo
'Locality Name (eg, city) []': São Paulo
'Organization Name (eg, company) [Internet Widgits Pty Ltd]': Alelo
'Organizational Unit Name (eg, section) []': Alelo
'Common Name (e.g. server FQDN or YOUR name) []': Alelo
'Email Address []':
'A challenge password': changeit
'An optional company name []': Alelo

Arquivos 'localhost.crt' e 'localhost.key' criados com sucesso.

------

[ca] assinando o certificado utilizando a autoridade certificadora

openssl x509 -req -CA script/01-ca/rootCA.crt -CAkey script/01-ca/rootCA.key -in script/02-servidor/localhost.csr -out script/03-certificate/localhost.crt -days 365 -CAcreateserial -extfile script/localhost.ext
'Enter pass phrase for script/01-ca/rootCA.key': changeit

Arquivo 'localhost.crt' criado com sucesso.

openssl x509 -in localhost.crt -text

------

[servidor] empacotar certificado assinado junto com chave privado

openssl pkcs12 -export -out script/03-certificate/localhost.p12 -name "localhost" -inkey script/02-servidor/localhost.key -in script/03-certificate/localhost.crt
'Enter pass phrase for script/02-servidor/localhost.key': changeit
'Enter Export Password': changeit
'Verifying - Enter Export Password': changeit

Arquivo 'localhost.p12' criado com sucesso.

keytool -v -list -storetype pkcs12 -keystore localhost.p12

------

[servidor] armazenar p12 no repositório keystore

keytool -importkeystore -srckeystore script/03-certificate/localhost.p12 -srcstoretype PKCS12 -destkeystore script/03-certificate/keystore.jks -deststoretype pkcs12
'Informe a senha da área de armazenamento de chaves de origem': changeit

Arquivo 'keystore.jks' criado com sucesso.

keytool -list -v -keystore keystore.jks

------

    [Google Chrome] Instalação da Autoridade Certificadora CA
    Abrir menu de Configurações
        Segurança e privacidade
            Segurança
                Gerenciar Certificados
                    Autoridades
                        Importar: rootCA.crt
                            Yes: Confiar neste certificado para a identificação de websites.
                            Yes: Confiar neste certificado para identificar usuários de e-mail
                            Yes: Confiar neste certificado para a identificação de criadores de software a
                        chrome://restart