package com.iesemilidarder.malcaraz.controller;

import com.iesemilidarder.malcaraz.data.DataHelper;
import com.iesemilidarder.malcaraz.data.Hotel;
import com.iesemilidarder.malcaraz.data.Producto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * com.iesemilidarder.asoto.controller
 * Class MyFirstController
 * By berto. 17/10/2018
 */
@RestController
public class MyFirstController {
    @RequestMapping("/")

    @RequestMapping("/hotelAll")
    public List <Producto> getHotels(){

        List<Producto> items= DataHelper.getData();
        return items;
    }

    @RequestMapping("/hotel")
    public Producto getHotel(@RequestParam(value = "name", defaultValue = "BrumBrum") String name
    ) {
        Hotel car = new Hotel();
        car.setTitulo(name);
        return car;
    }
}
