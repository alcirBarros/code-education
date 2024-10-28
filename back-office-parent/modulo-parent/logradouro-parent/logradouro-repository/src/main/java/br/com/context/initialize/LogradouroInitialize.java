package br.com.context.initialize;

import br.com.context.annotation.CreateDrop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@CreateDrop
@Configuration
public class LogradouroInitialize {

    @Value("classpath:tbl_cep_202002_n_mysql/03_INSERT/*.sql")
    private Resource[] insertDataBase;

    @PostConstruct
    private void init() {

    }

    @Autowired
    public void config(DataSource dataSource) {
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.setSqlScriptEncoding("UTF-8");
        populator.addScripts(insertDataBase);
        DatabasePopulatorUtils.execute(populator, dataSource);
    }
}
