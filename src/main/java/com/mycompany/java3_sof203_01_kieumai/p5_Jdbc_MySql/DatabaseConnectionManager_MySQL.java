package com.mycompany.java3_sof203_01_kieumai.p5_Jdbc_MySql;

import java.sql.*;
import java.util.Properties;

public class DatabaseConnectionManager_MySQL {

    private final String url;
    private final Properties properties;

    public DatabaseConnectionManager_MySQL(String host, String databaseName, String username, String password) {
        this.url = "jdbc:mysql://" + host + "/" + databaseName;

        this.properties = new Properties();
        properties.setProperty("user", username);
        properties.setProperty("password", password);
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }

}
