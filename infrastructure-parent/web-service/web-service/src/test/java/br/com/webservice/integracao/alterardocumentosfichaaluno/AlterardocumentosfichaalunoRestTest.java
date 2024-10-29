package br.com.webservice.integracao.alterardocumentosfichaaluno;

import br.com.domain.integracao.alterardocumentosfichaaluno.model.AlterarDocumentosFichaAluno;
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
public class AlterardocumentosfichaalunoRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Test
    public void test01() {
        AlterarDocumentosFichaAluno alterarDocumentosFichaAluno = new AlterarDocumentosFichaAluno();
        alterarDocumentosFichaAluno.setInRA("116584739");
        alterarDocumentosFichaAluno.setInDigitoRA("5");
        alterarDocumentosFichaAluno.setInUFRA("SP");
        alterarDocumentosFichaAluno.setInCPF("14624937007");
        String url = RestTemplateImp.Prodesp.Security.ALTERAR_DOCUMENTOS_FICHA_ALUNO.getUrl();
        ResponseEntity<AlterarDocumentosFichaAluno> postForEntity = secureRestTemplate.postForEntity(url, alterarDocumentosFichaAluno, AlterarDocumentosFichaAluno.class);
        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("AlterardocumentosfichaalunoRestTest.test01()");
    }

}
