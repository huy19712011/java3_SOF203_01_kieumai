package com.mycompany.java3_sof203_01_kieumai.p9_assignment.service;

import com.mycompany.java3_sof203_01_kieumai.p9_assignment.dao.UserDao;
import com.mycompany.java3_sof203_01_kieumai.p9_assignment.model.User;
import java.sql.SQLException;
import java.util.List;

public class UserService {

    private UserDao userDao;

    public UserService() {

        userDao = new UserDao();
    }

    public List<User> getAllUsers() throws SQLException {

        return userDao.getAllUsers();
    }
}
