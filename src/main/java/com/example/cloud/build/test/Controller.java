package com.example.cloud.build.test;

import com.example.cloud.build.test.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private SaludoService saludo;

    @RequestMapping(value = "/saludar", method = RequestMethod.GET)
    public String getSaludo(@RequestParam(value = "nombre", required = true) String nombre ){

        return saludo.saludar(nombre);
    }

}
