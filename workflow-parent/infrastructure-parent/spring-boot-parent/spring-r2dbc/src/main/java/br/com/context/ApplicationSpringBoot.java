package br.com.context;

//import br.com.context.model.Employee;
//import br.com.context.repository.EmployeeReactiveCrudRepository;
//import io.r2dbc.spi.ConnectionFactory;

import io.r2dbc.spi.ConnectionFactory;
import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.r2dbc.connection.init.CompositeDatabasePopulator;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.r2dbc.connection.init.CompositeDatabasePopulator;
//import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
//import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
//import reactor.core.publisher.Flux;

@SpringBootApplication
public class ApplicationSpringBoot
    //   implements CommandLineRunner
{

  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("org.postgresql.Driver");
    dataSource.setUrl("jdbc:postgresql://localhost:5432/bm_br_payroll_esocial_records");
    dataSource.setUsername("postgres");
    dataSource.setPassword("postgres");
    return dataSource;
  }

//    @Autowired
//    private EmployeeReactiveCrudRepository employeeRepository;

    @Bean
    ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {
      ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
      initializer.setConnectionFactory(connectionFactory);

      CompositeDatabasePopulator compositeDatabasePopulator = new CompositeDatabasePopulator();
      compositeDatabasePopulator.addPopulators(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));
      compositeDatabasePopulator.addPopulators(new ResourceDatabasePopulator(new ClassPathResource("data.sql")));
      initializer.setDatabasePopulator(compositeDatabasePopulator);
      return initializer;
    }

  //  @Override
  //  public void run(String... args) throws Exception {
  //    Flux<String> flux = Flux.just("Spring Boot", "Deploy", "Java");
  //    Flux<Employee> fluxMap = flux.map(nome ->  Employee.builder().name(nome).build());
  //    fluxMap.flatMap(employeeRepository::save).subscribe(System.out::println);
  //  }

  public static void main(String[] args) {
    SpringApplication.run(ApplicationSpringBoot.class, args);
  }
}
