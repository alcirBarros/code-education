//package br.com.context.repository.oracle.configuration;
//
//import com.amazonaws.secretsmanager.caching.SecretCache;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.sql.*;
//import java.util.Enumeration;
//import java.util.Properties;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class AWSSecretsManagerOracleDriver implements Driver {
//
//    private ObjectMapper mapper = new ObjectMapper();
//
//    private String realDriverClass = "oracle.jdbc.OracleDriver";
//
//    {
//        try {
//            DriverManager.registerDriver(this);
//        } catch (SQLException var6) {
//            Logger.getLogger("oracle.jdbc.driver").log(Level.SEVERE, "SQLException in static block.", var6);
//        } catch (RuntimeException var7) {
//            Logger.getLogger("oracle.jdbc.driver").log(Level.SEVERE, "RuntimeException in static block.", var7);
//        }
//    }
//
//    public Driver getWrappedDriver() {
//        Enumeration<Driver> availableDrivers = DriverManager.getDrivers();
//        while (availableDrivers.hasMoreElements()) {
//            Driver driver = availableDrivers.nextElement();
//            if (driver.getClass().getName().equals(this.realDriverClass)) {
//                return driver;
//            }
//        }
//        throw new IllegalStateException("No Driver has been registered with name, " + this.realDriverClass);
//    }
//
//    private Properties secretProperties(String credentialsSecretId, Properties properties) throws SQLException {
//        try {
//            String secretString = new SecretCache().getSecretString(credentialsSecretId);
//            JsonNode jsonObject = mapper.readTree(secretString);
//            properties.setProperty("user", jsonObject.get("username").asText());
//            properties.setProperty("password", jsonObject.get("password").asText());
//            properties.setProperty("host", jsonObject.get("host").asText());
//            properties.setProperty("port", jsonObject.get("port").asText());
//            properties.setProperty("dbname", jsonObject.get("dbname").asText());
//            return properties;
//        } catch (Exception e) {
//            throw new SQLException();
//        }
//    }
//
//    public String urlSecretManager(Properties properties) {
//        String host = properties.getProperty("host");
//        String port = properties.getProperty("port");
//        String dbname = properties.getProperty("dbname");
//        return "jdbc:oracle:thin:@//" + host + ":" + port + "/" + dbname;
//    }
//
//    @Override
//    public Connection connect(String urlSecretId, Properties info) throws SQLException {
//        Properties properties = this.secretProperties(urlSecretId, info);
//        String urlSecretManager = urlSecretManager(properties);
//        return getWrappedDriver().connect(urlSecretManager, properties);
//    }
//
//    @Override
//    public boolean acceptsURL(String url) {
//        return true;
//    }
//
//    @Override
//    public DriverPropertyInfo[] getPropertyInfo(String s, Properties properties) throws SQLException {
//        return getWrappedDriver().getPropertyInfo(s, properties);
//    }
//
//    @Override
//    public int getMajorVersion() {
//        return getWrappedDriver().getMajorVersion();
//    }
//
//    @Override
//    public int getMinorVersion() {
//        return getWrappedDriver().getMinorVersion();
//    }
//
//    @Override
//    public boolean jdbcCompliant() {
//        return getWrappedDriver().jdbcCompliant();
//    }
//
//    @Override
//    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
//        return getWrappedDriver().getParentLogger();
//    }
//
//}
