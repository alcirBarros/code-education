//package br.com.service.integracao.excluircoletaclasse;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.excluircoletaclasse.model.ExcluirColetaClasse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
////import br.com.soap.modulo.integration.excluircoletaclasse.ExcluirColetaClasseSoap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.excluircoletaclasse.ExcluirColetaClasseRepository;
//
//@Configuration
//public class ExcluirColetaClasseService {
//
////    @Autowired
////    private OperadorLogado operadorLogado;
////    @Autowired
////    private ExcluirColetaClasseSoap excluirColetaClasseSoap;
//    @Autowired
//    private ExcluirColetaClasseRepository excluirColetaClasseRepository;
//
//    public ExcluirColetaClasse excluirColetaClasse(ExcluirColetaClasse excluirColetaClasse) {
////        Operador operador = (Operador) operadorLogado.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        excluirColetaClasse = excluirColetaClasseSoap.excluirColetaClasse(excluirColetaClasse, authorizationServicoExterno);
//        return excluirColetaClasseRepository.save(excluirColetaClasse);
//    }
//}
