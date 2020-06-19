package com.example.cloud.build.test.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    /***Comentario ***/
    public String saludar(String nombre){
        return "Chau "+nombre+"!!!" ;
    }

}
