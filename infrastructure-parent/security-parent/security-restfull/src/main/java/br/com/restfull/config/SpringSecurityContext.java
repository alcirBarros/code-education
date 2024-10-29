package br.com.restfull.config;

import br.com.restfull.model.Token;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SpringSecurityContext {

    static public Token getToken() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null) {
            throw new AccessDeniedException("Access forbidden: not authenticated");
        }
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof Token) {
            return (Token) principal;
        }
        throw new AccessDeniedException(
                "Access forbidden: SecurityContextHolder does not contain a principal of type 'Token' " + principal);
    }

    static public void clear() {
        SecurityContextHolder.clearContext();
    }
}
