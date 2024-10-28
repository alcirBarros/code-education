//package br.com.webserviceclient.configuracao.jersey.client.template;
//
//import org.apache.http.HttpHost;
//import org.springframework.beans.factory.FactoryBean;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.http.client.ClientHttpRequestFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.util.DefaultUriBuilderFactory;
//
//@Component
//@Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
//class RestTemplateFactory implements FactoryBean<RestTemplate>, InitializingBean {
//
//    private RestTemplate restTemplate;
//
//    public RestTemplateFactory() {
//        super();
//    }
//
//    // API
//    @Override
//    public RestTemplate getObject() {
//        return restTemplate;
//    }
//
//    @Override
//    public Class<RestTemplate> getObjectType() {
//        return RestTemplate.class;
//    }
//
//    @Override
//    public boolean isSingleton() {
//        return false;
//    }
//
//    @Override
//    public void afterPropertiesSet() {
//        HttpHost host = new HttpHost("homologacao.multfacilcomercial.com.br", 8080, "http");
//
//        final ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactoryBasicAuth(host);
//        restTemplate = new RestTemplate(requestFactory);
//
//        DefaultUriBuilderFactory defaultUriBuilderFactory = new DefaultUriBuilderFactory(host.toURI().concat("/web/webservice"));
//        restTemplate.setUriTemplateHandler(defaultUriBuilderFactory);
//    }

//    @Override
//    public void afterPropertiesSet() {
//        HttpHost host = new HttpHost("localhost", 8080, "http");
//
//        final ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactoryBasicAuth(host);
//        restTemplate = new RestTemplate(requestFactory);
//
//        DefaultUriBuilderFactory defaultUriBuilderFactory = new DefaultUriBuilderFactory(host.toURI().concat("/webservice"));
//        restTemplate.setUriTemplateHandler(defaultUriBuilderFactory);
//
//        BasicAuthenticationInterceptor basicAuthorizationInterceptor = new BasicAuthenticationInterceptor("admin", "!@#facil");
//        restTemplate.getInterceptors().add(basicAuthorizationInterceptor);
//    }
//
//}
