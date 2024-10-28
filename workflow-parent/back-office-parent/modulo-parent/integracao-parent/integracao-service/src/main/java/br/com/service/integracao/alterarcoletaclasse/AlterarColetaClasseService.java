//package br.com.service.integracao.alterarcoletaclasse;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.alterarcoletaclasse.model.AlterarColetaClasse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
////import br.com.soap.modulo.integration.alterarcoletaclasse.AlterarColetaClasseSoap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.alterarcoletaclasse.AlterarColetaClasseRepository;
//
//@Configuration
//public class AlterarColetaClasseService {
//
////    @Autowired
////    private OperadorLogado operadorLogadoImpl;
////    @Autowired
////    private AlterarColetaClasseSoap alterarColetaClasseSoap;
//    @Autowired
//    private AlterarColetaClasseRepository alterarColetaClasseRepository;
//
//    public AlterarColetaClasse alterarColetaClasse(AlterarColetaClasse alterarColetaClasse) {
////        Operador operador = (Operador) operadorLogadoImpl.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        alterarColetaClasse = alterarColetaClasseSoap.alterarColetaClasse(alterarColetaClasse, authorizationServicoExterno);
//        return alterarColetaClasseRepository.save(alterarColetaClasse);
//    }
//}
