package com.backend.parcial.model;


/*  private final Logger LOGGER = Logger.getLogger(MedicamentoDaoMemoria.class);*/
public class Paciente {

    /*Acá va la clase padre, los atributos, constructores, getter setter y tostring*/

    private String name;
    private int id;


    public Paciente(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Paciente(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
