package br.com.webservice.integracao.consultaclassealunoporescola;

import br.com.domain.integracao.consultaclassealunoporescola.model.ConsultaClasseAlunoPorEscola;
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
public class ConsultaClasseAlunoPorEscolaRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Test
    public void test01() {
        ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola = new ConsultaClasseAlunoPorEscola();
        consultaClasseAlunoPorEscola.setInAnoLetivo("2019");
        consultaClasseAlunoPorEscola.setInCodEscola("339805");
        String url = RestTemplateImp.Prodesp.Security.CONSULTA_CLASSE_ALUNO_POR_ESCOLA.getUrl();
        ResponseEntity<ConsultaClasseAlunoPorEscola> postForEntity = secureRestTemplate.postForEntity(url, consultaClasseAlunoPorEscola, ConsultaClasseAlunoPorEscola.class);
        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
    }

}
