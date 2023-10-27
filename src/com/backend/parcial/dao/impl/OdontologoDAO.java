package com.backend.parcial.dao.impl;


import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDAO implements IDao<Odontologo> {

    private final Logger LOGGER = Logger.getLogger(OdontologoDAO.class);
    @Override
    public Odontologo findById(int id) {



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





        return null;
    }

    @Override
    public Odontologo create(Odontologo odontologo) {
        return null;
    }

    @Override
    public Odontologo registrar(Odontologo odontologo) {
        return null;
    }

    @Override
    public List<Odontologo> listarTodos() {
        return null;
    }
};