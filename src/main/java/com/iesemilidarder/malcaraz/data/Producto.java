package com.iesemilidarder.malcaraz.data;

import java.util.Date;

public abstract class Producto {
    private String country;
    private String titulo;
    private String description;
    private String tipo;
    private String id;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrecio() {
        return id;
    }

    public void setPrecio(Float precio) {
        this.id = id;
    }


public Producto(String country,String titulo,String description,String tipo,String id ){
        this.country=country;
        this.titulo=titulo;
        this.description=description;
        this.tipo=tipo;
        this.id=id;

}

}
