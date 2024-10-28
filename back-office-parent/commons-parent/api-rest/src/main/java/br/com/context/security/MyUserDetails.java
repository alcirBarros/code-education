//package br.com.apirest.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import br.com.apirest.models.user.repository.CredentialRepository;
//
//@Service
//public class MyUserDetails implements UserDetailsService {
//
//    @Autowired
//    private CredentialRepository credentialRepository;
//
//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserDetails userDetails = credentialRepository.findByUsername(username);
//
//        if (userDetails == null) {
//            throw new UsernameNotFoundException("User '" + username + "' not found");
//        }
//
//        return org.springframework.security.core.userdetails.User
//                .withUsername(username)
//                .password(userDetails.getPassword())
//                .authorities(userDetails.getAuthorities())
//                .accountExpired(false)
//                .accountLocked(false)
//                .credentialsExpired(false)
//                .disabled(false)
//                .build();
//    }
//
//}
