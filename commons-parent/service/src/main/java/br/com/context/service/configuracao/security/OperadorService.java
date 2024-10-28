//package br.com.service.configuracao.security;
//
//import br.com.domain.configuracao.security.model.Operador;
//import br.com.repository.db.mysql.repository.auxiliar.security.OperadorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import br.com.projeto.security.OperadorLogado;
//
//@Service
//public class OperadorService {
//
//    @Autowired
//    private OperadorRepository operadorRepository;
//    @Autowired
//    private OperadorLogado operadorLogado;
//
//    public Operador save(Operador operador) {
//        return operadorRepository.save(operador);
//    }
//
//    public Operador getOperadorLogado() {
//        return (Operador) operadorLogado.getUser();
//    }
//}
