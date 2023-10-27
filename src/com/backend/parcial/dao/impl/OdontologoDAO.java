package com.backend.parcial.dao.impl;

import java.sql.*;

import com.backend.parcial.dao.H2Connection;
import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAO implements IDao<Odontologo> {

    private final Logger LOGGER = Logger.getLogger(OdontologoDAO.class);

    @Override
    public Odontologo registrar(Odontologo odontologo) {

        Connection connection = null;
        Odontologo odontologoRegistrado = null;
        try {
            connection = H2Connection.getConnection();
            connection.setAutoCommit(false);

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO ODONTOLOGOS (MATRICULA, NOMBRE, APELLIDO) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, odontologo.getMatricula());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getApellido());

            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            while (resultSet.next()) {
                odontologoRegistrado = new Odontologo(resultSet.getInt(1), odontologo.getMatricula(), odontologo.getNombre(), odontologo.getApellido());

            }

            LOGGER.info("Odontologo Guardado: " + odontologoRegistrado);

            connection.commit();

        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            if (connection != null) {
                try {
                    connection.rollback();
                    LOGGER.info("Tuvimos un problema");
                    LOGGER.error(e.getMessage());
                    e.printStackTrace();
                } catch (SQLException exception) {
                    LOGGER.error(exception.getMessage());
                    exception.printStackTrace();
                }
            }
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                LOGGER.error("No se puede cerrar la conexion: " + ex.getMessage());
            }
        }

        return odontologoRegistrado;
    }

    @Override
    public List<Odontologo> listarTodos() {

        Connection connection = null;
        List<Odontologo> odontologos = new ArrayList<>();


        try {

            connection = H2Connection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT MATRICULA, NOMBRE, APELLIDO, ID FROM ODONTOLOGOS");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                int matricula = resultSet.getInt(1);
                String nombre = resultSet.getString(2);
                String apellido = resultSet.getString(3);
                int id = resultSet.getInt(4);

                Odontologo od = new Odontologo(matricula, nombre, apellido, id);

                odontologos.add(od);


            }

            LOGGER.info("Listado de todos los odontologos: " + odontologos);

        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                LOGGER.error("Ha ocurrido un error al intentar cerrar la conexión de la base de datos. " + ex.getMessage());
                ex.printStackTrace();
            }
        }


            return odontologos;
        }

    }


