//package soap;
//
//
//import br.com.domain.integracao.alterardadospessoaisfichaaluno.model.AlterarDadosPessoaisFichaAluno;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.alterardadospessoaisfichaaluno.AlterarDadosPessoaisFichaAlunoSoap;
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
//public class AlterarDadosPessoaisFichaAlunoSoapTest {
//
//    @Autowired
//    private AlterarDadosPessoaisFichaAlunoSoap alterarDadosPessoaisFichaAlunoSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            AlterarDadosPessoaisFichaAluno alterarDadosPessoaisFichaAluno = new AlterarDadosPessoaisFichaAluno();
//
//            alterarDadosPessoaisFichaAluno.setInRA("116584739");
//            alterarDadosPessoaisFichaAluno.setInDigitoRA("5");
//            alterarDadosPessoaisFichaAluno.setInUFRA("SP");
//
//            alterarDadosPessoaisFichaAluno.setInNomeAluno("ALICE APARECIDA DA SILVA MUNIZ");
//            alterarDadosPessoaisFichaAluno.setInNomeMae("SANDRA FIGUEIREDO DA SILVA");
//
//            alterarDadosPessoaisFichaAluno.setInAnoNascimento("2000");
//            alterarDadosPessoaisFichaAluno.setInMesNascimento("01");
//            alterarDadosPessoaisFichaAluno.setInDiaNascimento("01");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            AlterarDadosPessoaisFichaAluno response = alterarDadosPessoaisFichaAlunoSoap.alterarDadosPessoaisFichaAluno(alterarDadosPessoaisFichaAluno, authorizationServicoExterno);
//            System.out.println(response.getAlterarDadosPessoaisFichaAlunoResponse().getMensagem());
//            System.out.println("AlterarColetaClasseSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
