package com.iesemilidarder.malcaraz.controller;

import com.iesemilidarder.malcaraz.DataHelper;
import com.iesemilidarder.malcaraz.data.Producto;
import com.iesemilidarder.malcaraz.data.Restaurante;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * com.iesemilidarder.asoto.controller
 * Class MyFirstController
 * By berto. 17/10/2018
 */

@RestController
public class MyFirstController {

    //service



//AllRestaurantes

    @RequestMapping("/restaurantesAll")
    public List<Restaurante> getAll() {
        return DataHelper.getAll();
    }

    //All+Id
    @GetMapping("/restauranteAll/{id}")
    public Restaurante getId(@PathVariable String id) {
        Restaurante restaurante = DataHelper.getRestaurante(id);
        return restaurante;
    }

    //AddRestaurantes
    @PostMapping("/products")
    public Restaurante addProduct(
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
    public void deleteRest(@PathVariable String id) {DataHelper.deleteRestaurante(id);
    }

}


