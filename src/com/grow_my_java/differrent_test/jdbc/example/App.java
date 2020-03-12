package com.grow_my_java.differrent_test.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String user = "root";
        String password = "0000";
        String url = "jdbc:mysql://127.0.0.1/bustravelagency?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, password);

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
