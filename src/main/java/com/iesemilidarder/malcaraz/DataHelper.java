package com.iesemilidarder.malcaraz;

import com.iesemilidarder.malcaraz.data.Restaurante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class DataHelper {
    public static List<Restaurante> Restaurantes = new ArrayList<Restaurante>(Arrays.asList(

            new Restaurante("ES", "R1", "español", "xino", "1"),
            new Restaurante("PA", "R2", "panameño", "zano", "2"),
            new Restaurante("DO", "R3", "dominicano", "zino", "3"),
            new Restaurante("MX", "R4", "mexicano", "cano", "4")
    ));
//Todos restaurantes

    public List<Restaurante> getAll() {
        return Restaurantes;
    }

    //Filtrar por id
    public Restaurante getRestaurante(String id) {
        for (Restaurante it : getAll()) {
            if (it.getId().equals(id)) {
                return it;
            }
        }
        return null;
    }

    //Add Restaurante
    public Restaurante addRestaurante(Restaurante restaurante) {
        if (restaurante.getId().isEmpty()) {
            restaurante.setId(UUID.randomUUID().toString());
        }
        Restaurantes.add(restaurante);
        return restaurante;
    }


    //Delete Restaurante
    public void deleteRestaurante(String id) {
        Restaurantes.removeIf(t -> t.getId().equals(id));
    }
}

