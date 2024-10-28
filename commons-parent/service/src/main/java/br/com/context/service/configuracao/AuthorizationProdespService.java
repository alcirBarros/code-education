//package br.com.service.configuracao;
//
//import br.com.domain.configuracao.security.model.Operador;
//import br.com.domain.configuracao.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.domain.configuracao.servicoexterno.model.ServicoExterno;
//import br.com.domain.configuracao.servicoexterno.model.TipoServicoExterno;
//import br.com.repository.db.mysql.repository.auxiliar.servicoexterno.AuthorizationProdespRepository;
//import br.com.service.configuracao.security.OperadorService;
//import br.com.projeto.security.OperadorLogado;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthorizationProdespService {
//
//    @Autowired
//    private OperadorLogado operadorLogado;
//
//    @Autowired
//    private OperadorService operadorService;
//    @Autowired
//    private AuthorizationProdespRepository authorizationProdespRepository;
//
//    public AuthorizationServicoExterno save(AuthorizationServicoExterno authorizationServicoExterno) {
//        Operador operador = operadorService.getOperadorLogado();
//        AuthorizationServicoExterno authorizationServicoExterno1 = operador.getAuthorizationServicoExterno();
//
//        if (authorizationServicoExterno1 != null) {
//            authorizationServicoExterno1.setUrl(authorizationServicoExterno.getUrl());
//            authorizationServicoExterno1.setUsername(authorizationServicoExterno.getUsername());
//            authorizationServicoExterno1.setPassword(authorizationServicoExterno.getPassword());
//        } else {
//            String url = authorizationServicoExterno.getUrl();
//            String username = authorizationServicoExterno.getUsername();
//            String password = authorizationServicoExterno.getPassword();
//            operador = autualizarRegistro(operador, url, username, password);
//        }
//
//        return operadorService.save(operador).getAuthorizationServicoExterno();
//    }
//
//    public ServicoExterno findByTipoServicoExterno(TipoServicoExterno tipoServicoExterno) {
//        return authorizationProdespRepository.findByTipoServicoExterno(tipoServicoExterno);
//    }
//
//    public AuthorizationServicoExterno findByServicoExterno() {
//        return operadorService.getOperadorLogado().getAuthorizationServicoExterno();
//    }
//
//    private Operador autualizarRegistro(Operador operador, String url, String username, String password) {
//        AuthorizationServicoExterno authorizationServicoExterno = AuthorizationServicoExterno.criarInstancia();
//        authorizationServicoExterno.setUrl(url);
//        authorizationServicoExterno.setUsername(username);
//        authorizationServicoExterno.setPassword(password);
//        authorizationServicoExterno.setServicoExterno(authorizationProdespRepository.findByTipoServicoExterno(TipoServicoExterno.PRODESP));
//        operador.setAuthorizationServicoExterno(authorizationServicoExterno);
//        return operador;
//    }
//
//}
