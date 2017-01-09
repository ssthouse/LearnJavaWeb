package com.ssthouse.main;

import java.sql.*;

/**
 * Created by ssthouse on 08/01/2017.
 */
public class TestMain {

    public static void main(String[] args) {
        String mysqlURL = "jdbc:mysql://localhost/ssthouse";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库连接
            Connection connection = DriverManager.getConnection(mysqlURL, "root", "ssthouse");
            Statement statement = connection.createStatement();
            String sqlStr = "SELECT * FROM books";
            ResultSet resultSet = statement.executeQuery(sqlStr);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("author"));
                System.out.println(resultSet.getString("id"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
