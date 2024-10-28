package br.com.context.config;

import br.com.context.config.DataSourceTwo.JdbcRepositoryFactoryBeanDb2;
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
    repositoryFactoryBeanClass = JdbcRepositoryFactoryBeanDb2.class,
    transactionManagerRef = "transactionManagerDb2",
    basePackages = "br.com.context.repository.two")
@EnableAutoConfiguration(
    exclude = {DataSourceAutoConfiguration.class, JdbcRepositoriesAutoConfiguration.class}
)
public class DataSourceTwo {

  private final AbstractJdbcConfiguration base;

  public DataSourceTwo(ApplicationContext applicationContext) {
    this.base = new AbstractJdbcConfiguration();
    this.base.setApplicationContext(applicationContext);
  }

  @Bean("hikariDataSourceDb2")
  @ConfigurationProperties(prefix = "spring.datasources.two")
  public HikariDataSource dataSourceDb2() {
    return DataSourceBuilder.create().type(HikariDataSource.class).build();
  }

  @Bean("namedParameterJdbcOperationsDb2")
  public NamedParameterJdbcOperations jdbcOperationsDb2(@Qualifier("hikariDataSourceDb2") DataSource dataSource) {
    return new NamedParameterJdbcTemplate(dataSource);
  }

  @Bean("platformTransactionManagerDb2")
  public PlatformTransactionManager transactionManagerDb2( @Qualifier("hikariDataSourceDb2") final DataSource dataSource) {
    return new JdbcTransactionManager(dataSource);
  }

  @Bean("relationalManagedTypesDb2")
  public RelationalManagedTypes jdbcManagedTypesDb2() throws ClassNotFoundException {
    return base.jdbcManagedTypes();
  }

  @Bean("jdbcMappingContextDb2")
  public JdbcMappingContext jdbcMappingContextDb2(Optional<NamingStrategy> namingStrategy, @Qualifier("jdbcCustomConversionsDb2") JdbcCustomConversions customConversions, @Qualifier("db2") RelationalManagedTypes jdbcManagedTypes) {
    return base.jdbcMappingContext(namingStrategy, customConversions, jdbcManagedTypes);
  }

  @Bean("jdbcConverterDb2")
  public JdbcConverter jdbcConverterDb2(
      @Qualifier("jdbcMappingContextDb2") JdbcMappingContext mappingContext,
      @Qualifier("namedParameterJdbcOperationsDb2") NamedParameterJdbcOperations operations,
      @Qualifier("relationResolverDb2") @Lazy RelationResolver relationResolver,
      @Qualifier("jdbcCustomConversionsDb2") JdbcCustomConversions conversions,
      @Qualifier("dialectDb2") Dialect dialect) {
    return base.jdbcConverter(mappingContext, operations, relationResolver, conversions, dialect);
  }

  @Bean("jdbcCustomConversionsDb2")
  public JdbcCustomConversions jdbcCustomConversionsDb2() {
    return base.jdbcCustomConversions();
  }

  @Bean("jdbcAggregateTemplateDb2")
  public JdbcAggregateTemplate jdbcAggregateTemplateDb2(
      ApplicationContext applicationContext,
      @Qualifier("jdbcMappingContextDb2") JdbcMappingContext mappingContext,
      @Qualifier("jdbcMappingContextDb2") JdbcConverter converter,
      @Qualifier("dataAccessStrategyDb2") DataAccessStrategy dataAccessStrategy) {
    return base.jdbcAggregateTemplate(applicationContext, mappingContext, converter, dataAccessStrategy);
  }

  @Bean("dataAccessStrategyDb2")
  public DataAccessStrategy dataAccessStrategyDb2(
      @Qualifier("namedParameterJdbcOperationsDb2") NamedParameterJdbcOperations operations,
      @Qualifier("jdbcConverterDb2") JdbcConverter jdbcConverter,
      @Qualifier("jdbcMappingContextDb2") JdbcMappingContext context,
      @Qualifier("dialectDb2") Dialect dialect) {
    return base.dataAccessStrategyBean(operations, jdbcConverter, context, dialect);
  }

  @Bean("dialectDb2")
  public Dialect jdbcDialectDb2(@Qualifier("namedParameterJdbcOperationsDb2") NamedParameterJdbcOperations operations) {
    return base.jdbcDialect(operations);
  }

  public static class JdbcRepositoryFactoryBeanDb2<T extends Repository<S, ID>, S, ID extends Serializable> extends
      JdbcRepositoryFactoryBean<T, S, ID> {

    public JdbcRepositoryFactoryBeanDb2(Class<T> repositoryInterface) {
      super(repositoryInterface);
    }

    @Override
    @Autowired
    public void setJdbcOperations(@Qualifier("namedParameterJdbcOperationsDb2") NamedParameterJdbcOperations operations) {
      super.setJdbcOperations(operations);
    }

    @Override
    @Autowired
    public void setDataAccessStrategy(@Qualifier("dataAccessStrategyDb2") DataAccessStrategy dataAccessStrategy) {
      super.setDataAccessStrategy(dataAccessStrategy);
    }

    @Override
    @Autowired
    public void setMappingContext(@Qualifier("relationalMappingContextDb2") RelationalMappingContext mappingContext) {
      super.setMappingContext(mappingContext);
    }

    @Override
    @Autowired
    public void setDialect(@Qualifier("dialectDb2") Dialect dialect) {
      super.setDialect(dialect);
    }

    @Override
    @Autowired
    public void setConverter(@Qualifier("jdbcConverterDb2") JdbcConverter converter) {
      super.setConverter(converter);
    }
  }
}
