package com.soapclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ClientAppConfig {

//    @Value("${client.default-uri}")
//    private String defaultUri;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.concretepage.wsdl");
        return marshaller;
    }

    @Bean
    public StudentClientService studentClient(Jaxb2Marshaller marshaller) {
        StudentClientService client = new StudentClientService();
        client.setDefaultUri("http://homologacao.multfacilcomercial.com.br/web/soapws/articles.wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
