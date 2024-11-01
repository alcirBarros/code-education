//package br.com.service.integracao.trocaralunoclassera;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.trocaralunoclassera.TrocarAlunoClasseRA;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
////import br.com.soap.modulo.integration.trocaralunoclassera.TrocarAlunoClasseRaSoap;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.trocaralunoclassera.TrocarAlunoClasseRaRepository;
//
//@Configuration
//public class TrocarAlunoClasseRaService {
//
////    @Autowired
////    private OperadorLogado operadorLogado;
////    @Autowired
////    private TrocarAlunoClasseRaSoap incluirColetaClasseSoap;
//    @Autowired
//    private TrocarAlunoClasseRaRepository incluirColetaClasseRepository;
//
//    public TrocarAlunoClasseRA realizarMatriculaInfoSemRA(TrocarAlunoClasseRA trocarAlunoClasseRA) {
////        Operador operador = (Operador) operadorLogado.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        trocarAlunoClasseRA = incluirColetaClasseSoap.trocarAlunoClasseRA(trocarAlunoClasseRA, authorizationServicoExterno);
//        return incluirColetaClasseRepository.save(trocarAlunoClasseRA);
//    }
//}
