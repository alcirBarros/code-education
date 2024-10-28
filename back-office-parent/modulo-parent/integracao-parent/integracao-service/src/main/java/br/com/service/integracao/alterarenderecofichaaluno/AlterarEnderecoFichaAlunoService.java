//package br.com.service.integracao.alterarenderecofichaaluno;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.alterarenderecofichaaluno.model.AlterarEnderecoFichaAluno;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
////import br.com.soap.modulo.integration.alterarenderecofichaaluno.AlterarEnderecoFichaAlunoSoap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.alterarenderecofichaaluno.AlterarEnderecoFichaAlunoRepository;
//
//@Configuration
//public class AlterarEnderecoFichaAlunoService {
//
////    @Autowired
////    private OperadorLogado operadorLogadoImpl;
////    @Autowired
////    private AlterarEnderecoFichaAlunoSoap alterarColetaClasseSoap;
//    @Autowired
//    private AlterarEnderecoFichaAlunoRepository alterarColetaClasseRepository;
//
//    public AlterarEnderecoFichaAluno alterarEnderecoFichaAluno(AlterarEnderecoFichaAluno alterarEnderecoFichaAluno) {
////        Operador operador = (Operador) operadorLogadoImpl.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        alterarEnderecoFichaAluno = alterarColetaClasseSoap.alterarEnderecoFichaAluno(alterarEnderecoFichaAluno, authorizationServicoExterno);
//        return alterarColetaClasseRepository.save(alterarEnderecoFichaAluno);
//    }
//}
