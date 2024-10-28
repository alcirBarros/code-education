package br.com.webservice.auxiliar.tipoconsultafichaaluno;

import br.com.domain.auxiliar.tipoconsultafichaaluno.TipoConsultaFichaAluno;
import br.com.webserviceclient.configuracao.jersey.client.template.BasicAuthRestTemplate;
import br.com.webserviceclient.configuracao.jersey.client.template.RestTemplateImp;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles({"test"})
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TipoConsultaFichaAlunoRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private BasicAuthRestTemplate secureRestTemplate;

    @Test
    public void test03() {
//        String url = RestTemplateImp.Prodesp.Security.TIPO_CONSULTA_FICHA_ALUNO.getUrl();
        String url = "http://localhost:8081/web/webservice/private/tipoconsultafichaaluno";
//        String url = "http://homologacao.multfacilcomercial.com.br:8080/web/webservice/private/tipoconsultafichaaluno";
        ResponseEntity<List<TipoConsultaFichaAluno>> response = secureRestTemplate.exchange(url, HttpMethod.GET, null, new TipoConsultaFichaAlunoParameterizedReference());
        List<TipoConsultaFichaAluno> country = response.getBody();
        System.out.println(country);
    }

    class TipoConsultaFichaAlunoParameterizedReference extends ParameterizedTypeReference< List<TipoConsultaFichaAluno>> {

    }
}
