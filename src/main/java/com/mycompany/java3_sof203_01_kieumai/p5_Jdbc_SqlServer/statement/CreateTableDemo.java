package com.mycompany.java3_sof203_01_kieumai.p5_Jdbc_SqlServer.statement;

import com.mycompany.java3_sof203_01_kieumai.p5_Jdbc_SqlServer.DatabaseConnectionManager_SQLServer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

    public static void main(String[] args) throws SQLException {
                DatabaseConnectionManager_SQLServer dcm
                = new DatabaseConnectionManager_SQLServer("test", "sa", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();
            System.out.println("Connected...");
            // code here ...
            // B1: sql
            String sql =
                    """
                        CREATE TABLE employee(
                           Id INT NOT NULL,
                           Name NVARCHAR(50) NOT NULL,
                           Salary DECIMAL NOT NULL,
                           PRIMARY KEY (Id)
                        );
                    """;
            // B2: run
            statement = connection.createStatement();
            statement.execute(sql);

            System.out.println("done...");

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
