//package br.com.repository.config.db;
//
//import java.util.HashMap;
//import java.util.Map;
//import javax.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import org.hibernate.cfg.AvailableSettings;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "mysqlEntityManagerFactory",
//        transactionManagerRef = "mysqlTransactionManager",
//        basePackages = "br.com.repository.**")
//@PropertySource(ignoreResourceNotFound = true, value = {"classpath:application.yml", "classpath:application.properties", "classpath:application-${spring.profiles.active}.yml"})
//public class MySQLDataSourceConfig {
//
//    private static final Logger log = LoggerFactory.getLogger(MySQLDataSourceConfig.class);
//
//    @Value("${spring.datasource.driver-class-name}")
//    private String driver;
//
//    @Value("${spring.datasource.url}")
//    private String url;
//
//    @Value("${spring.datasource.username}")
//    private String userName;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    @Value("${spring.jpa.hibernate.ddl-auto}")
//    private String ddlAuto;
//
//    @PostConstruct
//    public void init() {
//
//    }
//
//    @Primary
//    @Bean(name = "mysqlDataSource")
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(driver);
//        dataSource.setUrl(url);
//        dataSource.setUsername(userName);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
//
//    @Primary
//    @Bean(name = "mysqlEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("mysqlDataSource") DataSource dataSource) {
//
//        Map<String, String> properties = new HashMap<>();
//        properties.put(AvailableSettings.HBM2DDL_AUTO, ddlAuto);
//        properties.put(AvailableSettings.SHOW_SQL, "true");
//        properties.put(AvailableSettings.FORMAT_SQL, "true");
//        properties.put(AvailableSettings.HBM2DLL_CREATE_SCHEMAS, "true");
//        properties.put(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5InnoDBDialect");
//
//
//        //properties.put("org.hibernate.envers.track_entities_changed_in_revision", "true");
////        properties.put("org.hibernate.envers.audit_table_suffix", "_audd");
//        properties.put("org.hibernate.envers.default_schema", "hibernate_db_aud");
//
////        properties.put(AvailableSettings.DEFAULT_SCHEMA, "admin_company");
////        properties.put(AvailableSettings.HBM2DDL_DATABASE_ACTION, "drop-and-create");
////        properties.put(AvailableSettings.HBM2DDL_CREATE_SOURCE, "script");
////        properties.put(AvailableSettings.HBM2DDL_CREATE_SCRIPT_SOURCE, "C:\\Users\\alcir\\Desenvolvimento\\Projeto\\educa-facil\\repository\\src\\main\\resources\\sql\\delta\\create.sql");
//        LocalContainerEntityManagerFactoryBean build = builder.dataSource(dataSource)
//                .packages("br.com.domain")
//                .persistenceUnit("mysqlPU")
//                .properties(properties)
//                .build();
//        return build;
//    }
//
//    @Primary
//    @Bean(name = "mysqlTransactionManager")
//    public PlatformTransactionManager mysqlTransactionManager(@Qualifier("mysqlEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}
