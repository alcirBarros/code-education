package br.com.webservice.integracao.consultarquadroresumo;

import br.com.domain.integracao.consultarquadroresumo.ConsultarQuadroResumo;
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
public class ConsultarQuadroResumoRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Test
    public void test01() {
        ConsultarQuadroResumo consultarQuadroResumo = new ConsultarQuadroResumo();
        consultarQuadroResumo.setInAno("2019");
        consultarQuadroResumo.setInCodEscola("339805");

        String url = RestTemplateImp.Prodesp.Security.CONSULTAR_QUADRO_RESUMO.getUrl();
        ResponseEntity<ConsultarQuadroResumo> postForEntity = secureRestTemplate.postForEntity(url, consultarQuadroResumo, ConsultarQuadroResumo.class);

        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
    }

}
