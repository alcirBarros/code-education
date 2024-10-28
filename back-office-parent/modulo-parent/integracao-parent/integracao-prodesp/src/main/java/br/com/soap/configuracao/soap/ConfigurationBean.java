package br.com.soap.configuracao.soap;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class ConfigurationBean {

//    @Value("#{'${prodesp.homologacao.uri}'}")
//    private String serviceEndpoint;
    protected final String URL = "https://homologacaointegracaosed.educacao.sp.gov.br/educacao/Sec.BS.SecretariaMunicipal.cls";

    @PostConstruct
    private void init() {
        System.out.println("br.com.soap.configuracao.soap.ConfigurationBean.init()");
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//
//    @Bean
//    public SaajSoapMessageFactory messageFactory() {
//        SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
//        messageFactory.afterPropertiesSet();
//        return messageFactory;
//    }
//
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("br.gov.sp.educacao.ensemble");
        return marshaller;
    }
//
//    @Bean
//    public HttpComponentsMessageSender httpComponentsMessageSender() throws Exception {
//        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
//        httpComponentsMessageSender.setHttpClient(httpClient());
//
//        return httpComponentsMessageSender;
//    }
//
//    public CloseableHttpClient httpClient() throws Exception {
//        RemoveSoapHeadersInterceptor removeSoapHeadersInterceptor = new RemoveSoapHeadersInterceptor();
//
//        CloseableHttpClient build = HttpClientBuilder.create().setSSLSocketFactory(sslConnectionSocketFactory())
//                .addInterceptorFirst(removeSoapHeadersInterceptor).build();
//
//        return build;
//    }
//
//    public SSLConnectionSocketFactory sslConnectionSocketFactory() throws Exception {
//        return new SSLConnectionSocketFactory(sslContext(), NoopHostnameVerifier.INSTANCE);
//    }
//
//    public SSLContext sslContext() throws Exception {
//        return SSLContextBuilder.create().build();
//    }
//
    @Bean
    public WebServiceTemplate webServiceTemplate() throws Exception {
//        WebServiceTemplate webServiceTemplate = new WebServiceTemplate(messageFactory());
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller());
        webServiceTemplate.setUnmarshaller(marshaller());
//        webServiceTemplate.setMessageSender(messageSender());
        webServiceTemplate.setDefaultUri(URL);
//        webServiceTemplate.setMessageSender(httpComponentsMessageSender());
        return webServiceTemplate;
    }
//
//    @Bean
//    public HttpComponentsMessageSender messageSender() {
//        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
//        return httpComponentsMessageSender;
//    }
}
