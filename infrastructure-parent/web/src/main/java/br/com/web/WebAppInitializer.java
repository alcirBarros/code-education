package br.com.web;

import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class WebAppInitializer implements WebApplicationInitializer {

    private static final Logger logger = Logger.getLogger(WebAppInitializer.class.toString());

    @Override
    public void onStartup(ServletContext container) throws ServletException {
        logger.info("onStartup WebAppInitializer");
    }

}
