package br.com.web;

import br.com.template.session.AdminFilter;
import java.util.logging.Logger;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com"})
@ServletComponentScan(basePackages = {"br.com"})
public class SpringBootTomcatApplication extends SpringBootServletInitializer implements CommandLineRunner {

    private static final Logger logger = Logger.getLogger(SpringBootTomcatApplication.class.toString());

    private static ApplicationContext applicationContext;

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringBootTomcatApplication.class);
        springApplication.setLogStartupInfo(false);
        springApplication.setBannerMode(Banner.Mode.OFF);
        applicationContext = springApplication.run(args);
    }

    @Override
    protected WebApplicationContext run(SpringApplication application) {
        return super.run(application);
    }

    @Override
    public void run(String... args) throws Exception {
        String property = env.getProperty("CAMINHO");
        System.out.println("br.com.web.SpringBootTomcatApplication.run()");
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        super.onStartup(servletContext);
        FilterRegistration fr = servletContext.addFilter("encodingFilter", new AdminFilter());
        fr.setInitParameter("encoding", "UTF-8");
        fr.setInitParameter("forceEncoding", "true");
        fr.addMappingForUrlPatterns(null, true, "/pages/*");

//        servletContext.addListener(new HttpSessionVerifier());
//        servletContext.addListener(new RequestContextListener());
        logger.info("********************** Application Startup **********************");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        logger.info("********************** Application booted **********************");
        return application.sources(SpringBootTomcatApplication.class
        //                , SecurityWebConfig.class
        );
    }
}
