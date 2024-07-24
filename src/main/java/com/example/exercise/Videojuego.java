package com.example.exercise;


public class Videojuego extends Recurso {

    private String plataforma;
    

    @Override
    public void mostrarDetalles(){

        System.out.println("la plataforma es: " +  plataforma);
    }

}
