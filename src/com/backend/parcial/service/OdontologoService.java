package com.backend.parcial.service;

import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Odontologo;

import java.util.ArrayList;

public class OdontologoService {

    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    };

    public Odontologo registrarOdontologo(Odontologo odontologo) {
        return odontologoIDao.registrar(odontologo);
    };

    public ArrayList<Odontologo> listarOdontologo() {
        return (ArrayList<Odontologo>) odontologoIDao.listarTodos();

    };

};

