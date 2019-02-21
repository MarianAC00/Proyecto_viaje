package com.iesemilidarder.malcaraz.controller;

import com.iesemilidarder.malcaraz.DataHelper;
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

    private DataHelper restaService = new DataHelper();

//AllRestaurantes

    @RequestMapping("/restaurantesAll")
    public List<Restaurante> getAll() {
        return restaService.getAll();
    }

    //All+Id
    @RequestMapping(value = "/restauranteAll/{id}", method = RequestMethod.GET)
    public Restaurante getId(@PathVariable String id) {

        return restaService.getRestaurante(id);
    }

    //AddRestaurantes
    @RequestMapping(method = RequestMethod.POST, value = "/restauranteAll")
    public Restaurante addRestaurante(@RequestBody Restaurante restaurante) {
        return restaService.addRestaurante(restaurante);
    }

    //DeleteRestaurantes
    @RequestMapping(method = RequestMethod.DELETE, value = "/restauranteAll/{id]")
    public void deleteRest(@PathVariable String id) {restaService.deleteRestaurante(id);
    }

}


