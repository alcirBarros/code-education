//package br.com.webserviceclient.configuracao.jersey.client;
//
//import java.security.AccessControlException;
//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.client.Entity;
//import javax.ws.rs.client.WebTarget;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import org.glassfish.jersey.client.ClientConfig;
//import org.glassfish.jersey.client.ClientProperties;
//import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
//import org.glassfish.jersey.jackson.JacksonFeature;
//import org.springframework.http.HttpStatus;
//
//public abstract class JerseyRestClient {
//
//    protected static String SERVICE_URL = "http://localhost:8080/webservice";
//    protected static HttpAuthenticationFeature httpAuthenticationFeature = HttpAuthenticationFeature.digest();
//
//    private WebTarget target;
//
//    private final ClientConfig clientConfig = new ClientConfig();
//
//    private Response requestValidateted(Response response) {
//        HttpStatus resolve = HttpStatus.resolve(response.getStatus());
//        if (resolve != null && resolve.is4xxClientError()) {
//            throw new AccessControlException(resolve.getReasonPhrase());
//        }
//        return response;
//    }
//
//    protected void clientConfig() {
//        clientConfig.property(ClientProperties.READ_TIMEOUT, 30000);
//        clientConfig.property(ClientProperties.CONNECT_TIMEOUT, 5000);
//    }
//
//    protected void onStartup(String uri, HttpAuthenticationFeature httpAuthenticationFeature) {
//        Client client = ClientBuilder.newClient(clientConfig);
//        client.register(new JacksonFeature());
//        client.register(httpAuthenticationFeature);
//        target = client.target(uri);
//    }
//
//    protected Response requestGet(final String path) {
//        WebTarget webTarget = target.path(path);
//        Response response = webTarget.request(MediaType.APPLICATION_JSON).get();
//        return requestValidateted(response);
//    }
//
//    protected <T> Response requestPost(String path, T registro) {
//        WebTarget webTarget = target.path(path);
//        Entity<T> entity = Entity.entity(registro, MediaType.APPLICATION_JSON_TYPE);
//        Response response = webTarget.request(MediaType.APPLICATION_JSON).post(entity, Response.class);
//        return requestValidateted(response);
//    }
//}
