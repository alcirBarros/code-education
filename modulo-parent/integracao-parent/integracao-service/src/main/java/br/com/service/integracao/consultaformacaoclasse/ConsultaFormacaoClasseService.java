//package br.com.service.integracao.consultaformacaoclasse;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.consultaformacaoclasse.ConsultaFormacaoClasse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
////import br.com.soap.modulo.integration.consultaformacaoclasse.ConsultaFormacaoClasseSoap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.consultaformacaoclasse.ConsultaFormacaoClasseGenericRepository;
//import br.com.repository.integracao.consultaformacaoclasse.ConsultaFormacaoClasseRepository;
//
//@Configuration
//public class ConsultaFormacaoClasseService {
//
////    @Autowired
////    private OperadorLogado operadorLogado;
////    @Autowired
////    private ConsultaFormacaoClasseSoap consultaFormacaoClasseSoap;
//    @Autowired
//    private ConsultaFormacaoClasseRepository consultaFormacaoClasseRepository;
//    @Autowired
//    private ConsultaFormacaoClasseGenericRepository consultaFormacaoClasseGenericRepository;
//
//    public ConsultaFormacaoClasse consultaFormacaoClasse(ConsultaFormacaoClasse consultaFormacaoClasse) {
//        consultaFormacaoClasse = consultaFormacaoClasseRepository(consultaFormacaoClasse);
//        if (consultaFormacaoClasse != null && consultaFormacaoClasse.getId() == null) {
//            consultaFormacaoClasse = consultaFormacaoClasseServiceExterno(consultaFormacaoClasse);
//        }
//        return consultaFormacaoClasse;
//    }
//
//    public ConsultaFormacaoClasse consultaFormacaoClasseServiceExterno(ConsultaFormacaoClasse consultaFormacaoClasse) {
////        Operador operador = (Operador) operadorLogado.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        consultaFormacaoClasse = consultaFormacaoClasseSoap.consultaFormacaoClasse(consultaFormacaoClasse, authorizationServicoExterno);
//        return consultaFormacaoClasseRepository.save(consultaFormacaoClasse);
//    }
//
//    public ConsultaFormacaoClasse consultaFormacaoClasseRepository(ConsultaFormacaoClasse consultaFormacaoClasse) {
//        try {
//            return consultaFormacaoClasseGenericRepository.consultaFormacaoClasse(consultaFormacaoClasse);
//        } catch (Exception e) {
//            return consultaFormacaoClasse;
//        }
//    }
//
//}
