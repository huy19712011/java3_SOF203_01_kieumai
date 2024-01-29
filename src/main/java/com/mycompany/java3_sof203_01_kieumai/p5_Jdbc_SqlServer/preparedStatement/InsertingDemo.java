package com.mycompany.java3_sof203_01_kieumai.p5_Jdbc_SqlServer.preparedStatement;

import com.mycompany.java3_sof203_01_kieumai.p5_Jdbc_SqlServer.DatabaseConnectionManager_SQLServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertingDemo {

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
                        INSERT INTO employee2(Id, Name, Salary)
                        VALUES(?, ?, ?);
                    """;
            // B2: run
            preparedStatement = connection.prepareStatement(sql);

            // set values for ?, ?, ?
            preparedStatement.setInt(1, 1001);
            preparedStatement.setString(2, "Mike");
            preparedStatement.setDouble(3, 50000);

            preparedStatement.executeUpdate();

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
