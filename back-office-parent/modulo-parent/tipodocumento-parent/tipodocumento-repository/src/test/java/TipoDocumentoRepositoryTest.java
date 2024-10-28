//
//import br.com.domain.tipodocumento.TipoDocumento;
//import br.com.domain.tipodocumento.TipoDocumentoEnum;
//import br.com.domain.tipodocumento.TipoExigeTramiteEnum;
//import br.com.domain.tipodocumento.TipoMovimentacaoEnum;
//import br.com.domain.tipodocumento.TipoTramitacaoDestino;
//import br.com.domain.tipodocumento.TipoTramitacaoOrigem;
//import br.com.domain.tipodocumento.TipoTramiteEnum;
//import br.com.repository.SpringBootApplicationInstituicaoRepository;
//import br.com.repository.tipodocumento.TipoDocumentoRepository;
//import java.util.List;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = SpringBootApplicationInstituicaoRepository.class)
//public class TipoDocumentoRepositoryTest {
//
//    @Autowired
//    private TipoDocumentoRepository tipoDocumentoRepository;
//
//    public TipoDocumentoRepositoryTest() {
//    }
//
//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//    @Test
//    public void test01() {
//        TipoDocumento tipoDocumento = new TipoDocumento();
//        tipoDocumento.setDescricao("Entrada nota fiscal");
//        tipoDocumento.setTipoDocumentoEnum(TipoDocumentoEnum.ACERTO_ESTOQUE);
//        tipoDocumento.setTipoMovimentacaoEnum(TipoMovimentacaoEnum.ACERTO_ESTOQUE);
//        {
////            ExigePreenchimento exigePreenchimento = new ExigePreenchimento();
////            exigePreenchimento.setTipoDocumento(tipoDocumento);
////            exigePreenchimento.setTipoExigePreenchimentoEnum(TipoExigePreenchimentoEnum.VALOR_UNITARIO);
////            tipoDocumento.getExigePreenchimentoList().add(exigePreenchimento);
//        }
//
//        {
//            TipoTramitacaoOrigem tipoTramitacao = new TipoTramitacaoOrigem();
//            tipoTramitacao.setTipoDocumento(tipoDocumento);
//            tipoTramitacao.setTipoTramiteEnum(TipoTramiteEnum.ESTABELECIMENTO);
//            tipoTramitacao.setTipoExigeTramiteEnum(TipoExigeTramiteEnum.SIN);
//            tipoDocumento.getTipoTramitacaoOrigemList().add(tipoTramitacao);
//        }
//
//        {
//            TipoTramitacaoDestino tipoTramitacaoDestino = new TipoTramitacaoDestino();
//            tipoTramitacaoDestino.setTipoDocumento(tipoDocumento);
//            tipoTramitacaoDestino.setTipoTramiteEnum(TipoTramiteEnum.USUARIO);
//            tipoTramitacaoDestino.setTipoExigeTramiteEnum(TipoExigeTramiteEnum.SIN);
//            tipoDocumento.getTipoTramitacaoDestinoList().add(tipoTramitacaoDestino);
//        }
//        TipoDocumento save = tipoDocumentoRepository.save(tipoDocumento);
//        System.out.println(tipoDocumento);
//    }
//    
//    @Test
//    public void test02() {
//        List<TipoDocumento> findAll = tipoDocumentoRepository.findAll();
//        System.out.println(findAll);
//    }
//
//}
