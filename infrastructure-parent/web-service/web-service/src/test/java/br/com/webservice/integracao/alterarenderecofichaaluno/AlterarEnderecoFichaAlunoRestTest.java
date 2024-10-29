package br.com.webservice.integracao.alterarenderecofichaaluno;

import br.com.domain.integracao.alterarenderecofichaaluno.model.AlterarEnderecoFichaAluno;
import br.com.domain.integracao.consultarcoletaclasse.model.ConsultarColetaClasse;
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
public class AlterarEnderecoFichaAlunoRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private RestTemplate secureRestTemplate;

    @Test
    public void test01() {
        AlterarEnderecoFichaAluno alterarEnderecoFichaAluno = AlterarEnderecoFichaAluno.criarInstancia();

        alterarEnderecoFichaAluno.setInRA("116584739");
        alterarEnderecoFichaAluno.setInDigitoRA("5");
        alterarEnderecoFichaAluno.setInUFRA("SP");

        alterarEnderecoFichaAluno.setInCep("17500900");
        alterarEnderecoFichaAluno.setInBairro("Centro");
        alterarEnderecoFichaAluno.setInCidade("São josé dos campos");
        alterarEnderecoFichaAluno.setInLogradouro("Rua Nove de Julho");
        alterarEnderecoFichaAluno.setInUF("SP");
        alterarEnderecoFichaAluno.setInNumero("1156");
        alterarEnderecoFichaAluno.setInComplemento("apartamento");
        alterarEnderecoFichaAluno.setInTipoLogradouro("0");
        alterarEnderecoFichaAluno.setInDDD("12");
        alterarEnderecoFichaAluno.setInFoneRecados("999999999");
        alterarEnderecoFichaAluno.setInFoneCel("999999999");
        alterarEnderecoFichaAluno.setInFoneResidencial("999999999");
        alterarEnderecoFichaAluno.setInSMS("S");
        alterarEnderecoFichaAluno.setInDDDCel("12");
        alterarEnderecoFichaAluno.setInFoneCel("999999999");

        alterarEnderecoFichaAluno.getEndIndicativo().setInCep("17500900");
        alterarEnderecoFichaAluno.getEndIndicativo().setInBairro("Centro");
        alterarEnderecoFichaAluno.getEndIndicativo().setInCidade("São josé dos campos");
        alterarEnderecoFichaAluno.getEndIndicativo().setInLogradouro("Rua Nove de Julho");
        alterarEnderecoFichaAluno.getEndIndicativo().setInUF("SP");
        alterarEnderecoFichaAluno.getEndIndicativo().setInNumero("1156");

        String url = RestTemplateImp.Prodesp.Security.ALTERAR_ENDERECO_FICHA_ALUNO.getUrl();
        ResponseEntity<AlterarEnderecoFichaAluno> postForEntity = secureRestTemplate.postForEntity(url, alterarEnderecoFichaAluno, AlterarEnderecoFichaAluno.class);
        assertEquals(postForEntity.getStatusCode(), HttpStatus.OK);
        System.out.println("br.com.webservice.alterarenderecofichaaluno.AlterarEnderecoFichaAlunoRestTest.test01()");
    }

}
