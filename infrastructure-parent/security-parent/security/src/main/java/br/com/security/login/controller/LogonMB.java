package br.com.security.login.controller;

import br.com.template.session.AdminSession;
import java.io.Serializable;
import org.springframework.stereotype.Controller;

import br.com.template.util.Utils;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

@Controller
@Scope("session")
public class LogonMB extends AdminSession implements Serializable {

    @Autowired
    private AuthenticationManager authenticationManager;

    private String currentUser;
    private String email;
    private String password;
    private boolean remember;

    @PostConstruct
    public void init() {
        System.out.println("br.com.web.configuracao.security.LogonMB.init()");
    }

    public void login() {
        FacesMessage message = null;
        try {
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(this.email, String.valueOf(this.password));
            Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);

            if (authentication.isAuthenticated()) {
                SecurityContextHolder.createEmptyContext();
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }

        } catch (BadCredentialsException e) {
//            log.error("Bad credentials for user {}", email);
            message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Bad credentials", null);
        } catch (DisabledException e) {
//            log.error("User {} is disabled", email);
            message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "User is disabled", null);
        } catch (AuthenticationException e) {
//            log.error("Exception in authentication for user {}", email);
            message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Unable to authenticate", null);
        }

        if (message != null) {
            Utils.addDetailMessage(message);
        } else {
            currentUser = email;
            Utils.addDetailMessage("Logged in successfully as <b>" + email + "</b>");
            Utils.redirect("pages/private/dashboard/dashboard.xhtml");
        }
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
