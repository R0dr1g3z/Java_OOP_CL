package com.example.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main01 {
    public static void main(String[] args) {
        try(Connection connection = DButil.connect("cinemas_ex2")){
            System.out.println("Connected");
        } catch (SQLException e){
        }
    }
}
