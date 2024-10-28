package br.com.template.util;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.slf4j.helpers.Util;

public class Utils {

    public static void addDetailMessage(String message) {
        addDetailMessage(message, "", FacesMessage.SEVERITY_INFO);
    }

    public static void addDetailMessage(String message, String tipo, FacesMessage.Severity severity) {
        FacesMessage facesMessage = new FacesMessage(severity, tipo, message);
        addDetailMessage(facesMessage);
    }

    public static void addDetailMessage(FacesMessage facesMessage) {
        FacesContext currentInstance = FacesContext.getCurrentInstance();
        ExternalContext externalContext = currentInstance.getExternalContext();
        externalContext.getFlash().setKeepMessages(true);
        currentInstance.addMessage("versionMessages", facesMessage);
    }

    public static void redirect(String pagina) {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            String url = context.getExternalContext().getRequestContextPath();
            ExternalContext externalContext = context.getExternalContext();
//            externalContext.getFlash().setKeepMessages(true);
            externalContext.redirect(url.concat(pagina));
        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
