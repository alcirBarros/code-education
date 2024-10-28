//package br.com.service.integracao.consultarmatriculasra;
//
//import br.com.domain.Operador;
//import br.com.domain.integracao.consultarmatriculasra.ConsultarMatriculasRa;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
////import br.com.soap.modulo.integration.consultarmatriculasra.ConsultarMatriculasRaSoap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import br.com.projeto.security.OperadorLogado;
//import br.com.repository.integracao.consultarmatriculasra.ConsultarMatriculasRaRepository;
//
//@Service
//public class ConsultarMatriculasRaService {
//
////    @Autowired
////    private OperadorLogado operadorLogado;
////    @Autowired
////    private ConsultarMatriculasRaSoap consultarColetaClasseSoap;
//    @Autowired
//    private ConsultarMatriculasRaRepository consultarColetaClasseRepository;
//
//    public ConsultarMatriculasRa consultarMatriculasRa(ConsultarMatriculasRa consultarMatriculasRa) {
////        Operador operador = (Operador) operadorLogado.getUser();
////        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
////        consultarMatriculasRa = consultarColetaClasseSoap.consultarMatriculasRa(consultarMatriculasRa, authorizationServicoExterno);
//        return consultarColetaClasseRepository.save(consultarMatriculasRa);
//    }
//}
