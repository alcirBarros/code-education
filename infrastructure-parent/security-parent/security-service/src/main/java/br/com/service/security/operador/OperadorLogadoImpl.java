package br.com.service.security.operador;

import br.com.projeto.security.OperadorDetail;
import br.com.projeto.security.OperadorLogado;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Primary
@Service
//@Profile({"default"})
public class OperadorLogadoImpl implements OperadorLogado {

    @Override
    public OperadorDetail getUser() {
        return (OperadorDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}