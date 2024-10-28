//package resp;
//
//import java.util.Arrays;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.converter.StringHttpMessageConverter;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.web.client.HttpServerErrorException.InternalServerError;
//import org.springframework.web.client.RestTemplate;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//public class ListarInscricoesAlunoRestTest {
//
//    @Test
//    public void test01() {
//        try {
//            String url = "https://homologacaointegracaosed.educacao.sp.gov.br/ncaapi/api/Aluno/ExibirFichaAluno";
//            String authorizationHeader = "YYlW35bvTjLdVc+j6ozpvNnWvGvnlFRN/C3G9QQo8x44CH04TFnRsVLfP72UkhGsgGcSkRqfCmdnIVlsVQp+5frxuFlDsLs/01zxiuG+8qW10r2bKsfg1W/tZ8+aOgp5RxM9JzAXxBGd2+dB22VtaaBfxgudbqdZHg6pUbWLlYxBaN1jOLQtceKprO+iayvnOFruAeS/KpBzo8yZTN90GHCW0CRO2pfZnEDY8q3Wu03fdM78u7PIp/+EgDW76+W27wNFY29iPCylYLZ2NUgn2q7LHqhzMVqw2DF04qbMsjASAJljjaCvdRQL14h15pfyPu2LciDe8EegDZZpph0d+n2PnoC+4xT56ajMPROXB4yOeqozTJtEymP8g9RO7O3u0hqFM+PiJF3tGasXlRRKVA==";
//
//            RestTemplate restTemplate = new RestTemplate();
//            restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
//
//            HttpHeaders requestHeaders = new HttpHeaders();
//            requestHeaders.setContentType(MediaType.APPLICATION_JSON);
//            requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//
//            requestHeaders.setBearerAuth(authorizationHeader);
//
//            String body = "{\"inAluno\":{\"inNumRA\":116584739,\"inDigitoRA\":5,\"inSiglaUFRA\":\"SP\"}}";
//            
//            HttpEntity<String> requestEntity = new HttpEntity<>(body, requestHeaders);
//
//            ResponseEntity<Object> exchange = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Object.class);
//
//            System.out.println(exchange);
//
//        } catch (Exception e) {
//            InternalServerError a = (InternalServerError) e;
//            String responseBodyAsString = a.getResponseBodyAsString();
//            System.out.println(responseBodyAsString);
//            e.printStackTrace();
//        }
//    }
//
//    class inAluno {
//
//        public String inNumRA;
//        public String inDigitoRA;
//        public String inSiglaUFRA;
//    }
//
//}
