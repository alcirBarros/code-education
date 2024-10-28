package br.com.webserviceclient.configuracao.jersey.client.template;

import org.apache.http.HttpHost;


public class HttpRestBasic  {

    private final String scheme;
    private final String hostname;
    private final int port;
    private final String path;

    public HttpRestBasic(String scheme, String hostname, int port, String path) {
        this.scheme = scheme;
        this.hostname = hostname;
        this.port = port;
        this.path = path;
    }

    public HttpHost getHttpHost() {
        return new HttpHost(hostname, port, scheme);
    }

    public String getUrl() {
        StringBuilder url = new StringBuilder();
        url.append(scheme).append("://");
        url.append(hostname).append(":");
        url.append(port).append(path);
        return url.toString();
    }
    
    

}
