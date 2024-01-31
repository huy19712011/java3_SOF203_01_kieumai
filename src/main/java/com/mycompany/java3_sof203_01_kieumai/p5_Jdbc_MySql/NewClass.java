package com.mycompany.java3_sof203_01_kieumai.p5_Jdbc_MySql;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class NewClass {

    public static void main(String[] args) {

        System.out.println("Connecting to MySQL");

        DatabaseConnectionManager_MySQL dcm = new DatabaseConnectionManager_MySQL("localhost:3306", "testdb", "root", "123456");

        try {

            Connection connection = dcm.getConnection();
            System.out.println("Connected...");
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
