package br.com.context.config;

import br.com.context.config.DataSourceOne.JdbcRepositoryFactoryBeanDb1;
import com.zaxxer.hikari.HikariDataSource;
import java.io.Serializable;
import java.util.Optional;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
import org.springframework.data.jdbc.core.convert.DataAccessStrategy;
import org.springframework.data.jdbc.core.convert.JdbcConverter;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.core.convert.RelationResolver;
import org.springframework.data.jdbc.core.mapping.JdbcMappingContext;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.support.JdbcRepositoryFactoryBean;
import org.springframework.data.relational.RelationalManagedTypes;
import org.springframework.data.relational.core.dialect.Dialect;
import org.springframework.data.relational.core.mapping.NamingStrategy;
import org.springframework.data.relational.core.mapping.RelationalMappingContext;
import org.springframework.data.repository.Repository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
@Configuration
@EnableJdbcRepositories(
    repositoryFactoryBeanClass = JdbcRepositoryFactoryBeanDb1.class,
    transactionManagerRef = "transactionManagerDb1",
    basePackages = "br.com.context.repository.one"
)
@EnableAutoConfiguration(
    exclude = {DataSourceAutoConfiguration.class, JdbcRepositoriesAutoConfiguration.class}
)
public class DataSourceOne {

  private final AbstractJdbcConfiguration base;

  public DataSourceOne(ApplicationContext applicationContext) {
    this.base = new AbstractJdbcConfiguration();
    this.base.setApplicationContext(applicationContext);
  }

  @Bean("hikariDataSourceDb1")
  @ConfigurationProperties(prefix = "spring.datasources.one")
  public HikariDataSource dataSourceDb1() {
    return DataSourceBuilder.create().type(HikariDataSource.class).build();
  }

  @Bean("namedParameterJdbcOperationsDb1")
  public NamedParameterJdbcOperations jdbcOperationsDb1(@Qualifier("hikariDataSourceDb1") DataSource dataSource) {
    return new NamedParameterJdbcTemplate(dataSource);
  }

  @Bean("platformTransactionManagerDb1")
  public PlatformTransactionManager transactionManagerDb1( @Qualifier("hikariDataSourceDb1") final DataSource dataSource) {
    return new JdbcTransactionManager(dataSource);
  }

  @Bean("relationalManagedTypesDb1")
  public RelationalManagedTypes jdbcManagedTypesDb1() throws ClassNotFoundException {
    return base.jdbcManagedTypes();
  }

  @Bean("jdbcMappingContextDb1")
  public JdbcMappingContext jdbcMappingContextDb1(Optional<NamingStrategy> namingStrategy, @Qualifier("jdbcCustomConversionsDb1") JdbcCustomConversions customConversions, @Qualifier("relationalManagedTypesDb1") RelationalManagedTypes jdbcManagedTypes) {
    return base.jdbcMappingContext(namingStrategy, customConversions, jdbcManagedTypes);
  }

  @Bean("jdbcConverterDb1")
  public JdbcConverter jdbcConverterDb1(
      @Qualifier("jdbcMappingContextDb1") JdbcMappingContext mappingContext,
      @Qualifier("namedParameterJdbcOperationsDb1") NamedParameterJdbcOperations operations,
      @Qualifier("relationResolverDb1") @Lazy RelationResolver relationResolver,
      @Qualifier("jdbcCustomConversionsDb1") JdbcCustomConversions conversions,
      @Qualifier("dialectDb1") Dialect dialect) {
    return base.jdbcConverter(mappingContext, operations, relationResolver, conversions, dialect);
  }

  @Bean("jdbcCustomConversionsDb1")
  public JdbcCustomConversions jdbcCustomConversionsDb1() {
    return base.jdbcCustomConversions();
  }

  @Bean("jdbcAggregateTemplateDb1")
  public JdbcAggregateTemplate jdbcAggregateTemplateDb1(
      ApplicationContext applicationContext,
      @Qualifier("jdbcMappingContextDb1") JdbcMappingContext mappingContext,
      @Qualifier("jdbcMappingContextDb1") JdbcConverter converter,
      @Qualifier("dataAccessStrategyDb1") DataAccessStrategy dataAccessStrategy) {
    return base.jdbcAggregateTemplate(applicationContext, mappingContext, converter, dataAccessStrategy);
  }

  @Bean("dataAccessStrategyDb1")
  public DataAccessStrategy dataAccessStrategyDb1(
      @Qualifier("namedParameterJdbcOperationsDb1") NamedParameterJdbcOperations operations,
      @Qualifier("jdbcConverterDb1") JdbcConverter jdbcConverter,
      @Qualifier("jdbcMappingContextDb1") JdbcMappingContext context,
      @Qualifier("dialectDb1") Dialect dialect) {
    return base.dataAccessStrategyBean(operations, jdbcConverter, context, dialect);
  }

  @Bean("dialectDb1")
  public Dialect jdbcDialectDb2(@Qualifier("namedParameterJdbcOperationsDb1") NamedParameterJdbcOperations operations) {
    return base.jdbcDialect(operations);
  }

  public static class JdbcRepositoryFactoryBeanDb1<T extends Repository<S, ID>, S, ID extends Serializable> extends JdbcRepositoryFactoryBean<T, S, ID> {

    public JdbcRepositoryFactoryBeanDb1(Class<T> repositoryInterface) {
      super(repositoryInterface);
    }

    @Override
    @Autowired
    public void setJdbcOperations(@Qualifier("namedParameterJdbcOperationsDb1") NamedParameterJdbcOperations operations) {
      super.setJdbcOperations(operations);
    }

    @Override
    @Autowired
    public void setDataAccessStrategy(@Qualifier("dataAccessStrategyDb1") DataAccessStrategy dataAccessStrategy) {
      super.setDataAccessStrategy(dataAccessStrategy);
    }

    @Override
    @Autowired
    public void setMappingContext(@Qualifier("relationalMappingContextDb1") RelationalMappingContext mappingContext) {
      super.setMappingContext(mappingContext);
    }

    @Override
    @Autowired
    public void setDialect(@Qualifier("dialectDb1") Dialect dialect) {
      super.setDialect(dialect);
    }

    @Override
    @Autowired
    public void setConverter(@Qualifier("jdbcConverterDb1") JdbcConverter converter) {
      super.setConverter(converter);
    }
  }

}
