//package br.com.service.integracao.consultarescolacie;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.consultarescolacie.ConsultarEscolaCIE;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
////import br.com.soap.modulo.integration.consultarescolacie.ConsultarEscolaCieSoap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.consultarescolacie.ConsultarEscolaCieRepository;
//
//@Configuration
//public class ConsultarEscolaCieService {
//
////    @Autowired
////    private OperadorLogado operadorLogado;
////    @Autowired
////    private ConsultarEscolaCieSoap consultarEscolaCieSoap;
//    @Autowired
//    private ConsultarEscolaCieRepository consultarEscolaCieRepository;
//
//    public ConsultarEscolaCIE consultarColetaClasse(ConsultarEscolaCIE consultarEscolaCIE) {
////        Operador operador = (Operador) operadorLogado.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        consultarEscolaCIE = consultarEscolaCieSoap.consultarEscolaCIE(consultarEscolaCIE, authorizationServicoExterno);
//        return consultarEscolaCieRepository.save(consultarEscolaCIE);
//    }
//
//}
