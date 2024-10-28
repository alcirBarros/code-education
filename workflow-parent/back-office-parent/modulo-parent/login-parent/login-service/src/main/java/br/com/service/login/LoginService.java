//package br.com.service.modulo.login;
//
//import br.com.domain.Operador;
//import br.com.repository.security.repository.OperadorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class LoginService implements UserDetailsService {
//
//    @Autowired
//    private OperadorRepository operadorRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        Operador operador = operadorRepository.findByUsername(username);
//        if (operador == null) {
//            throw new UsernameNotFoundException("Unknown User");
//        }
//        //        HashMap<String, Operador> operadorList = new HashMap<>();
//        //        {
//        //            Collection<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
//        //            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_USUARIO"));
//        //            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_VISUALIZAR_RELATORIO_CUSTOS"));
//        //            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_VISUALIZAR_RELATORIO_EQUIPE"));
//        //            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_CONSULTAR_FICHA_ALUNO"));
//        //            Operador operador = new Operador("admin", "$2a$16$h6zfpndZqr9hKlR2QoEiOeKE3lSy9HMB0hJcNmd.JDU07UdEivjF2", grantedAuthorityList);
//        //            operadorList.put("admin", operador);
//        //        }
//        //
//        //        {
//        //            Collection<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
//        //            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_USUARIO"));
//        //            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_VISUALIZAR_RELATORIO_CUSTOS"));
//        //            Operador operador = new Operador("user", "$2a$16$h6zfpndZqr9hKlR2QoEiOeKE3lSy9HMB0hJcNmd.JDU07UdEivjF2", grantedAuthorityList);
//        //            operadorList.put("user", operador);
//        //        }
//        //        return operadorList.get(username);
//        return operador;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(new BCryptPasswordEncoder(16).encode("!@#facil"));
//    }
//}
