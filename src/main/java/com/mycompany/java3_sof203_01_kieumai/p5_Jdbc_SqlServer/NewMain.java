package com.mycompany.java3_sof203_01_kieumai.p5_Jdbc_SqlServer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewMain {

    public static void main(String[] args) throws SQLException {
        DatabaseConnectionManager_SQLServer dcm
                = new DatabaseConnectionManager_SQLServer("test1", "sa", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();
            System.out.println("Connected...");
            // code here ...

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

    }

}
