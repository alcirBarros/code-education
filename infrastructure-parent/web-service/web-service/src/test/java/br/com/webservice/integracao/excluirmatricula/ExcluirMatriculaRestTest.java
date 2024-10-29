package br.com.webservice.integracao.excluirmatricula;

import br.com.domain.integracao.excluirmatricula.model.ExcluirMatricula;
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
public class ExcluirMatriculaRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Test
    public void test01() {
        ExcluirMatricula excluirMatricula = new ExcluirMatricula();

        excluirMatricula.setInAno("2019");
        excluirMatricula.setInRA("116584739");
        excluirMatricula.setInDigitoRA("5");
        excluirMatricula.setInUF("SP");
        excluirMatricula.setInNumClasse("234786648");

        excluirMatricula.setInSerieAno("00");
//        excluirMatricula.setInTipoEnsino("05");

        String url = RestTemplateImp.Prodesp.Security.EXCLUIR_MATRICULA.getUrl();
        ResponseEntity<ExcluirMatricula> postForEntity = secureRestTemplate.postForEntity(url, excluirMatricula, ExcluirMatricula.class);

        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
    }

}
