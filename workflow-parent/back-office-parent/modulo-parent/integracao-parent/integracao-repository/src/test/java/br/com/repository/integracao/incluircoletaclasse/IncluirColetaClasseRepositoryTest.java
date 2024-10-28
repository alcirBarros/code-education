//package br.com.repository.integracao.incluircoletaclasse;
//
//import br.com.domain.integracao.incluircoletaclasse.model.IncluirColetaClasse;
//import br.com.domain.integracao.incluircoletaclasse.model.IncluirColetaClasseResponse;
//import br.com.domain.integracao.incluircoletaclasse.model.MsgIncluirColetaClasse;
//import br.com.domain.integracao.incluircoletaclasse.model.ResponseIncluirColetaClasse;
//import br.com.repository.SpringBootApplicationIntegracaoRepository;
////import br.com.repository.auxiliar.diasemana.TipoDiaSemanaRepository;
//import java.util.List;
//import static org.junit.Assert.assertNotNull;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringBootApplicationIntegracaoRepository.class)
//public class IncluirColetaClasseRepositoryTest {
//
////    @Autowired
////    private TipoDiaSemanaRepository tipoDiaSemanaRepository;
//    @Autowired
//    private IncluirColetaClasseRepository incluirColetaClasseRepository;
//
//    @Test
//    @Ignore
//    public void test01() {
//        List<IncluirColetaClasse> findAll = incluirColetaClasseRepository.findAll();
//        assertNotNull(findAll);
//    }
//
//    @Test
//    public void test02() {
//        try {
////            List<TipoDiaSemana> findAll = tipoDiaSemanaRepository.findAll();
//
//            IncluirColetaClasse incluirColetaClasse = IncluirColetaClasse.criarInstancia();
//
//            IncluirColetaClasseResponse incluirColetaClasseResponse = new IncluirColetaClasseResponse();
//            ResponseIncluirColetaClasse responseIncluirColetaClasse = new ResponseIncluirColetaClasse();
//            responseIncluirColetaClasse.getMsgIncluirColetaClasse().add(new MsgIncluirColetaClasse());
//            
//            MsgIncluirColetaClasse msgIncluirColetaClasse = new MsgIncluirColetaClasse();
//            incluirColetaClasseResponse.setResponseIncluirColetaClasse(responseIncluirColetaClasse);
//
//            incluirColetaClasse.setIncluirColetaClasseResponse(incluirColetaClasseResponse);
////            incluirColetaClasse.getInDiasSemana().getTipoDiaSemanaList().addAll(findAll);
//
//            IncluirColetaClasse save = incluirColetaClasseRepository.save(IncluirColetaClasse.setNull(incluirColetaClasse));
//
//            List<IncluirColetaClasse> findAll = incluirColetaClasseRepository.findAll();
//            System.out.println(save);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
