package br.com.webservice.integracao.incluircoletaclasse;

import br.com.domain.auxiliar.diasemana.model.TipoDiaSemana;
import br.com.domain.integracao.incluircoletaclasse.model.IncluirColetaClasse;
import br.com.repository.auxiliar.diasemana.TipoDiaSemanaRepository;
import br.com.webserviceclient.configuracao.jersey.client.template.RestTemplateImp;
import java.util.List;
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
public class IncluirColetaClasseRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Autowired
    private TipoDiaSemanaRepository tipoDiaSemanaRepository;

    @Test
    public void test01() {
        List<TipoDiaSemana> findAll = tipoDiaSemanaRepository.findAll();

        IncluirColetaClasse incluirColetaClasse = IncluirColetaClasse.criarInstancia();

        incluirColetaClasse.setInAno("2019");
        incluirColetaClasse.setInNumeroSala("023");
//        incluirColetaClasse.setInTipoEnsino("05");

        incluirColetaClasse.setInCodEscola("339805");
        incluirColetaClasse.setInCodUnidade("139825");
        incluirColetaClasse.setInCapacidadeFisica("30");

//        incluirColetaClasse.setInCursoSemestral1("X");
//        incluirColetaClasse.setInDiaInicioAula("01");
//        incluirColetaClasse.setInMesInicioAula("01");
//
//        incluirColetaClasse.setInHoraInicial("0800");
//        incluirColetaClasse.setInHoraFinal("1200");
//
//        incluirColetaClasse.setInDiaTerminoAula("27");
//        incluirColetaClasse.setInMesTerminoAula("11");

        incluirColetaClasse.setInTurma("A");
//        incluirColetaClasse.setInTurno("1");
        incluirColetaClasse.getInDiasSemana().getTipoDiaSemanaList().addAll(findAll);

        String url = RestTemplateImp.Prodesp.Security.INCLUIR_COLETA_CLASSE.getUrl();

        ResponseEntity<IncluirColetaClasse> postForEntity = secureRestTemplate.postForEntity(url, incluirColetaClasse, IncluirColetaClasse.class);

        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
    }

}
