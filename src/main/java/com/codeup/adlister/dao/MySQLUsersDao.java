package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.PreparedStatement;
import java.sql.*;

public class MySQLUsersDao implements Users{
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        try {
            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(
                    "SELECT * FROM ymir_joe.adlister_users au WHERE au.user_name = ?");
            stmt.setString(1, username);
            stmt.executeQuery();
            ResultSet rs = stmt.getResultSet();
            rs.next();
            User user = new User(rs.getLong("user_id"), rs.getString("user_name"), rs.getString("email"), rs.getString("password"));
            return user;
        } catch (SQLException e) {
            throw new RuntimeException("Error searching for a user.", e);
        }
    }

    @Override
    public Long insert(User user) {
        try {
            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(
                    "INSERT INTO ymir_joe.adlister_users(user_name, password, email) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());
            stmt.executeUpdate();
            ResultSet generatedIdResultSet = stmt.getGeneratedKeys();
            generatedIdResultSet.next();
            return generatedIdResultSet.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error registering new user.", e);
        }
    }
}
