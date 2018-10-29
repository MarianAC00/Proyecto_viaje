package com.iesemilidarder.malcaraz.controller;

import com.iesemilidarder.malcaraz.data.Hotel;
import com.iesemilidarder.malcaraz.data.Producto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.iesemilidarder.asoto.controller
 * Class MyFirstController
 * By berto. 17/10/2018
 */
@RestController
public class MyFirstController {

    @RequestMapping("/hotel")
    public Producto getHotel(@RequestParam(value = "name", defaultValue = "BrumBrum") String name,
                           @RequestParam(value = "description") String description
    ) {
        Hotel car = new Hotel();
        car.setTitulo(name);
        car.setDescription(description);
        return car;
    }
}
