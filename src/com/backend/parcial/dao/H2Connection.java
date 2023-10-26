package com.backend.parcial.dao;

public class H2Connection {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/c1clase10", "sa", "sa"); /*c1clase es el nombre de la BBDD, se cambia*/
    }

}
