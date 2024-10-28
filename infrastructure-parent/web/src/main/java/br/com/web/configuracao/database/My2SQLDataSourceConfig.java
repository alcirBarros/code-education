//package br.com.web.configuracao.database;
//
//import java.util.HashMap;
//import java.util.Map;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Profile;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "mysqlEntityManagerFFactory",
//        transactionManagerRef = "mysqlTransactionMManager",
//        basePackages = "br.com.web")
//@PropertySource("classpath:application-web.properties")
//public class My2SQLDataSourceConfig {
//
//    @Autowired
//    private Environment env;
//
////    @Primary
//    @Bean(name = "my2sqlDataSource")
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getProperty("db.driver"));
//        dataSource.setUrl(env.getProperty("db.url"));
//        dataSource.setUsername(env.getProperty("db.username"));
//        dataSource.setPassword(env.getProperty("db.password"));
//        return dataSource;
//    }
//
////    @Primary
//    @Bean(name = "mysqlEntityManagerFFactory")
//    public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFFactory(EntityManagerFactoryBuilder builder, @Qualifier("my2sqlDataSource") DataSource dataSource) {
//
//        Map<String, String> jpaProperties = new HashMap<>();
//        jpaProperties.put("hibernate.hbm2ddl.auto", "update");
//        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
//
//        LocalContainerEntityManagerFactoryBean build = builder.dataSource(dataSource)
//                .packages("br.com.web")
//                .persistenceUnit("my2sqlPU")
//                .properties(jpaProperties)
//                .build();
//        return build;
//    }
//
////    @Primary
//    @Bean(name = "mysqlTransactionMManager")
//    public PlatformTransactionManager mysqlTransactionMManager(@Qualifier("mysqlEntityManagerFFactory") EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }  
//
//    @Profile("prod")
//    @Configuration
//    static class ProdConfig {
//
//        @Bean
//        void employeeFinder() {
//            System.out.println("Config");
//        }
//    }
//
//}
