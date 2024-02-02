package com.mycompany.java3_sof203_01_kieumai.p9_assignment.dao;

import com.mycompany.java3_sof203_01_kieumai.p5_Jdbc_SqlServer.DatabaseConnectionManager_SQLServer;
import com.mycompany.java3_sof203_01_kieumai.p9_assignment.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    // CRUD methods
    public List<User> getAllUsers() throws SQLException {

        List<User> users = new ArrayList<>();

        DatabaseConnectionManager_SQLServer dcm
                = new DatabaseConnectionManager_SQLServer("test", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();
            System.out.println("Connected...");

            String sql
                    = """
                        SELECT * FROM users;
                    """;

            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                // read data to User object
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setPhone(resultSet.getString("phone"));
                user.setEmail(resultSet.getString("email"));

                users.add(user);
            }

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

        return users;
    }



}
