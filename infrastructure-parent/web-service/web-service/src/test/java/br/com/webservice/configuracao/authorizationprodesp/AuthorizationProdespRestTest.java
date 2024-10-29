//package br.com.webservice.configuracao.authorizationprodesp;
//
//import br.com.domain.configuracao.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.webserviceclient.configuracao.jersey.client.template.BasicAuthRestTemplate;
//import br.com.webserviceclient.configuracao.jersey.client.template.RestTemplateImp;
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@ActiveProfiles({"test"})
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//public class AuthorizationProdespRestTest {
//
//    @Autowired
//    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
//    private BasicAuthRestTemplate secureRestTemplate;
//
//    @Test
//    public void test01() {
//        String url = RestTemplateImp.Prodesp.Security.AUTHORIZATION_PRODESP.getUrl();          
//        ResponseEntity<AuthorizationServicoExterno> postForEntity = secureRestTemplate.getForEntity(url, AuthorizationServicoExterno.class);
//        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
//        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
//    }
//    
//    @Test
//    public void test02() {
//        AuthorizationServicoExterno authorizationServicoExterno = new AuthorizationServicoExterno();
//        authorizationServicoExterno.setUrl("https://homologacaointegracaosed.educacao.sp.gov.br/educacao/Sec.BS.SecretariaMunicipal.cls");
//        authorizationServicoExterno.setUsername("SME665");
//        authorizationServicoExterno.setPassword("h7r6fu54;eU?");
//
//        String url = RestTemplateImp.Prodesp.Security.AUTHORIZATION_PRODESP.getUrl();
//        ResponseEntity<AuthorizationServicoExterno> postForEntity = secureRestTemplate.postForEntity(url, authorizationServicoExterno, AuthorizationServicoExterno.class);
//        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
//}
//}