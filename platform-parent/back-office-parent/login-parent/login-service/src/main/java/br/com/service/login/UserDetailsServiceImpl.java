package br.com.service.login;

import br.com.context.model.Operador;
import br.com.repository.login.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private SecurityRepository securityRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Operador operador = securityRepository.findByUsername(username).orElseThrow(()->{
            return new UsernameNotFoundException("Operador não encontrado.");
        });
        return operador;
    }

}
