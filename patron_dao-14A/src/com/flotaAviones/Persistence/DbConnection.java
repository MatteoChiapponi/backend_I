package com.flotaAviones.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection(){
        String url = "jdbc:mysql://127.0.0.1:3306/circulos?";
        String user = "root";
        String pass = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
