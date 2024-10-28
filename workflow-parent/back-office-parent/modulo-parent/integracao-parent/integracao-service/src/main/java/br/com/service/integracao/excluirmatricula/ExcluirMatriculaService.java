//package br.com.service.integracao.excluirmatricula;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.excluirmatricula.model.ExcluirMatricula;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
////import br.com.soap.modulo.integration.excluirmatricula.ExcluirMatriculaSoap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.excluirmatricula.ExcluirMatriculaRepository;
//import java.util.List;
//
//@Configuration
//public class ExcluirMatriculaService {
//
////    @Autowired
////    private OperadorLogado operadorLogado;
////    @Autowired
////    private ExcluirMatriculaSoap consultarQuadroResumoSoap;
//    @Autowired
//    private ExcluirMatriculaRepository consultarQuadroResumoRepository;
//
//    public List<ExcluirMatricula> findAll() {
//        return consultarQuadroResumoRepository.findAll();
//    }
//
//    public ExcluirMatricula excluirMatricula(ExcluirMatricula excluirMatricula) {
////        Operador operador = (Operador) operadorLogado.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        excluirMatricula = consultarQuadroResumoSoap.excluirMatricula(excluirMatricula, authorizationServicoExterno);
//        return consultarQuadroResumoRepository.save(excluirMatricula);
//    }
//
//}
