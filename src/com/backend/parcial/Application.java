package com.backend.parcial;

import com.backend.parcial.dao.H2Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {

    public static void main(String[] args) {

        String strCon = "jdbc:h2:~/integradora";
        String user = "sa";
        String pass = "1234";

        try {
            Connection conn = DriverManager.getConnection(strCon,user,pass);

            /*INSERTAR LOGGER INFO, CONEXION EXITOSA*/

            System.out.println("conexion exitosa");

            /*INSERTAR STATEMENT*/

            String insert = "INSERT INTO TEST (NAME, ID) VALUES ('SOFIA', 1);"; /*iNSERCIÓN PARA IDENTIFICADOR NO AUTOINCREMENTAL*/

            Statement st = conn.createStatement();
            int result = st.executeUpdate(insert);

            /*INSERTAR LOGGER INFO
            * */
            System.out.printf("Se insertaron %d filas", result);


        } catch (SQLException e) {

            /*INSERTAR LOGGER ERROR*/
            throw new RuntimeException(e);
        }


    }


}