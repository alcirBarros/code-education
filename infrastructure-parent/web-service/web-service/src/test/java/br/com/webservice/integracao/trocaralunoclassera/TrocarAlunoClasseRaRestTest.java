package br.com.webservice.integracao.trocaralunoclassera;

import br.com.domain.integracao.trocaralunoclassera.TrocarAlunoClasseRA;
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
public class TrocarAlunoClasseRaRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Test
    public void test01() {

        TrocarAlunoClasseRA trocarAlunoClasseRA = new TrocarAlunoClasseRA();

        trocarAlunoClasseRA.setInAno("2019");

        trocarAlunoClasseRA.setInRA("116584739");
        trocarAlunoClasseRA.setInDigitoRA("5");
        trocarAlunoClasseRA.setInUF("SP");

        trocarAlunoClasseRA.setInDiaTroca("28");
        trocarAlunoClasseRA.setInMesTroca("02");
        trocarAlunoClasseRA.setInAnoTroca("2019");

        trocarAlunoClasseRA.setInNumAluno("01");
        trocarAlunoClasseRA.setInTipoEnsino("05");
        trocarAlunoClasseRA.setInSerieAno("00");

        trocarAlunoClasseRA.setInNumClasseOrigem("234786648");
        trocarAlunoClasseRA.setInNumClasseDestino("234786648");

        String url = RestTemplateImp.Prodesp.Security.TROCAR_ALUNO_CLASSERA.getUrl();
        ResponseEntity<TrocarAlunoClasseRA> postForEntity = secureRestTemplate.postForEntity(url, trocarAlunoClasseRA, TrocarAlunoClasseRA.class);

        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
    }
}
