package br.com.template.session;

import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AdminServletContextListener implements ServletContextListener {

    private static final Logger log = Logger.getLogger(AdminServletContextListener.class.getName());

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //only here for backyard compatibility
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}