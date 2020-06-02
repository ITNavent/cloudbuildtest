package com.example.cloud.build.test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/message/{to}", method = RequestMethod.GET)
    public String getMessage(@PathVariable String to ){
        return "Hi! "+to;
    }

}
