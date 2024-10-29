package br.com.webserviceclient.configuracao.jersey.client.template;

import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

public class BasicAuthRestTemplateImpl extends RestTemplate implements BasicAuthRestTemplate {

    public BasicAuthRestTemplateImpl(HttpRestBasic httpRestBasic) {
        HttpComponentsClientHttpRequestFactoryBasicAuth httpComponentsClientHttpRequestFactoryBasicAuth = new HttpComponentsClientHttpRequestFactoryBasicAuth(httpRestBasic);
        httpComponentsClientHttpRequestFactoryBasicAuth.setConnectTimeout(1000);
        httpComponentsClientHttpRequestFactoryBasicAuth.setConnectionRequestTimeout(0);
        super.setRequestFactory(httpComponentsClientHttpRequestFactoryBasicAuth);
        
        
        String url = httpRestBasic.getUrl();
        System.out.println("RestTemplate Url: " + httpRestBasic.getUrl());

        DefaultUriBuilderFactory defaultUriBuilderFactory = new DefaultUriBuilderFactory(url);
        setUriTemplateHandler(defaultUriBuilderFactory);
    }

    public void authentication(String baseUrl, String username, String password) {
        if (StringUtils.isEmpty(username)) {
            throw new RuntimeException("Username is mandatory for Basic Auth");
        }
        setUriTemplateHandler(new DefaultUriBuilderFactory(baseUrl));

//        List<ClientHttpRequestInterceptor> interceptors = Collections.singletonList(new BasicAuthInterceptor(username, password));
//        setRequestFactory(new InterceptingClientHttpRequestFactory(getRequestFactory(), interceptors));
    }

}
