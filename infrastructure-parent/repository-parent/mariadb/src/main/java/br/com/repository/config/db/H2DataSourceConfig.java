//package br.com.repository.config.db;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
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
//
//@Configuration
//@EnableTransactionManagement
//@EntityScan("com.example.demo.Student")
//@EnableJpaRepositories(basePackages = "br.com.repository.db.h2.repository")
//public class H2DataSourceConfig {
//
//    @Bean(name = "h2DataSource")
//    @ConfigurationProperties(prefix = "h2.datasource")
//    public HikariDataSource mysqlDataSource() {
//        return DataSourceBuilder.create().type(HikariDataSource.class).build();
//    }
//}
