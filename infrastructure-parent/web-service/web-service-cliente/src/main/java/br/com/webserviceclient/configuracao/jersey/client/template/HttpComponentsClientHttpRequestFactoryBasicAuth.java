package br.com.webserviceclient.configuracao.jersey.client.template;

import java.net.URI;

import org.apache.http.HttpHost;
import org.apache.http.client.AuthCache;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

class HttpComponentsClientHttpRequestFactoryBasicAuth extends HttpComponentsClientHttpRequestFactory {

    private HttpRestBasic httpRestBasic;

    public HttpComponentsClientHttpRequestFactoryBasicAuth(HttpRestBasic httpRestBasic) {
        this.httpRestBasic = httpRestBasic;
    }

//    @Override
//    protected HttpContext createHttpContext(HttpMethod httpMethod, URI uri) {
//        AuthCache authCache = new BasicAuthCache();
//        BasicScheme basicAuth = new BasicScheme();
//        authCache.put(httpRestBasic.getHttpHost(), basicAuth);
//        BasicHttpContext localcontext = new BasicHttpContext();
//        localcontext.setAttribute(HttpClientContext.AUTH_CACHE, authCache);
//        return localcontext;
//    }

    @Override
    protected void postProcessHttpRequest(HttpUriRequest request) {
        super.postProcessHttpRequest(request); 
        request.addHeader("api", "v1");
    }

}
