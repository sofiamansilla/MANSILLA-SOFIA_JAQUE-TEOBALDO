package com.backend.parcial.model;


/*  private final Logger LOGGER = Logger.getLogger(MedicamentoDaoMemoria.class);*/
public class Odontologo {


    private int matricula;
    private String nombre;
    private String apellido;
    private int id;

    public Odontologo(int matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(int matricula, String nombre, String apellido, int id) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public Odontologo(int anInt, int matricula, String nombre, String apellido) {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Odontologo{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                '}';
    }
}

