package com.example.cloud.build.test;

import com.example.cloud.build.test.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private SaludoService saludo;

    @RequestMapping(value = "/saludar/{nonbre}", method = RequestMethod.GET)
    public String getSaludo(@PathVariable String nombre ){
        return saludo.saludar(nombre);
    }

}
