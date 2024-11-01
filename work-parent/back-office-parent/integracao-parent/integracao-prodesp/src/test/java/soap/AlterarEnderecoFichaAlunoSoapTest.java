//package soap;
//
//
//import br.com.domain.integracao.alterarenderecofichaaluno.model.AlterarEnderecoFichaAluno;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.alterarenderecofichaaluno.AlterarEnderecoFichaAlunoSoap;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@ActiveProfiles({"test"})
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {SpringBootSoapConsumer.class})
//public class AlterarEnderecoFichaAlunoSoapTest {
//
//    @Autowired
//    private AlterarEnderecoFichaAlunoSoap alterarEnderecoFichaAlunoSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        AlterarEnderecoFichaAluno alterarEnderecoFichaAluno = AlterarEnderecoFichaAluno.criarInstancia();
//        alterarEnderecoFichaAluno.setInRA("116584739");
//        alterarEnderecoFichaAluno.setInDigitoRA("5");
//        alterarEnderecoFichaAluno.setInUFRA("SP");
//
//        alterarEnderecoFichaAluno.setInCep("17500900");
//        alterarEnderecoFichaAluno.setInBairro("Centro");
//        alterarEnderecoFichaAluno.setInCidade("São josé dos campos");
//        alterarEnderecoFichaAluno.setInLogradouro("Rua Nove de Julho");
//        alterarEnderecoFichaAluno.setInUF("SP");
//        alterarEnderecoFichaAluno.setInNumero("1111");
//        alterarEnderecoFichaAluno.setInComplemento("apartamento");
//        alterarEnderecoFichaAluno.setInTipoLogradouro("0");
//        alterarEnderecoFichaAluno.setInDDD("12");
//        alterarEnderecoFichaAluno.setInFoneRecados("999999999");
//        alterarEnderecoFichaAluno.setInFoneCel("999999999");
//        alterarEnderecoFichaAluno.setInFoneResidencial("999999999");
//        alterarEnderecoFichaAluno.setInSMS("S");
//        alterarEnderecoFichaAluno.setInDDDCel("12");
//        alterarEnderecoFichaAluno.setInFoneCel("999999999");
//
//        alterarEnderecoFichaAluno.getEndIndicativo().setInCep("17500-900");
//        alterarEnderecoFichaAluno.getEndIndicativo().setInBairro("Centro");
//        alterarEnderecoFichaAluno.getEndIndicativo().setInCidade("São josé dos campos");
//        alterarEnderecoFichaAluno.getEndIndicativo().setInLogradouro("Rua Nove de Julho");
//        alterarEnderecoFichaAluno.getEndIndicativo().setInUF("SP");
//        alterarEnderecoFichaAluno.getEndIndicativo().setInNumero("1111");
//
////            alterarEnderecoFichaAluno.getEndIndicativo().setInLongitude("3123123123");
////            alterarEnderecoFichaAluno.getEndIndicativo().setInLatitude("123123123");
////            alterarEnderecoFichaAluno.setInLongitude("3123123123");
////            alterarEnderecoFichaAluno.setInLatitude("123123123");
//        AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//        AlterarEnderecoFichaAluno response = alterarEnderecoFichaAlunoSoap.alterarEnderecoFichaAluno(alterarEnderecoFichaAluno, authorizationServicoExterno);
//        System.out.println(response.getAlterarEnderecoFichaAlunoResponse().getMensagem());
//        System.out.println("AlterarEnderecoFichaAlunoSoapTest.test01()");
//
//    }
//
//}
