package br.com.webservice.integracao.consultarcoletaclasse;

import br.com.domain.integracao.consultarcoletaclasse.model.ConsultarColetaClasse;
import br.com.webserviceclient.configuracao.jersey.client.template.RestTemplateImp;
import static org.junit.Assert.assertEquals;
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
public class ConsultarColetaClasseRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Test
    public void test01() {
        ConsultarColetaClasse consultarColetaClasse = new ConsultarColetaClasse();
        consultarColetaClasse.setInAno("2019");
        consultarColetaClasse.setInNumClasse("234786648");
        String url = RestTemplateImp.Prodesp.Security.CONSULTAR_COLETA_CLASSE.getUrl();
        ResponseEntity<ConsultarColetaClasse> postForEntity = secureRestTemplate.postForEntity(url, consultarColetaClasse, ConsultarColetaClasse.class);
        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
    }

}
