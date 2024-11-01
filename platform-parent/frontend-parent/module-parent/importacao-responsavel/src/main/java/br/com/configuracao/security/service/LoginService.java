package br.com.configuracao.security.service;

import br.com.configuracao.security.model.UsuarioSistema;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class LoginService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_USUARIO"));
        grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_VISUALIZAR_RELATORIO_CUSTOS"));
        grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_VISUALIZAR_RELATORIO_EQUIPE"));
        return new UsuarioSistema("Operador do Sistema", "admin", "$2a$16$NYEsTLJvJvJhSmPqNPP19eRVQnvbbFswl6eHvfJYAp7mF6KX2Br1u", grantedAuthorityList);
    }

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder(16).encode("!@#facil"));
    }
}
