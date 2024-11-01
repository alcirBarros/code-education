//package br.com.service.integracao.consultarcoletaclasse;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.consultarcoletaclasse.model.ConsultarColetaClasse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
////import br.com.soap.modulo.integration.consultarcoletaclasse.ConsultarColetaClasseSoap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.consultarcoletaclasse.ConsultarColetaClasseRepository;
//
//@Configuration
//public class ConsultarColetaClasseService {
//
////    @Autowired
////    private OperadorLogado operadorLogadoImpl;
////    @Autowired
////    private ConsultarColetaClasseSoap consultarColetaClasseSoap;
//    @Autowired
//    private ConsultarColetaClasseRepository consultarColetaClasseRepository;
//
//    public ConsultarColetaClasse consultarColetaClasse(ConsultarColetaClasse consultarColetaClasse) {
////        Operador operador = (Operador) operadorLogadoImpl.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        consultarColetaClasse = consultarColetaClasseSoap.consultarColetaClasse(consultarColetaClasse, authorizationServicoExterno);
//        return consultarColetaClasseRepository.save(consultarColetaClasse);
//    }
//
//}
