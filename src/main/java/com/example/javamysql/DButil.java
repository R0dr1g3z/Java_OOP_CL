package com.example.javamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
    public static String DB_URL = "jdbc:mysql://127.0.0.1:3306";
    public static String DB_USER = "root";
    public static String DB_PASS = "root123";

    public static Connection connect(String database) throws SQLException {
        String connStr = String.format("%s/%s?useSSL=false&characterSet=utf8mb4&serverTimezone=UTC", DB_URL, database);
        Connection connection = DriverManager.getConnection(connStr, DB_USER, DB_PASS);
        return connection;
    }
}
