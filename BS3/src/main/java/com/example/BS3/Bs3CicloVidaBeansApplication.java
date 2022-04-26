package com.example.BS3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;
import java.awt.*;

@SpringBootApplication
public class Bs3CicloVidaBeansApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Bs3CicloVidaBeansApplication.class, args);
	}

	@PostConstruct
	public void func1(){
		System.out.println("Hola desde clase inicial");
	}

}
