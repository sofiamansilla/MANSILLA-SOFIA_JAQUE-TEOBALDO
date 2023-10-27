package com.backend.parcial.test.Odontologo;

import com.backend.parcial.dao.impl.OdontologoDAO;
import com.backend.parcial.model.Odontologo;
import com.backend.parcial.service.OdontologoService;

public class test {


import com.backend.parcial.dao.impl.OdontologoDAO;
import com.backend.parcial.model.Odontologo;
import com.backend.parcial.service.OdontologoService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

    class OdontologoServiceTest {


        private OdontologoService odontologoService;

        @BeforeAll
        static void doBefore() {
            Connection connection = null;
            try {
                Class.forName("org.h2.Driver");
                connection = DriverManager.getConnection("jdbc:h2:~/odontologos;INIT=RUNSCRIPT FROM 'strCon'", "user", "password");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }

        @Test
        void deberiaRegistrarYListarOdontologosenH2() {
            OdontologoService = new OdontologoService(new OdontologoDAO());
            Odontologo OdontologoARegistrar = new Odontologo(35465, "Teo", "Jaque");

            Odontologo odontologoRegistrado = OdontologoService.odontologos(OdontologoARegistrar);

            assertNotNull(odontologoRegistrado.getId());

        }




    }

}
