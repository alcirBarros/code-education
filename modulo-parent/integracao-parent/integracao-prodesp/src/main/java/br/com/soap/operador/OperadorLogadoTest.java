package br.com.soap.operador;

import br.com.domain.Operador;
import br.com.projeto.security.OperadorLogado;
import br.com.repository.perfil.OperadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
//@Profile({"test"})
public class OperadorLogadoTest implements OperadorLogado {

    @Autowired
    private OperadorRepository operadorRepository;

    @Override
    public Operador getUser() {
        Operador operador = operadorRepository.findByUsername("admin");
        return operador;
    }
}
