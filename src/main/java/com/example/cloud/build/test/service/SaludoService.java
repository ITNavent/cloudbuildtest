package com.example.cloud.build.test.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    public String saludar(String nombre){
        return "Buenardassss "+nombre+"!!!" ;
    }

}
