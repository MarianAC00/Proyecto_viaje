package com.iesemilidarder.malcaraz.data;

import org.springframework.util.StringUtils;

public class Actividad extends Producto {

    public Actividad(String country, String titulo, String description, String tipo, String id) {
        super(country, titulo, description, tipo, id);
    }

    public Actividad() {
        super("", "","","","");
    }
}
