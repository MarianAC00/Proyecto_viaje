package com.iesemilidarder.malcaraz.data;

public class Evento extends Producto {
    public Evento(String country, String titulo, String description, String tipo, String id) {
        super(country, titulo, description, tipo, id);
    }

    public Evento() {
        super("", "", "", "", "");
        ;
    }
}