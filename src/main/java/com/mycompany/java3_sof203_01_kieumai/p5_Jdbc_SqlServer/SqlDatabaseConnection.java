package com.mycompany.java3_sof203_01_kieumai.p5_Jdbc_SqlServer;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlDatabaseConnection {

    public static void main(String[] args) {

        String connectionUrl
                = "jdbc:sqlserver://localhost:1433;"
                + "database=test1;"
                + "user=sa;"
                + "password=123456;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";

        ResultSet result = null;

        try {
            Connection connection = DriverManager.getConnection(connectionUrl);
            Statement statement = connection.createStatement();
            System.out.println("Connected!!!");

            String sql = "SELECT * FROM sales.customers";
            result = statement.executeQuery(sql);

            while (result.next()) {
                System.out.println(result.getString(2));
            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
