package com.example.BS3.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BeanService {



    @Bean
    public CommandLineRunner func2(){
        return p->{
            System.out.println("Hola desde Servicios");
        };
    }

}
