package com.iesemilidarder.malcaraz.data;

public class Hotel extends Producto {
    public Hotel(String country, String titulo, String description, String tipo, String id) {
        super(country, titulo, description, tipo, id);
    }

    public Hotel() {
        super("", "", "", "", "");
        ;
    }

}
