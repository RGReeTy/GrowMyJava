package com.grow_my_java.differrent_test.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample_01 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.gjt.mm.mysql.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/library_jd2_les01?useSSL=false", "root", "123456");

        String sql = "INSERT INTO users(name,surname) VALUES(?,?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "ььь");
        ps.setString(2, "щщщ");

        ps.executeUpdate();


        // close
    }

}
