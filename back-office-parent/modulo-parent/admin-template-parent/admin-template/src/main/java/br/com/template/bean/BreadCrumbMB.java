package br.com.template.bean;

import static br.com.context.util.Assert.has;
import br.com.template.config.AdminConfig;
import br.com.template.model.BreadCrumb;
import br.com.template.scoped.ConfigurableBeanFactory;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class BreadCrumbMB implements Serializable {

    @Autowired
    private AdminConfig adminConfig;

    private int maxSize = 5;

    private List<BreadCrumb> breadCrumbs = new ArrayList<>();

    @PostConstruct
    public void init() {
        maxSize = adminConfig.getBreadCrumbMaxSize();
    }

    public void add(String link, String title, Boolean clear) {
        if (clear != null && clear) {
            breadCrumbs.clear();
        }
        if (title != null && !title.isEmpty()) {
            add(new BreadCrumb(link, title));
        }
    }

    public void add(String link, String title, Boolean clear, Boolean shouldAdd) {
        if (shouldAdd != null && shouldAdd) {
            this.add(link, title, clear);
        }
    }

    public void add(BreadCrumb breadCrumb) {
        String link = breadCrumb.getLink();
        if (!has(link)) {
            String pageUrl = FacesContext.getCurrentInstance().getViewRoot().getViewId();
            link = pageUrl.replaceAll(pageUrl.substring(pageUrl.lastIndexOf('.') + 1), adminConfig.getPageSufix());
        }

        if (!link.startsWith("/")) {
            link = "/" + link;
        }

        if (adminConfig.isExtensionLessUrls()) {
            int idx = link.lastIndexOf(".");
            if (idx != -1) {
                link = link.substring(0, idx);
            }
        } else if (!link.contains(".")) {
            link = link + "." + adminConfig.getPageSufix();
        }
        breadCrumb.setLink(link);

        if (breadCrumbs.contains(breadCrumb)) {
            breadCrumbs.remove(breadCrumb);
        }

        if (breadCrumbs.size() == maxSize) {
            breadCrumbs.remove(0);
        }
        breadCrumbs.add(breadCrumb);
    }

    public void remove(BreadCrumb breadCrumb) {
        breadCrumbs.remove(breadCrumb);
    }

    public void clear() {
        breadCrumbs.clear();
    }

    public void clearAndHome() {
        clear();
        try {
//            AdminUtils.redirect(Faces.getRequestBaseURL());
        } catch (Exception e) {
            //see issue #177
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Could not redirect to Home page.", e);
        }
    }

    public List<BreadCrumb> getBreadCrumbs() {
        return breadCrumbs;
    }

    public void setBreadCrumbs(List<BreadCrumb> breadCrumbs) {
        this.breadCrumbs = breadCrumbs;
    }

}
