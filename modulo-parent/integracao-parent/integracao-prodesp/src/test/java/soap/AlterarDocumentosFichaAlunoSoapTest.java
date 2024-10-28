//package soap;
//
//
//import br.com.domain.integracao.alterardocumentosfichaaluno.model.AlterarDocumentosFichaAluno;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.alterardocumentosfichaaluno.AlterarDocumentosFichaAlunoSoap;
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
//public class AlterarDocumentosFichaAlunoSoapTest {
//
//    @Autowired
//    private AlterarDocumentosFichaAlunoSoap alterarDocumentosFichaAlunoSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            AlterarDocumentosFichaAluno alterarDadosPessoaisFichaAluno = new AlterarDocumentosFichaAluno();
//            alterarDadosPessoaisFichaAluno.setInRA("116584739");
//            alterarDadosPessoaisFichaAluno.setInDigitoRA("5");
//            alterarDadosPessoaisFichaAluno.setInUFRA("SP");
//
//            alterarDadosPessoaisFichaAluno.setInCPF("86394934216");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
////            AlterarDocumentosFichaAluno response = alterarDocumentosFichaAlunoSoap.alterarDocumentosFichaAluno(alterarDadosPessoaisFichaAluno, authorizationServicoExterno);
////            System.out.println(response.getAlterarDocumentosFichaAlunoResponse().getMensagem());
//            System.out.println("AlterarDocumentosFichaAlunoSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
