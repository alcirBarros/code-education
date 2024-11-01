//package br.com.service.integracao.realizarmatriculainfosemra;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.realizarmatricula.model.RealizarMatriculaInfoSemRA;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
////import br.com.soap.modulo.integration.realizarmatriculasemra.service.RealizarMatriculaSemRaSoap;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.realizarmatriculasemra.RealizarMatriculaInfoSemRaRepository;
//
//@Configuration
//public class RealizarMatriculaInfoSemRaService {
//
////    @Autowired
////    private OperadorLogado operadorLogado;
////    @Autowired
////    private RealizarMatriculaSemRaSoap realizarMatriculaSemRaSoap;
//    @Autowired
//    private RealizarMatriculaInfoSemRaRepository incluirColetaClasseRepository;
//
//    public RealizarMatriculaInfoSemRA realizarMatriculaInfoSemRA(RealizarMatriculaInfoSemRA realizarMatriculaInfoSemRA) {
////        Operador operador = (Operador) operadorLogado.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        realizarMatriculaInfoSemRA = realizarMatriculaSemRaSoap.realizarMatriculaSemRA(realizarMatriculaInfoSemRA, authorizationServicoExterno);
//        return incluirColetaClasseRepository.save(realizarMatriculaInfoSemRA);
//    }
//}
