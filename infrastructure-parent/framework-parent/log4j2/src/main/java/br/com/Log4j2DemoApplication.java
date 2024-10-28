package br.com;

//import br.com.h2.domain.Log;
//import br.com.h2.repository.AppLogsRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2DemoApplication implements ApplicationRunner {

    private static final Logger logger = LogManager.getLogger(Log4j2DemoApplication.class.getName());

//    @Autowired
//    private AppLogsRepository appLogsRepository;

    public static void main(String[] args) {
        System.setProperty("mail.smtp.starttls.enable", "true");
        SpringApplication.run(Log4j2DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

//        System.getProperties().forEach((Object key, Object value)
//                -> System.out.println(key + ": " + value)
//        );

        String pid = System.getProperty("PID");
        String timeZone = System.getProperty("user.timezone");
        String tempDir = System.getProperty("java.io.tmpdir");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String language = System.getProperty("user.language");
        String country = System.getProperty("user.country");
        String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");

        logger.info(" \n------------------------------------------------------------------------\n\t"
                + "PID: '{}' \n\t"
                + "Time zone: '{}' \n\t"
                + "Tmp dir(s): '{}' \n\t"
                + "User name: '{}' \n\t"
                + "User home: '{}' \n\t"
                + "User language: '{}' \n\t"
                + "User country: '{}' \n\t"
                + "Os Name: '{}' \n\t"
                + "Os Arch: '{}' "
                + "\n------------------------------------------------------------------------",
                pid,
                timeZone,
                tempDir,
                userName,
                userHome,
                language,
                country,
                osName,
                osArch);

        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
//        List<Log> findAll = appLogsRepository.findAll();
//        System.out.println(findAll);

    }
}

//OFF
//FATAL
//ERROR
//WARN
//INFO
//DEBUG
//TRACE
//ALL
