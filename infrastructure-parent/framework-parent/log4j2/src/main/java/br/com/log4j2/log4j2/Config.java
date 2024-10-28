///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.log4j2.log4j2;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.Serializable;
//import org.apache.logging.log4j.Level;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.core.Appender;
//import org.apache.logging.log4j.core.Layout;
//import org.apache.logging.log4j.core.LoggerContext;
//import org.apache.logging.log4j.core.appender.ConsoleAppender;
//import org.apache.logging.log4j.core.appender.FileAppender;
//import org.apache.logging.log4j.core.config.AppenderRef;
//import org.apache.logging.log4j.core.config.Configuration;
//import org.apache.logging.log4j.core.config.ConfigurationFactory;
//import org.apache.logging.log4j.core.config.ConfigurationSource;
//import org.apache.logging.log4j.core.config.LoggerConfig;
//import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;
//import org.apache.logging.log4j.core.layout.PatternLayout;
//
///**
// *
// * @author alcir
// */
//public class Config {
//
//    public static void config() throws FileNotFoundException, IOException {
//        ConfigurationFactory factory = XmlConfigurationFactory.getInstance();
//
//        // Locate the source of this configuration, this located file is dummy file contains just an empty configuration Tag
//        ConfigurationSource configurationSource = new ConfigurationSource(new FileInputStream(new File("C:\\Users\\alcir\\Desenvolvimento\\Projeto\\educa-facil\\log4j-2\\src\\main\\resources\\log4j2.xml")));
//
//        // Get context instance
//        LoggerContext context = new LoggerContext("JournalDevLoggerContext");
//
//        // Get a reference from configuration
//        Configuration configuration = factory.getConfiguration(context, configurationSource);
//
////        PatternLayout.Builder patternBuilder = PatternLayout.newBuilder();
////        patternBuilder.withPattern("%d %p %c{1.}: %m%n");
////        PatternLayout layouta = patternBuilder.build();
//        PatternLayout layout = PatternLayout.createDefaultLayout();
//
//        // Create default console appender
//        ConsoleAppender appender = ConsoleAppender.createDefaultAppenderForLayout(layout);
//
//        // Add console appender into configuration
//        configuration.addAppender(appender);
//
//        // Create loggerConfig
//        LoggerConfig loggerConfig = new LoggerConfig("br.com", Level.FATAL, false);
//
//        // Add appender
////        loggerConfig.addAppender(appender, null, null);
//        // Add logger and associate it with loggerConfig instance
//        configuration.addLogger("br.com", loggerConfig);
//
//        // Start logging system
//        context.start(configuration);
//
//        // Get a reference for logger
//        Logger logger = context.getLogger("br.com");
//
//        // LogEvent of DEBUG message
//        logger.log(Level.FATAL, "Logger Name :: " + logger.getName() + " :: Passed Message ::");
//
//        // LogEvent of Error message for Logger configured as FATAL
//        logger.log(Level.ERROR, "Logger Name :: " + logger.getName() + " :: Not Passed Message ::");
//    }
//
//    public static void config02() throws FileNotFoundException, IOException {
//
//        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
//        final Configuration config = ctx.getConfiguration();
//
//        AppenderRef ref = AppenderRef.createAppenderRef("File", null, null);
//        AppenderRef[] refs = new AppenderRef[]{ref};
//        LoggerConfig loggerConfig = LoggerConfig.createLogger("false", Level.INFO, "org.apache.logging.log4j", "true", refs, null, config, null);
//        config.addLogger("simpleTestLogger", loggerConfig);
//        ctx.updateLoggers();
//        Logger l = ctx.getLogger("simpleTestLogger");
//        l.info("message of info level shoud be output properly");
//        l.error("error message");
//
//    }
//
//    public void config03() {
//        PatternLayout.Builder patternBuilder = PatternLayout.newBuilder();
//        patternBuilder.withPattern("%d %p %c{1.}: %m%n");
//        PatternLayout layout = patternBuilder.build();
//
//        ConsoleAppender consoleAppender = ConsoleAppender.createDefaultAppenderForLayout(layout);
//        consoleAppender.start();
//
//        Configuration configuration = ((LoggerContext) LogManager.getContext(false)).getConfiguration();
//
//        LoggerConfig rootLogger = configuration.getRootLogger();
//        rootLogger.setLevel(Level.INFO);
//        rootLogger.addAppender(consoleAppender, Level.INFO, null);
//    }
//
//    public void config04() {
//
//        final LoggerContext context = LoggerContext.getContext(false);
//        final Configuration config = context.getConfiguration();
//        final PatternLayout layout = PatternLayout.createDefaultLayout(config);
//
//        LoggerConfig loggerConfig = config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
//        loggerConfig.setLevel(Level.valueOf("FATAL"));
//
//        final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
//        final Appender appender = FileAppender.createAppender("target/test.log", "false", "false", "File", "true", "false", "false", "4000", layout, null, "false", null, config);
//        appender.start();
//
//    }
//
//    public static void addFileAppender() throws IOException {
//        final String tempDir = System.getProperty("java.io.tmpdir");
//        final File logFile = new File(tempDir, "meghanada_server.log");
//
//        final LoggerContext context = (LoggerContext) LogManager.getContext(false);
//
//        final Configuration configuration = context.getConfiguration();
//
//        //     final LoggerConfig loggerConfig = configuration.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
//        final FileAppender fileAppender = FileAppender.newBuilder()
//                .withName("file")
//                .withLayout(
//                        PatternLayout.newBuilder()
//                                .withPattern("[%d][%-5.-5p][%-14.-14c{1}:%4L] %-22.-22M - %m%n")
//                                .build())
//                .withFileName(logFile.getCanonicalPath())
//                .setConfiguration(configuration)
//                .build();
//
//        fileAppender.start();
//
//
//
//        configuration.addAppender(fileAppender);
//
//        //    loggerConfig.addAppender(fileAppender, Level.ERROR, null);
//        context.updateLoggers();
//
//        Logger l = context.getLogger("file");
//
//        l.error("message of info level shoud be output properly");
//        LogManager.getLogger().error("FOO MSG");
//
//    }
//
//}
