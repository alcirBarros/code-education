//package resp;
//
//import java.nio.charset.Charset;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.client.support.BasicAuthenticationInterceptor;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.web.client.RestTemplate;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//public class ValidarUsuarioRestTest {
//
//    @Test
//    public void test01() {
//
//        try {
//            String url = "https://homologacaointegracaosed.educacao.sp.gov.br/ncaapi/api/Usuario/ValidarUsuario";
//
//            BasicAuthenticationInterceptor basicAuthorizationInterceptor = new BasicAuthenticationInterceptor("rg665665665sp", "h7r6fu54;eU?", Charset.forName("UTF-8"));
//
//            RestTemplate restTemplate = new RestTemplate();
//            restTemplate.getInterceptors().add(basicAuthorizationInterceptor);
//
//            HttpHeaders requestHeaders = new HttpHeaders();
//            requestHeaders.add("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
//
//            HttpEntity<String> requestEntity = new HttpEntity<>(null, requestHeaders);
//
//            ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
//
//            System.out.println(exchange);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
