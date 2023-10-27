package com.backend.parcial;

import com.backend.parcial.dao.H2Connection;
import com.backend.parcial.dao.impl.OdontologoDAO;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {

    private static final Logger LOGGER = Logger.getLogger(OdontologoDAO.class);
    public static void main(String[] args) {

        String strCon = "jdbc:h2:~/odontologos";
        String user = "sa";
        String pass = "1234";

        try {
            Connection conn = DriverManager.getConnection(strCon,user,pass);


            LOGGER.info("Conexión exitosa");


            String insert = "INSERT INTO ODONTOLOGOS (MATRICULA, NOMBRE, APELLIDO) VALUES (001, 'PEPITO', 'PEREZ');";

            Statement st = conn.createStatement();
            int result = st.executeUpdate(insert);


            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}