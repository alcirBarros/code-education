///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.log4j2.log4j2;
//
//import br.com.Log4j2DemoApplication;
//import org.apache.logging.log4j.Level;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.core.Appender;
//import org.apache.logging.log4j.core.LoggerContext;
//import org.apache.logging.log4j.core.appender.ConsoleAppender;
//import org.apache.logging.log4j.core.config.AppenderRef;
//import org.apache.logging.log4j.core.config.Configuration;
//import org.apache.logging.log4j.core.config.LoggerConfig;
//import org.apache.logging.log4j.core.layout.PatternLayout;
//
//import java.nio.charset.Charset;
//
///**
// *
// * @author alcir
// */
//public class config02 {
//
//    private static final Logger logger = LogManager.getLogger(Log4j2DemoApplication.class.getName());
//
//    public static void mainn(String[] args) {
//        LoggerContext context = (LoggerContext) LogManager.getContext();
//        Configuration config = context.getConfiguration();
//
//        PatternLayout layout = PatternLayout.createDefaultLayout();
//        ConsoleAppender appender = ConsoleAppender.createDefaultAppenderForLayout(layout);
//        appender.start();
//        AppenderRef ref = AppenderRef.createAppenderRef("CONSOLE_APPENDER", null, null);
//
//        AppenderRef[] refs = new AppenderRef[]{ref};
//        //   LoggerConfig loggerConfig = LoggerConfig.createLogger("false", Level.INFO, "CONSOLE_LOGGER", "com", refs, null, null, null);
//        LoggerConfig loggerConfig = LoggerConfig.createLogger(false, Level.INFO, "CONSOLE_LOGGER", "com", refs, null, config, null);
//        loggerConfig.addAppender(appender, null, null);
//
//        config.addAppender(appender);
//        config.addLogger("br.com.log4j2", loggerConfig);
//        context.updateLoggers(config);
//
//       // Logger logger = LogManager.getContext().getLogger("br.com.log4j2");
//        logger.info("HELLO_WORLD");
//
//    }
//}
