package com.example.exercise;


public class Cancion extends Recurso{

    private int duracion;

    public int getDuracion(){
        return duracion;
    }

    @Override
    public void mostrarDetalles(){

        System.out.println("la duración es: " +  duracion);
    }


    // 60 < 50 , 60 >=100
    public int preciocancion(int duración){
        int precio = 0;
        if (duracion <50){
            precio = 50;
        }
        if (duracion >= 50) {
            precio = 100;
        }
        return precio;
    }

    // Si es el usurio es pedro, entonces la cancion 20<50 , 40 >) 50
    public int preciocancion(int duracion, String usuario){
        int precio = 0;
        if (duracion <50 && usuario.equals("Pedro")){
            precio = 20;
        if (duracion <100 && usuario.equals("Pedro")){
            precio = 40;
        return precio;
    }
        }
    //

}