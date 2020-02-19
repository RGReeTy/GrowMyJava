package com.grow_my_java.differrent_tests.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/library_jd2_les01?useSSL=false", "root", "123456");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM users");

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3));
        }

        rs.close();
        st.close();
        con.close();

    }
}
