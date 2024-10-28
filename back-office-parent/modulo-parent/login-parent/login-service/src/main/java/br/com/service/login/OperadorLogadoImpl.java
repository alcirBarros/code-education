package br.com.service.login;

import br.com.context.security.OperadorDetail;
import br.com.context.security.OperadorLogado;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Primary
@Service
public class OperadorLogadoImpl implements OperadorLogado {

    @Override
    public OperadorDetail getUser() {
        return (OperadorDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
