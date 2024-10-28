//package br.com.service.integracao.consultarquadroresumo;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.consultarquadroresumo.ConsultarQuadroResumo;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
////import br.com.soap.modulo.integration.consultarquadroresumo.ConsultarQuadroResumoSoap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.consultarquadroresumo.ConsultarQuadroResumoRepository;
//
//@Configuration
//public class ConsultarQuadroResumoService {
//
////    @Autowired
////    private OperadorLogado operadorLogado;
////    @Autowired
////    private ConsultarQuadroResumoSoap consultarQuadroResumoSoap;
//    @Autowired
//    private ConsultarQuadroResumoRepository consultarQuadroResumoRepository;
//
//    public ConsultarQuadroResumo consultarQuadroResumo(ConsultarQuadroResumo consultarQuadroResumo) {
////        Operador operador = (Operador) operadorLogado.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        consultarQuadroResumo = consultarQuadroResumoSoap.consultarQuadroResumo(consultarQuadroResumo, authorizationServicoExterno);
//        return consultarQuadroResumoRepository.save(consultarQuadroResumo);
//    }
//
//}
