package com.backend.parcial.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Connection {


    public static Connection getConnection() throws ClassNotFoundException, SQLException {
//        Class.forName("org.h2.Driver");

        String strConn = "jdbc:h2:~/integradora";
        String user = "sa";
        String password = "1234";

        return DriverManager.getConnection(strConn,user,password);
    }




//catch (Exception e) {
//        LOGGER.error(e.getMessage());
//        e.printStackTrace();
//        if (connection != null) {
//            try {
//                connection.rollback();
//                LOGGER.info("Tuvimos un problema");
//                LOGGER.error(e.getMessage());
//                e.printStackTrace();
//            } catch (SQLException exception) {
//                LOGGER.error(exception.getMessage());
//                exception.printStackTrace();
//            }
//        }
//    } finally {
//        try {
//            connection.close();
//        } catch (Exception ex) {
//            LOGGER.error("No se pudo cerrar la conexion: " + ex.getMessage());
//        }
//    }

}
