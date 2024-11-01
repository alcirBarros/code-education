//package br.com.service.integracao.consultaclassealunoporescola;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.consultaclassealunoporescola.model.ConsultaClasseAlunoPorEscola;
//import br.com.domain.prodesp.TipoStatusRegistroEnum;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
////import br.com.soap.modulo.integration.consultaclassealunoporescola.ConsultaClasseAlunoPorEscolaSoap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.consultaclassealunoporescola.ConsultaClasseAlunoPorEscolaRepository;
//import java.util.List;
//
//@Configuration
//public class ConsultaClasseAlunoPorEscolaService {
//
////    @Autowired
////    private OperadorLogado operadorLogado;
////    @Autowired
////    private ConsultaClasseAlunoPorEscolaSoap consultaClasseAlunoPorEscolaSoap;
//    @Autowired
//    private ConsultaClasseAlunoPorEscolaRepository consultaClasseAlunoPorEscolaRepository;
//    @Autowired
//    private ConsultaClasseAlunoPorEscolaGenericRepository consultaClasseAlunoPorEscolaGenericRepository;
//
//    public List<ConsultaClasseAlunoPorEscola> findAll() {
//        return consultaClasseAlunoPorEscolaRepository.findAll();
//    }
//
//    public ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola(ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola) {
//        consultaClasseAlunoPorEscola = consultaClasseAlunoPorEscolaRepository(consultaClasseAlunoPorEscola);
//        if (consultaClasseAlunoPorEscola != null && consultaClasseAlunoPorEscola.getId() == null) {
//            consultaClasseAlunoPorEscola = consultaClasseAlunoPorEscolaServiceExterno(consultaClasseAlunoPorEscola);
//        }
//        return consultaClasseAlunoPorEscola;
//    }
//
//    public ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscolaServiceExterno(ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola) {
////        Operador operador = (Operador) operadorLogado.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        consultaClasseAlunoPorEscola = consultaClasseAlunoPorEscolaSoap.consultaClasseAlunoPorEscola(consultaClasseAlunoPorEscola, authorizationServicoExterno);
//        consultaClasseAlunoPorEscola.setTipoStatusRegistroEnum(TipoStatusRegistroEnum.PROCESSADO);
//        return consultaClasseAlunoPorEscolaRepository.save(consultaClasseAlunoPorEscola);
//    }
//
//    public ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscolaRepository(ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola) {
//        try {
//            return consultaClasseAlunoPorEscolaGenericRepository.consultaClasseAlunoPorEscola(consultaClasseAlunoPorEscola);
//        } catch (Exception e) {
//            return consultaClasseAlunoPorEscola;
//        }
//    }
//}
