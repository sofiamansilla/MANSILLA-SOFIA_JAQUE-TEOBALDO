package com.backend.parcial.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Connection {


    public static Connection getConnection() throws ClassNotFoundException, SQLException {
//        Class.forName("org.h2.Driver");

        String strConn = "jdbc:h2:~/odontologos";
        String user = "sa";
        String password = "1234";

        return DriverManager.getConnection(strConn,user,password);
    }




}
