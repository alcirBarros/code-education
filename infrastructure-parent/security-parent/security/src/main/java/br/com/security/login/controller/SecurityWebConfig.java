package br.com.security.login.controller;

import br.com.service.modulo.login.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@ComponentScan({"br.com.web.configuracao.security"})
public class SecurityWebConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private Authorization authorization;

//    @Autowired
//    private DataSource dataSource;
//    @Autowired
//    private LoginSuccess loginSuccess;
//
//    @Autowired
//    private LogoutSuccess logoutSuccess;
    @Autowired
    private LoginService loginService;

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("root").password("$2a$16$ztHxCLzhq/fF5O3dvJWgY.XQ/1cIJRgn5aNhpQk/I5n6n49kn4Jm2").roles("USER");

//        if (inMemoryAuthEnabled) {
//            System.out.println(">>>>> [IN-MEMORY] Authentication Provider enabled: " + inMemoryAuthEnabled);
//            auth.inMemoryAuthentication().withUser(inMemoryAuthUser).password(inMemoryAuthPasswd).roles("USER");
//        }
//        if (ldapAuthEnabled) {
//            System.out.println(">>>>> [LDAP] Authentication Provider enabled: " + ldapAuthEnabled);
//            DefaultSpringSecurityContextSource ldapContextSource = new DefaultSpringSecurityContextSource(ldapAuthUrl + "/" + ldapAuthBaseDn);
//            if (ldapAuthPrincipalUser != null) {
//                ldapContextSource.setUserDn(ldapAuthPrincipalUser);
//                ldapContextSource.setPassword(ldapAuthPrincipalPasswd);
//                System.out.println("Initializing LDAP Source with Principal '" + ldapAuthPrincipalUser + "/****'");
//            }
//            ldapContextSource.afterPropertiesSet();
//            auth.ldapAuthentication()
//                    .userSearchBase(ldapUsersSearchBase)
//                    .userSearchFilter(ldapUsersSearchFilter)
//                    .groupSearchBase(ldapGroupsSearchBase)
//                    .groupSearchFilter(ldapGroupsSearchFilter)
//                    .contextSource(ldapContextSource);
//        }
//        if (adAuthEnabled) {
//            System.out.println(">>>>> [ACTIVE DIRECTORY] Authentication Provider enabled: " + adAuthEnabled);
//            ActiveDirectoryLdapAuthenticationProvider adSource = new ActiveDirectoryLdapAuthenticationProvider(adAuthDomain, adAuthUrl, adAuthBaseDn);
//            adSource.setConvertSubErrorCodesToExceptions(true);
//            adSource.setSearchFilter(adAuthUsersFilter);
//            auth.authenticationProvider(adSource);
//
//        }
//        if (jdbcAuthEnabled) {
//            System.out.println(">>>>> [JDBC] Authentication Provider enabled: " + jdbcAuthEnabled);
//            auth.jdbcAuthentication().dataSource(dataSource)
//                    .usersByUsernameQuery(jdbcAuthQuery);
//        }
//        if (wsAuthEnabled) {
//            System.out.println(">>>>> [REMOTE WEB SERVICE] Authentication Provider enabled: " + wsAuthEnabled);
//            // Create your custom provider by implementing the AuthenticationProvider interface and set here the provider responsible for the external authentication.
//            auth.authenticationProvider(wsAuthProvider);
//        }
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**", "/css/**", "/img/**", "/webjars/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.sessionManagement()
                .maximumSessions(1);

        http
                .authorizeRequests()
                .antMatchers("/", "/login.xhtml", "/javax.faces.resource/**").permitAll()
                .antMatchers("/mensagem/**").permitAll()
                .antMatchers("/pages/private/login/login.xhtml").permitAll()
                .anyRequest()
                .fullyAuthenticated()
                .and()
                .formLogin().loginPage("/login.xhtml")
                .defaultSuccessUrl("/index.xhtml")
                .failureUrl("/login.xhtml?authfailed=true").permitAll()
                .and()
                .logout().logoutSuccessUrl("/login.xhtml")
                .logoutUrl("/j_spring_security_logout")
                .and()
                .csrf().disable();

        // allow to use ressource links like pdf
        http.headers().frameOptions().sameOrigin();

//        http.authorizeRequests()
//                .antMatchers("/", "/index.xhtml").permitAll()
//                .antMatchers("/pages/private/login/login.xhtml").permitAll()
        //                .antMatchers("/pages/private/**").authenticated()
        //                .antMatchers("/webservice/private/**").authenticated()
        //                .antMatchers("/admin").hasRole("ADMIN")
        //                .antMatchers(arrayDeNomes).hasAnyRole(rolesArray)
        //		.antMatchers(HttpMethod.POST, "/pages/private/administracao/consultarFichaAluno/consultarFichaAluno.xhtml").hasRole("CONSULTAR_FICHA_ALUNO")
        //                .antMatchers("/javax.faces.resource/**")
        //                .permitAll()
        //                .antMatchers("/**").hasRole("ADMIN")
        //              .antMatchers("/dashboard").hasRole("DASHBOARD")
        //              .antMatchers("/usuario").hasRole("USUARIO")
        //                .antMatchers("/resources/**", "/webjars/**").permitAll()
        //                              .antMatchers("/vendas/relatorios/equipe").hasRole("VISUALIZAR_RELATORIO_EQUIPE")
        //                              .antMatchers("/vendas/relatorios/custos").hasRole("VISUALIZAR_RELATORIO_CUSTOS")
        //                              .antMatchers("/pages/**").access("hasRole('ADMIN') and hasIpAddress('123.123.123.123')") // pass SPEL using access method
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic()
//                .and()
        //                .exceptionHandling()
        //                .accessDeniedPage("/pages/private/principal/principal.xhtml")
        //                .and()
//                .formLogin()
        //                .defaultSuccessUrl("/index.xhtml")
        //                .successHandler(loginSuccess)
//                .loginPage("/login.xhtml").permitAll()
        //                .usernameParameter("formLogin:username")
        //                .passwordParameter("formLogin:password")
        //.failureUrl("/pages/private/login/login.xhtml?error=1")
        //                .permitAll()
        //                .and()
        //                .rememberMe()
        //                .and()
        //                .logout()
        //                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .and()
//                .csrf()
//                .disable();
        //                    .logoutUrl("/logout")
        //                    .logoutSuccessUrl("/index.xhtml").permitAll()
        //                    .invalidateHttpSession(true)
        //                    .deleteCookies("JSESSIONID");
        //                    .logoutSuccessHandler(logoutSuccess)
        //                    .logoutSuccessUrl("/pages/private/login/login.xhtml?logout")
        //                    .permitAll();
//        http.sessionManagement()
//                .maximumSessions(1);
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder builder) throws Exception {
////        JdbcUserDetailsManagerConfigurer<AuthenticationManagerBuilder> jdbcAuthentication = builder.jdbcAuthentication();
////        jdbcAuthentication.dataSource(dataSource);
////        jdbcAuthentication.usersByUsernameQuery("select username as principal, password as credentials, true from users where username = ?");
////        jdbcAuthentication.authoritiesByUsernameQuery("select username as principal, authority as role from authorities where username = ?");
////        jdbcAuthentication.rolePrefix("ROLE_");
//        builder.authenticationProvider(authorization);
//        DaoAuthenticationConfigurer<AuthenticationManagerBuilder, LoginService> userDetailsService = builder.userDetailsService(loginService);
//        userDetailsService.passwordEncoder(passwordEncoder());
//
//    }

}
