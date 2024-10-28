//package resp;
//
//import br.com.soap.configuracao.rest.RequestResponseLoggingInterceptor;
//import java.util.Collections;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.web.client.HttpServerErrorException.InternalServerError;
//import org.springframework.web.client.RestTemplate;
//
////@ActiveProfiles({"test"})
////@RunWith(SpringJUnit4ClassRunner.class)
////@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//@ActiveProfiles({"test"})
//@RunWith(SpringJUnit4ClassRunner.class)
////@SpringBootTest(classes = {SpringBootSoapConsumer.class})
//public class ExibirFichaAlunoRestTest {
//
////
////    @Autowired
////    private
//    @Test
//    public void test01() {
//        ResponseEntity<Object> exchange;
//
//        try {
//            String url = "https://homologacaointegracaosed.educacao.sp.gov.br/ncaapi/api/Aluno/ExibirFichaAluno";
//            String authorizationHeader = "YYlW35bvTjLdVc+j6ozpvNnWvGvnlFRN/C3G9QQo8x6KaIeqJ3UlObKPs/QCBASxv5u5kPlGr4UUQejKp8GqrOrDtOzhvZbji3c2wZ/r6mQ1NlWVyN7A9tmWmk02zjjOBly+rKWpY7OoAWM74X6SZ02CSkE7wt19ZfvyY0aSAzIAPAqnY2TXSSGzjlU9BmvbZJKZGPtkCrWCVFu3fqCpTK0+hNcegdROzDBSfKjHBD06VnZX5cv+HIifgr6/nv9i1V7YNsHcElI6GWeVAMBkLrJ6sGgmtTsBWP1RbAL7WTkejhyM0Dx+Bp5zZq396DZjzv55rfleTTp1MlMSKFTD3ulZFrlVDgL5KuCY9koOv7ge5DtnmAVGFlmhiuOUOlZ2rbeT/wFfm4WhXGqXNFHeCg==";
//
//            RestTemplate restTemplate = new RestTemplate();
////            restTemplate.setInterceptors(Collections.singletonList(new RequestResponseLoggingInterceptor()));
//
//            HttpHeaders requestHeaders = new HttpHeaders();
//            requestHeaders.setContentType(MediaType.APPLICATION_JSON);
//            requestHeaders.set("Authorization", "Bearer "+authorizationHeader);
//            
////            requestHeaders.set("User-Agent", "PostmanRuntime/7.13.0");
//            requestHeaders.set("Accept", "*/*");
//            requestHeaders.set("Cache-Control", "no-cache");
////            requestHeaders.set("Postman-Token", "f498bf94-1909-47c1-8207-ced353f476ef");
//            requestHeaders.set("Host", "homologacaointegracaosed.educacao.sp.gov.br");
////            requestHeaders.set("accept-encoding", "gzip, deflate");
//            requestHeaders.set("content-length", "2");
//            requestHeaders.set("Connection", "keep-alive");
//            requestHeaders.set("Accept-Charset", "UTF-8");
//            
//            
//            
//
//            String string = new String();
//            string = "{}";
//            HttpEntity<Object> requestEntity = new HttpEntity<>(string, requestHeaders);
//
//            exchange = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Object.class);
//
//            System.out.println(exchange);
//
//        } catch (Exception e) {
//            InternalServerError a = (InternalServerError) e;
//            String responseBodyAsString = a.getResponseBodyAsString();
//            e.printStackTrace();
//        }
//
//    }
//
//}
