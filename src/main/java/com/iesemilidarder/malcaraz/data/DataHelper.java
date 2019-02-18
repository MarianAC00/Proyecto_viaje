package com.iesemilidarder.malcaraz.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataHelper {
public static List<Restaurante> Restaurantes = new ArrayList<Restaurante>(Arrays.asList(

        new Restaurante ("ES", "R1","español","xino","1"),
        new Restaurante ("PA", "R2","panameño","zano","2"),
        new Restaurante ("DO", "R3","dominicano","zino","3"),
        new Restaurante ("MX", "R4","mexicano","cano","4")
));
//Todos restaurante

    public static List<Restaurante> getAll() {



        return Restaurantes;
    }
}