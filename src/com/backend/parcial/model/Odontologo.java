package com.backend.parcial.model;


/*  private final Logger LOGGER = Logger.getLogger(MedicamentoDaoMemoria.class);*/
public class Odontologo {


    private int numeroMatricula;
    private String nombre;
    private String apellido;
    private int id;

    public Odontologo(int numeroMatricula, String nombre, String apellido) {
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(int numeroMatricula, String nombre, String apellido, int id) {
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
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
                "numeroMatricula=" + numeroMatricula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                '}';
    }
}

