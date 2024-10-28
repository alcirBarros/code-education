//package soap;
//
//import br.com.domain.integracao.consultafichaaluno.model.ConsultaFonetica;
//import br.com.domain.integracao.consultafichaaluno.model.ConsultaNomeCompleto;
//import br.com.domain.integracao.consultafichaaluno.model.ConsultaRA;
//import br.com.domain.integracao.consultafichaaluno.model.ConsultarFichaAluno;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.consultarfichaaluno.ConsultarFichaAlunoSoap;
//
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
//public class ConsultarFichaAlunoSoapTest {
//
//    @Autowired
//    private ConsultarFichaAlunoSoap fichaAlunoService;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//
//        ConsultaRA consultaRA = new ConsultaRA();
////        consultaRA.setInRA("116584739");
//        consultaRA.setInDigitoRA("5");
//        consultaRA.setInUF("SP");
//
//        AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//        ConsultarFichaAluno response = fichaAlunoService.consultarFichaAluno(ConsultarFichaAluno.criarInstancia(consultaRA), authorizationServicoExterno);
//        System.out.println(response.getConsultarFichaAlunoResponse().getMensagem());
//        System.out.println("ConsultarFichaAlunoSoapTest.test01()");
//
//    }
//
//    @Test
//    public void test02() {
//        ConsultaNomeCompleto consultaNomeCompleto = new ConsultaNomeCompleto();
//        consultaNomeCompleto.setInNomeComplAluno("DOUGLAS DO NASCIMENTO GUEDES");
//
//        AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//        ConsultarFichaAluno response = fichaAlunoService.consultarFichaAluno(ConsultarFichaAluno.criarInstancia(consultaNomeCompleto), authorizationServicoExterno);
//        System.out.println("ConsultarFichaAlunoSoapTest.test02()");
//    }
//
//    @Test
//    public void test03() {
//        ConsultarFichaAluno consultarFichaAluno = ConsultarFichaAluno.criarInstancia();
//
//        ConsultaFonetica consultaFonetica = new ConsultaFonetica();
//        consultaFonetica.setInNomeAluno("ALICE APARECIDA DA SILVA MUNIZ");
//        consultarFichaAluno.setConsultaFonetica(consultaFonetica);
//
//        ConsultaNomeCompleto consultaNomeCompleto = new ConsultaNomeCompleto();
//        consultaNomeCompleto.setInNomeComplAluno("ALICE APARECIDA DA SILVA MUNIZ");
//        consultarFichaAluno.setConsultaNomeCompleto(consultaNomeCompleto);
//
//        AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//        ConsultarFichaAluno response = fichaAlunoService.consultarFichaAluno(consultarFichaAluno, authorizationServicoExterno);
//        System.out.println("ConsultarFichaAlunoSoapTest.test03()");
//    }
//}
