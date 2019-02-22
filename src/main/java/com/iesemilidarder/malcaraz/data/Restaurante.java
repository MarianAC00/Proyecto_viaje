package com.iesemilidarder.malcaraz.data;

public class Restaurante extends Producto {
    public Restaurante(String country, String titulo, String descripcion,String tipo,String id)
    {
        super (country, titulo,descripcion,tipo,id);
    }
    public Restaurante() {
        super("", "","","","");
    }
}
