//package br.com.service.integracao.realizarmatriculacomra;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.realizarmatriculacomra.model.RealizarMatriculaInfoComRA;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
////import br.com.soap.modulo.integration.realizarmatriculacomra.service.RealizarMatriculaComRaSoap;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.realizarmatriculacomra.RealizarMatriculaInfoComRaRepository;
//
//@Configuration
//public class RealizarMatriculaInfoComRaService {
//
////    @Autowired
////    private OperadorLogado operadorLogado;
////    @Autowired
////    private RealizarMatriculaComRaSoap realizarMatriculaComRaSoap;
//    @Autowired
//    private RealizarMatriculaInfoComRaRepository realizarMatriculaInfoComRaRepository;
//
//    public RealizarMatriculaInfoComRA realizarMatriculaInfoSemRA(RealizarMatriculaInfoComRA realizarMatriculaInfoComRA) {
////        Operador operador = (Operador) operadorLogado.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        realizarMatriculaInfoComRA = realizarMatriculaComRaSoap.realizarMatriculaInfoComRA(realizarMatriculaInfoComRA, authorizationServicoExterno);
//        return realizarMatriculaInfoComRaRepository.save(realizarMatriculaInfoComRA);
//    }
//}
