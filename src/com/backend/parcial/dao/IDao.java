package com.backend.parcial.dao;

public interface IDao<T> {

    /*TODOS LOS METODOS QUE DEBO HACER, DE ACCESO A DATOS*/

    T findById(int id);
    T create(T t);
//    int update(T t);
//    int delete(T t);

}
