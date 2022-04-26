package com.example.BS3.models;

import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
public class Componente {



    @Bean
    public CommandLineRunner func3(){
        return p->{
            System.out.println("Hola desde Componente");
        };
    }
}
