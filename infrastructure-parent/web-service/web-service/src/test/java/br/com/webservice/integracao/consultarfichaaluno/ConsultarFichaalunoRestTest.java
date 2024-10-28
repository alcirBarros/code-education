package br.com.webservice.integracao.consultarfichaaluno;

import br.com.domain.integracao.consultafichaaluno.model.ConsultaRA;
import br.com.domain.integracao.consultafichaaluno.model.ConsultarFichaAluno;
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
public class ConsultarFichaalunoRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

//    @LocalServerPort
//    private int port;
    
    @Test
    public void test01() {
        String url = RestTemplateImp.Prodesp.Security.STATUS.getUrl();
        ResponseEntity<String> forEntity = secureRestTemplate.getForEntity(url, String.class);
        assertEquals(forEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
    }

    @Test
    public void test02() {

        ConsultaRA consultaRA = new ConsultaRA();
        consultaRA.setInRA("116584739");
        consultaRA.setInDigitoRA("5");
        consultaRA.setInUF("SP");
        ConsultarFichaAluno criarInstancia = ConsultarFichaAluno.criarInstancia(consultaRA);

        String url = RestTemplateImp.Prodesp.Security.CONSULTAR_FICHA_ALUNO.getUrl();
        ResponseEntity<ConsultarFichaAluno> response = secureRestTemplate.postForEntity(url, criarInstancia, ConsultarFichaAluno.class);
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
    }

}
