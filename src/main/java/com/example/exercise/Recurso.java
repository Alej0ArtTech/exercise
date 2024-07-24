
package com.example.exercise;


public abstract class Recurso {

    private String nombre;
    private Date fechaDeCreacion;
    private String creador;

    public Recurso(String nombre, Date fechaDeCreacion, String creador) {
        this.nombre = nombre;
        this.fechaDeCreacion = fechaDeCreacion;
        this.creador = creador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public String getCreador() {
        return creador;
    }

    public abstract void mostrarDetalles();
}