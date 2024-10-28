package br.com.template.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@Component
@Scope("session")
public class MenssagesMb {

    public void warn() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "WARN", "Message warn");
        FacesContext currentInstance = FacesContext.getCurrentInstance();
        ExternalContext externalContext = currentInstance.getExternalContext();
      //  externalContext.getFlash().setKeepMessages(true);
        currentInstance.addMessage("versionMessages", message);
    }

    public void info() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Message info");
        FacesContext currentInstance = FacesContext.getCurrentInstance();
        ExternalContext externalContext = currentInstance.getExternalContext();
     //   externalContext.getFlash().setKeepMessages(true);
        currentInstance.addMessage(null, message);
    }

    public void error() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "ERROR", "Message error");
        FacesContext currentInstance = FacesContext.getCurrentInstance();
        ExternalContext externalContext = currentInstance.getExternalContext();
      //  externalContext.getFlash().setKeepMessages(true);
        currentInstance.addMessage(null, message);
    }

    public void fatal() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "FATAL", "Message fatal");
        FacesContext currentInstance = FacesContext.getCurrentInstance();
        ExternalContext externalContext = currentInstance.getExternalContext();
     //   externalContext.getFlash().setKeepMessages(true);
        currentInstance.addMessage("versionMessages", message);
    }
}
