package br.com.webservice.integracao.alterardadospessoaisfichaaluno;

import br.com.domain.integracao.alterardadospessoaisfichaaluno.model.AlterarDadosPessoaisFichaAluno;
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
public class AlterarDadosPessoaisFichaAlunoRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Test
    public void test01() {
        AlterarDadosPessoaisFichaAluno alterarDadosPessoaisFichaAluno = new AlterarDadosPessoaisFichaAluno();

        alterarDadosPessoaisFichaAluno.setInRA("116584739");
        alterarDadosPessoaisFichaAluno.setInDigitoRA("5");
        alterarDadosPessoaisFichaAluno.setInUFRA("SP");

        alterarDadosPessoaisFichaAluno.setInNomeAluno("ALICE APARECIDA DA SILVA MUNIZ");
        alterarDadosPessoaisFichaAluno.setInNomeMae("SANDRA FIGUEIREDO DA SILVA");

        alterarDadosPessoaisFichaAluno.setInAnoNascimento("2000");
        alterarDadosPessoaisFichaAluno.setInMesNascimento("01");
        alterarDadosPessoaisFichaAluno.setInDiaNascimento("01");

        String url = RestTemplateImp.Prodesp.Security.ALTERAR_DADOS_PESSOAIS_FICHA_ALUNO.getUrl();
        ResponseEntity<AlterarDadosPessoaisFichaAluno> postForEntity = secureRestTemplate.postForEntity(url, alterarDadosPessoaisFichaAluno, AlterarDadosPessoaisFichaAluno.class);
        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.alterardadospessoaisfichaaluno.AlterarDadosPessoaisFichaAlunoRestTest.test01()");
    }

}
