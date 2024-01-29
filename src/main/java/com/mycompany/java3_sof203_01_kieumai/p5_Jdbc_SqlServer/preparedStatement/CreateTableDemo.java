package com.mycompany.java3_sof203_01_kieumai.p5_Jdbc_SqlServer.preparedStatement;

import com.mycompany.java3_sof203_01_kieumai.p5_Jdbc_SqlServer.DatabaseConnectionManager_SQLServer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class CreateTableDemo {

    public static void main(String[] args) throws SQLException {
        DatabaseConnectionManager_SQLServer dcm
                = new DatabaseConnectionManager_SQLServer("test", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();
            System.out.println("Connected...");
            // code here ...
            // B1: sql
            String sql
                    = """
                        CREATE TABLE employee2(
                           Id INT NOT NULL,
                           Name NVARCHAR(50) NOT NULL,
                           Salary DECIMAL NOT NULL,
                           PRIMARY KEY (Id)
                        );
                    """;
            // B2: run
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();


            System.out.println("done...");

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

}
