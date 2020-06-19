package com.example.cloud.build.test.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SaludoTest {

    @Autowired
    private SaludoService service;

    @Test
    public void saludarAlguienTest(){
        String nombre = "Jose";
        Assert.assertEquals("Chau "+ nombre+"!!!",service.saludar(nombre));
    }


    @Test
    public void saludoVacioTest(){
        Assert.assertEquals("Chau !!!",service.saludar(""));
    }

}
