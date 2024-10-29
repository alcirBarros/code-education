//package br.com.security.login.controller;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Authorization implements AuthenticationManager, AuthenticationProvider, Serializable {
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @PostConstruct
//    private void init() {
//        System.out.println("br.com.web.configuracao.security.Authorization.init()");
//    }
//
//    private static List<User> users = new ArrayList();
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//
//        String name = authentication.getName();
//
//        Object credentials = authentication.getCredentials();
//
//        String password_ = credentials.toString();
//
//        System.out.println("credentials class: " + credentials.getClass());
//
//        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
//
//        String username = String.valueOf(auth.getPrincipal());
//        String password = String.valueOf(auth.getCredentials());
//
//        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//
//        if (userDetails == null) {
//            throw new BadCredentialsException("Wrong password.");
//        }
//
////        if (!passwordEncoder.matches(password, userDetails.getPassword())) {
////            throw new BadCredentialsException("Wrong password.");
////        }
//        Collection<? extends GrantedAuthority> grantedAuthorityList = userDetails.getAuthorities();
//        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, password, grantedAuthorityList);
//
//        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//        Authentication auth_ = new UsernamePasswordAuthenticationToken(name, password, grantedAuthorities);
//
//        return usernamePasswordAuthenticationToken;
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return authentication.equals(UsernamePasswordAuthenticationToken.class);
//    }
//
//    public static class PasswordEncoder extends BCryptPasswordEncoder implements Serializable {
//
//        public PasswordEncoder(int strength) {
//            super(strength);
//        }
//
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new PasswordEncoder(16);
//    }
////    public static void main(String[] args) {
////        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
////        System.out.println(encoder.encode("admin"));
////
////    }
//}
