package com.dinuth.keycloakspringbootmicroservice.controller;

import org.keycloak.AuthorizationContext;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.RefreshableKeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.AccessToken;
import org.keycloak.representations.IDToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.security.RolesAllowed;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;


//@Validated
@RestController
@RequestMapping("/test")
//@PreAuthorize("isAuthenticated()")
//@Scope("session")
public class TestController {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @PostConstruct
    public void init(){
        System.out.println("AAAAAAAAAAAAAAAAAAAa");
    }

    public void infoUser() {
        String changeSessionId = httpServletRequest.changeSessionId();
        Cookie[] cookies = httpServletRequest.getCookies();
        int localPort = httpServletRequest.getLocalPort();

        KeycloakSecurityContext keycloakSecurityContext = (KeycloakSecurityContext) httpServletRequest.getAttribute(KeycloakSecurityContext.class.getName());
        String tokenString = keycloakSecurityContext.getTokenString();
        IDToken idToken = keycloakSecurityContext.getIdToken();
        String realm = keycloakSecurityContext.getRealm();

        AuthorizationContext authorizationContext = keycloakSecurityContext.getAuthorizationContext();

        AccessToken accessToken = keycloakSecurityContext.getToken();

        AccessToken.Access realmAccess = accessToken.getRealmAccess();
        String email1 = accessToken.getEmail();
        String givenName = accessToken.getGivenName();
        String name = accessToken.getName();
        String nickName = accessToken.getNickName();
        String scope = accessToken.getScope();

        Map<String, AccessToken.Access> resourceAccess = accessToken.getResourceAccess();

        AccessToken.Authorization authorization = accessToken.getAuthorization();

        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        Object principal = authentication.getPrincipal();

        System.out.println("br.com.web.configuracao.security.LogonMB.init()");
    }

    //@PermitAll
    @PreAuthorize("isAuthenticated()")
    @RequestMapping(value = "/anonymous", method = RequestMethod.GET)
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("Hello Anonymous");
    }

    @RolesAllowed("user")
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<String> getUser(@RequestHeader String authorization) {
        return ResponseEntity.ok("Hello User");
    }

    @RolesAllowed("administrator")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ResponseEntity<String> getAdmin(@RequestHeader String Authorization, @AuthenticationPrincipal Object principal, CsrfToken csrfToken) {

        KeycloakPrincipal<KeycloakSecurityContext> kp = (KeycloakPrincipal<KeycloakSecurityContext>) principal;
        AccessToken token = kp.getKeycloakSecurityContext().getToken();

        String id = token.getId();
        String name = token.getName();
        Map<String, Object> otherClaims = token.getOtherClaims();

        return ResponseEntity.ok("Hello Admin");
    }

    @Secured("ROLE_USER")
    @PreAuthorize("hasRole('ROLE_USER')")
    @RolesAllowed({ "administrator", "user" })
    @RequestMapping(value = "/authentication", method = RequestMethod.GET)
    public ResponseEntity<String> authentication(HttpServletRequest httpServletRequest, @AuthenticationPrincipal Object customUser) {
        KeycloakAuthenticationToken authentication = (KeycloakAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        KeycloakPrincipal<KeycloakSecurityContext> keycloakSecurityContextKeycloakPrincipal = (KeycloakPrincipal<KeycloakSecurityContext>) customUser;
        RefreshableKeycloakSecurityContext keycloakSecurityContext = (RefreshableKeycloakSecurityContext) keycloakSecurityContextKeycloakPrincipal.getKeycloakSecurityContext();
        AccessToken token = keycloakSecurityContext.getToken();
        return ResponseEntity.ok("Hello User");
    }
}