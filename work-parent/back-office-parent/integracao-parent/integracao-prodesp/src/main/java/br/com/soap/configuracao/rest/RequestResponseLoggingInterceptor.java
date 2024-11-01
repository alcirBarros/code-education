//package br.com.soap.configuracao.rest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpRequest;
//import org.springframework.http.client.ClientHttpRequestExecution;
//import org.springframework.http.client.ClientHttpRequestInterceptor;
//import org.springframework.http.client.ClientHttpResponse;
//import org.springframework.util.StreamUtils;
//
//import java.io.IOException;
//import java.nio.charset.Charset;
//import org.springframework.http.MediaType;
//
//public class RequestResponseLoggingInterceptor implements ClientHttpRequestInterceptor {
//
//    private final Logger log = LoggerFactory.getLogger(this.getClass());
//
//    @Override
//    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
//        logRequest(request, body);
//        ClientHttpResponse response = execution.execute(request, body);
//        logResponse(response);
//        return response;
//    }
//
//    private void logRequest(HttpRequest request, byte[] body) throws IOException {
//        
////        String authorizationHeader = "YYlW35bvTjLdVc+j6ozpvNnWvGvnlFRN/C3G9QQo8x6KaIeqJ3UlObKPs/QCBASxv5u5kPlGr4UUQejKp8GqrOrDtOzhvZbji3c2wZ/r6mQ1NlWVyN7A9tmWmk02zjjOBly+rKWpY7OoAWM74X6SZ02CSkE7wt19ZfvyY0aSAzIAPAqnY2TXSSGzjlU9BmvbZJKZGPtkCrWCVFu3fqCpTK0+hNcegdROzDBSfKjHBD06VnZX5cv+HIifgr6/nv9i1V7YNsHcElI6GWeVAMBkLrJ6sGgmtTsBWP1RbAL7WTkejhyM0Dx+Bp5zZq396DZjzv55rfleTTp1MlMSKFTD3ulZFrlVDgL5KuCY9koOv7ge5DtnmAVGFlmhiuOUOlZ2rbeT/wFfm4WhXGqXNFHeCg==";
////        
////        request.getHeaders().clear();
////        request.getHeaders().setContentType(MediaType.APPLICATION_JSON);
////        request.getHeaders().set("Authorization", "Bearer " + authorizationHeader);
////        request.getHeaders().set("User-Agent", "PostmanRuntime/7.13.0");
////        request.getHeaders().set("Accept", "*/*");
////        request.getHeaders().set("Cache-Control", "no-cache");
////        request.getHeaders().set("Postman-Token", "f498bf94-1909-47c1-8207-ced353f476ef");
////        request.getHeaders().set("Host", "homologacaointegracaosed.educacao.sp.gov.br");
////        request.getHeaders().set("accept-encoding", "gzip, deflate");
////        request.getHeaders().set("content-length", "87");
////        request.getHeaders().set("Connection", "keep-alive");
//        
//        
//        if (log.isDebugEnabled()) {
//            log.debug("===========================request begin================================================");
//            log.debug("URI         : {}", request.getURI());
//            log.debug("Method      : {}", request.getMethod());
//            log.debug("Headers     : {}", request.getHeaders());
//            log.debug("Request body: {}", new String(body, "UTF-8"));
//            log.debug("==========================request end================================================");
//        }
//    }
//
//    private void logResponse(ClientHttpResponse response) throws IOException {
//        if (log.isDebugEnabled()) {
//            log.debug("============================response begin==========================================");
//            log.debug("Status code  : {}", response.getStatusCode());
//            log.debug("Status text  : {}", response.getStatusText());
//            log.debug("Headers      : {}", response.getHeaders());
//            log.debug("Response body: {}", StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
//            log.debug("=======================response end=================================================");
//        }
//    }
//}
