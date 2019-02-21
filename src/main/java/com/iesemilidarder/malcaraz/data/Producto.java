package com.iesemilidarder.malcaraz.data;

public abstract class Producto {
    private String country;
    private String titulo;
    private String description;
    private String tipo;
    private String id;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Producto(String country, String titulo, String description, String tipo, String id ){
        this.country=country;
        this.titulo=titulo;
        this.description=description;
        this.tipo=tipo;
        this.id=id;

}

}
