package com.example.BS3.models;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    @Bean
    CommandLineRunner ejecutarMain(){
        return p->{
            System.out.println("Hola desde Clase Main");
        };
    }
}
