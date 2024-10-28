//package br.com.relatorio.configuracao.database;
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
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Profile;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//@Profile("dev_relatorio")
//@Configuration
//@EnableTransactionManagement
//
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "mysqlEntityManagerFactory",
//        transactionManagerRef = "mysqlTransactionManager",
//        basePackages = "br.com.relatorio.configuracao.repository")
//
//@PropertySource("classpath:application.properties")
//public class MySQLDataSourceConfig {
//
//    @Autowired
//    private Environment env;
//
//    @Value("${prodesp.driver}")
//    private String driver;
//
//    @Value("${prodesp.uri}")
//    private String uri;
//
//    @Value("${prodesp.username}")
//    private String username;
//
//    @Value("${prodesp.password}")
//    private String password;
//    
//    @PostConstruct
//    public void init(){
//        System.out.println("br.com.relatorio.configuracao.database.MySQLDataSourceConfig.init()");
//    }
//
//    @Primary
//    @Bean(name = "mysqlDataSource")
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(driver);
//        dataSource.setUrl(uri);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
//
//    @Primary
//    @Bean(name = "mysqlEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("mysqlDataSource") DataSource dataSource) {
//
//        Map<String, String> jpaProperties = new HashMap<>();
////        jpaProperties.put("hibernate.hbm2ddl.auto", "update");
//
//        LocalContainerEntityManagerFactoryBean build = builder.dataSource(dataSource)
//                .packages("br.com.relatorio")
//                .persistenceUnit("mysqlPU")
//                .properties(jpaProperties)
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
