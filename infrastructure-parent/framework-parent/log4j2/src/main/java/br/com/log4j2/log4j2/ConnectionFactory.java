package br.com.log4j2.log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionFactory {

    private static BasicDataSource dataSource;

    private ConnectionFactory() {
    }

    public static Connection getConnection() throws SQLException {
        if (dataSource == null) {
            dataSource = new BasicDataSource();
            dataSource.setUrl("jdbc:h2:mem:h2-database");
            dataSource.setDriverClassName("org.h2.Driver");
            dataSource.setUsername("sa");
            dataSource.setPassword("root");

            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            
            
            StringBuilder query = new StringBuilder();
            query.append("create table log( ");
            query.append("    LOG_ID varchar(100) primary key, ");
            query.append("    ENTRY_DATE timestamp, ");
            query.append("    LOGGER varchar(100), ");
            query.append("    LOG_LEVEL varchar(100), ");
            query.append("    MESSAGE TEXT, ");
            query.append("    EXCEPTION TEXT ");
            query.append("); ");
            
            statement.execute(query.toString());

        }
        Connection connection = dataSource.getConnection();
        return connection;
    }

}
