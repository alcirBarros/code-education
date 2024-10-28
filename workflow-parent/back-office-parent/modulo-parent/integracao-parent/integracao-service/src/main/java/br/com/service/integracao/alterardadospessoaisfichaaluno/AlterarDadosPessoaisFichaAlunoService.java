//package br.com.service.integracao.alterardadospessoaisfichaaluno;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.alterardadospessoaisfichaaluno.model.AlterarDadosPessoaisFichaAluno;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
////import br.com.soap.modulo.integration.alterardadospessoaisfichaaluno.AlterarDadosPessoaisFichaAlunoSoap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.alterardadospessoaisfichaaluno.AlterarDadosPessoaisFichaAlunoRepository;
//
//@Configuration
//public class AlterarDadosPessoaisFichaAlunoService {
//
////    @Autowired
////    private OperadorLogado operadorLogadoImpl;
////    @Autowired
////    private AlterarDadosPessoaisFichaAlunoSoap alterarColetaClasseSoap;
//    @Autowired
//    private AlterarDadosPessoaisFichaAlunoRepository alterarColetaClasseRepository;
//
//    public AlterarDadosPessoaisFichaAluno alterarDadosPessoaisFichaAluno(AlterarDadosPessoaisFichaAluno alterarDadosPessoaisFichaAluno) {
////        Operador operador = (Operador) operadorLogadoImpl.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        alterarDadosPessoaisFichaAluno = alterarColetaClasseSoap.alterarDadosPessoaisFichaAluno(alterarDadosPessoaisFichaAluno, authorizationServicoExterno);
//        return alterarColetaClasseRepository.save(alterarDadosPessoaisFichaAluno);
//    }
//}
