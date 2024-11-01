//package br.com.configuracao;
//
//import br.com.security.login.controller.WebSecurityConfigurer;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//
//@Configuration
//public class SecurityPessoa implements WebSecurityConfigurer {
//
//
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/pages/private/pessoa/pessoa.xhtml").hasAuthority("ROLE_ADMIN");
//    }
//
//
//
//}
