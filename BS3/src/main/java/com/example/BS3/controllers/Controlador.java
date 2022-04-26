package com.example.BS3.controllers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @Bean
    public CommandLineRunner func4(){
        return p->{
            System.out.println("Hola desde Controlador");
        };
    }

}
