package br.com.webservice.integracao.alterarcoletaclasse;

import br.com.domain.integracao.alterarcoletaclasse.model.AlterarColetaClasse;
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
public class AlterarColetaClasseRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Test
    public void test01() {
        AlterarColetaClasse alterarColetaClasse = new AlterarColetaClasse();
        alterarColetaClasse.setInAno("2019");
        alterarColetaClasse.setInNumClasse("234786648");
        alterarColetaClasse.setInCapacidadeFisica("45");
        String url = RestTemplateImp.Prodesp.Security.ALTERAR_COLETA_CLASSE.getUrl();
        ResponseEntity<AlterarColetaClasse> postForEntity = secureRestTemplate.postForEntity(url, alterarColetaClasse, AlterarColetaClasse.class);
        
        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
    }

}
