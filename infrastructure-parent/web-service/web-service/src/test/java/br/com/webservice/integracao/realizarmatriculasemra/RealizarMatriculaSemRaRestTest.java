package br.com.webservice.integracao.realizarmatriculasemra;

import br.com.domain.auxiliar.tiporacacor.enumerator.TipoRacaCorEnum;
import br.com.domain.auxiliar.tiporacacor.model.TipoRacaCor;
import br.com.domain.auxiliar.tiponacionalidade.enumerator.TipoNacionalidadeEnum;
import br.com.domain.auxiliar.tiponacionalidade.model.TipoNacionalidade;
import br.com.domain.auxiliar.tiposexo.enumerator.TipoSexoEnum;
import br.com.domain.auxiliar.tiposexo.model.TipoSexo;
import br.com.domain.integracao.realizarmatricula.model.CertidaoNova;
import br.com.domain.integracao.realizarmatricula.model.RealizarMatriculaInfoSemRA;
import br.com.service.modulo.auxiliar.nacionalidade.TipoNacionalidadeService;
import br.com.service.modulo.auxiliar.sexo.TipoSexoService;
import br.com.service.modulo.auxiliar.tiporacacor.TipoRacaCorService;
import br.com.webserviceclient.configuracao.jersey.client.template.RestTemplateImp;
import java.util.Date;

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
public class RealizarMatriculaSemRaRestTest {

    @Autowired
    private TipoRacaCorService tipoRacaCorService;

    @Autowired
    private TipoNacionalidadeService tipoNacionalidadeService;

    @Autowired
    private TipoSexoService tipoSexoService;

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Test
    public void test01() {
        TipoRacaCor tipoRacaCor = tipoRacaCorService.findByTipoRacaCorEnum(TipoRacaCorEnum.NAO_DECLARADA);
        TipoNacionalidade tipoNacionalidade = tipoNacionalidadeService.findByTipoNacionalidadeEnum(TipoNacionalidadeEnum.BRASILEIRO);
        TipoSexo tipoSexo = tipoSexoService.findByTipoSexoEnum(TipoSexoEnum.MASCULINO);
        

        RealizarMatriculaInfoSemRA realizarMatriculaInfoSemRA = new RealizarMatriculaInfoSemRA();
        realizarMatriculaInfoSemRA.setInAno("XXXX");
        realizarMatriculaInfoSemRA.setTipoSexo(tipoSexo);

        realizarMatriculaInfoSemRA.setInAnoEmissao("2019");
        
        
        realizarMatriculaInfoSemRA.setTipoRacaCor(tipoRacaCor);
        realizarMatriculaInfoSemRA.setTipoNacionalidade(tipoNacionalidade);
        realizarMatriculaInfoSemRA.setDataNascimento(new Date());

        CertidaoNova certidaoNova = new CertidaoNova();
        certidaoNova.setDataEmissaoCertidao(new Date());
        realizarMatriculaInfoSemRA.setCertidaoNova(certidaoNova);

        String url = RestTemplateImp.Prodesp.Security.REALIZARMATRICULA_SEM_RA.getUrl();
        ResponseEntity<RealizarMatriculaInfoSemRA> postForEntity = secureRestTemplate.postForEntity(url, realizarMatriculaInfoSemRA, RealizarMatriculaInfoSemRA.class);

        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.status.StatusRestTest.test01()");
    }
}
