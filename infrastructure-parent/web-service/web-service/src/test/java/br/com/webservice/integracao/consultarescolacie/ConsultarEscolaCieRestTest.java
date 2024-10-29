package br.com.webservice.integracao.consultarescolacie;

import br.com.domain.integracao.consultarescolacie.ConsultarEscolaCIE;
import br.com.webserviceclient.configuracao.jersey.client.template.RestTemplateImp;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@ActiveProfiles({"test"})
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ConsultarEscolaCieRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Test
    public void test01() {

        ConsultarEscolaCIE consultarColetaClasse = new ConsultarEscolaCIE();
        consultarColetaClasse.setInCodEscola("339805");
        String url = RestTemplateImp.Prodesp.Security.CONSULTAR_ESCOLA_CIE.getUrl();
        ResponseEntity<ConsultarEscolaCIE> postForEntity = secureRestTemplate.postForEntity(url, consultarColetaClasse, ConsultarEscolaCIE.class);
        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
    }



}
