package com.iesemilidarder.malcaraz.controller;
import com.iesemilidarder.malcaraz.DataHelper;
import com.iesemilidarder.malcaraz.data.Restaurante;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Class MyFirstController
 */

@RestController
public class MyFirstController {


//AllRestaurantes

    @RequestMapping("/restauranteAll")
    public List<Restaurante> getAll(){
        return DataHelper.getAll();
    }

    //All+Id
    @GetMapping("/restauranteAll/{id}")
    public Restaurante getId(@PathVariable String id) {
        Restaurante restaurante = DataHelper.getRestaurante(id);
        return restaurante;
    }

    //AddRestaurantes
    @PostMapping("/restauranteAll")
    public Restaurante addRestaurante(
            @RequestParam String titulo,
            @RequestParam String description,
            @RequestParam String id,
            @RequestParam String country,
            @RequestParam String tipo
    ) {
        Restaurante res = new Restaurante();
        res.setTitulo(titulo);
        res.setDescription(description);
        res.setId(id);
        res.setCountry(country);
        res.setTipo(tipo);
        DataHelper.addRestaurante(res);
        return res;
    }
    /*
    @RequestMapping(method = RequestMethod.POST, value = "/restauranteAll")
    public Restaurante addRestaurante(@RequestBody Restaurante restaurante) {
        return DataHelper.addRestaurante(restaurante);
    }
*/
    //DeleteRestaurantes
    @RequestMapping(method = RequestMethod.DELETE, value = "/restauranteAll/{id]")
    public void deleteRestaurante(@PathVariable String id) {DataHelper.deleteRestaurante(id);
    }
}


