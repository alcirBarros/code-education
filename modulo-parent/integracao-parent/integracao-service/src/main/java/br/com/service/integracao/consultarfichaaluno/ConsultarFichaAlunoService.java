//package br.com.service.integracao.consultarfichaaluno;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.consultafichaaluno.model.ConsultaRA;
//import br.com.domain.integracao.consultafichaaluno.model.ConsultarFichaAluno;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import java.util.List;
//import javax.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.consultarfichaaluno.ConsultarFichaAlunoGenericRepository;
//import br.com.repository.integracao.consultarfichaaluno.ConsultarFichaAlunoRepository;
////import br.com.soap.modulo.integration.consultarfichaaluno.ConsultarFichaAlunoSoap;
//
//@Service
//public class ConsultarFichaAlunoService {
//
////    @Autowired
////    private OperadorLogado operadorLogado;
//
//    @Autowired
//    private ConsultarFichaAlunoRepository consultarFichaAlunoRepository;
//
//    @Autowired
//    private ConsultarFichaAlunoGenericRepository consultarFichaAlunoGenericRepository;
//
////    @Autowired
////    private ConsultarFichaAlunoSoap consultarFichaAlunoSoap;
//
//    @PostConstruct
//    private void init() {
//        System.out.println(this.getClass().getPackage().getName());
//    }
//
//    public List<ConsultarFichaAluno> findAll() {
//        return consultarFichaAlunoRepository.findAll();
//    }
//
//    public ConsultarFichaAluno consultarFichaAluno(ConsultarFichaAluno consultarFichaAluno) {
//        consultarFichaAluno = consultarFichaAlunoRepository(consultarFichaAluno);
//        if (consultarFichaAluno != null && consultarFichaAluno.getId() == null) {
//            consultarFichaAluno = consultarFichaAlunoServiceExterno(consultarFichaAluno);
//        }
//        return consultarFichaAluno;
//    }
//
//    public ConsultarFichaAluno consultarFichaAlunoServiceExterno(ConsultarFichaAluno consultarFichaAluno) {
////        Operador operador = (Operador) operadorLogado.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        consultarFichaAluno = consultarFichaAlunoSoap.consultarFichaAluno(consultarFichaAluno, authorizationServicoExterno);
//        return consultarFichaAlunoRepository.save(consultarFichaAluno);
//    }
//
//    public ConsultarFichaAluno consultarFichaAlunoRepository(ConsultarFichaAluno consultarFichaAluno) {
//        try {
//            ConsultaRA consultaRA = consultarFichaAluno.getConsultaRA();
//            return consultarFichaAlunoGenericRepository.consultarFichaAluno(consultaRA);
//        } catch (Exception e) {
//            return consultarFichaAluno;
//        }
//    }
//}
