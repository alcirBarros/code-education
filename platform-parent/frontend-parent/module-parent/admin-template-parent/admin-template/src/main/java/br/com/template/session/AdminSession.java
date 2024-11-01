package br.com.template.session;

import br.com.template.scoped.ConfigurableBeanFactory;
import java.io.Serializable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class AdminSession implements Serializable {

    private boolean isLoggedIn = false;

    private boolean userRedirected = false;

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public boolean isUserRedirected() {
        return userRedirected;
    }

    public void setUserRedirected(boolean userRedirected) {
        this.userRedirected = userRedirected;
    }
}
