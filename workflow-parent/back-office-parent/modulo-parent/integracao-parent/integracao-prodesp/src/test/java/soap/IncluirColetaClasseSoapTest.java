//package soap;
//
//import br.com.domain.integracao.incluircoletaclasse.model.IncluirColetaClasse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.incluircoletaclasse.service.IncluirColetaClasseSoap;
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
//public class IncluirColetaClasseSoapTest {
//
//    @Autowired
//    private IncluirColetaClasseSoap incluirColetaClasseSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        IncluirColetaClasse incluirColetaClasse = new IncluirColetaClasse();
//        incluirColetaClasse.setInAno("2019");
//        incluirColetaClasse.setInNumeroSala("023");
////        incluirColetaClasse.setInTipoEnsino("05");
//
//        incluirColetaClasse.setInCodEscola("339805");
//        incluirColetaClasse.setInCodUnidade("139825");
//        incluirColetaClasse.setInCapacidadeFisica("30");
//
////        incluirColetaClasse.setInCursoSemestral1("X");
//
////        incluirColetaClasse.setInDiaInicioAula("01");
////        incluirColetaClasse.setInMesInicioAula("01");
////
////        incluirColetaClasse.setInHoraInicial("0800");
////        incluirColetaClasse.setInHoraFinal("1200");
////
////        incluirColetaClasse.setInDiaTerminoAula("27");
////        incluirColetaClasse.setInMesTerminoAula("11");
//
//        incluirColetaClasse.setInTurma("A");
////        incluirColetaClasse.setInTurno("2");
//
//        AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//        IncluirColetaClasse response = incluirColetaClasseSoap.incluirColetaClasse(incluirColetaClasse, authorizationServicoExterno);
//        System.out.println(response.getIncluirColetaClasseResponse().getMensagem());
//        System.out.println("IncluirColetaClasseSoapTest.test01()");
//    }
//}
