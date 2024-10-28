package br.com.webserviceclient.configuracao.jersey.client.template;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
@Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
class BasicAuthRestTemplateFactoryTest implements FactoryBean<BasicAuthRestTemplateImpl>, InitializingBean {

    private BasicAuthRestTemplateImpl restTemplate;

    public BasicAuthRestTemplateFactoryTest() {
        super();
    }

    @Override
    public BasicAuthRestTemplateImpl getObject() {
        return restTemplate;
    }

    @Override
    public Class<BasicAuthRestTemplateImpl> getObjectType() {
        return BasicAuthRestTemplateImpl.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() {
        
//        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
//        simpleClientHttpRequestFactory.setConnectTimeout(1000);
//        simpleClientHttpRequestFactory.setReadTimeout(0);

        HttpRestBasic httpRestBasic = new HttpRestBasic("http", "localhost", 8080, "/webservice");
        restTemplate = new BasicAuthRestTemplateImpl(httpRestBasic);

        BasicAuthenticationInterceptor basicAuthorizationInterceptor = new BasicAuthenticationInterceptor("user", "!@#facil");
        restTemplate.getInterceptors().add(basicAuthorizationInterceptor);
    }

}
