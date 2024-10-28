package br.com.security.login.controller;

import br.com.template.session.AdminSession;
import java.io.Serializable;
import org.springframework.stereotype.Controller;

import br.com.template.util.Utils;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.keycloak.AuthorizationContext;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.representations.AccessToken;
import org.keycloak.representations.IDToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

@Controller
@Scope("session")
public class LogonMB extends AdminSession implements Serializable {

    @Autowired
    HttpServletRequest request;

    private String currentUser = "AAAAAAAAAAAAAAA";
    private String email;
    private String password;
    private boolean remember;

    @PostConstruct
    public void init() {
        String changeSessionId = request.changeSessionId();
        Cookie[] cookies = request.getCookies();
        int localPort = request.getLocalPort();

        KeycloakSecurityContext keycloakSecurityContext = (KeycloakSecurityContext) request.getAttribute(KeycloakSecurityContext.class.getName());
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

    public void login() throws ServletException {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Unable to authenticate", null);
        Utils.addDetailMessage(message);
        Utils.redirect("/pages/private/dashboard/dashboard.xhtml");

    }
    
    public void logout() throws ServletException {
        Utils.redirect("/logout");
    }

    @Override
    public boolean isLoggedIn() {
        return currentUser != null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

}
