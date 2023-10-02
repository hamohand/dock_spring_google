package com.example.dock_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(DockSpringApplication.class, args);
		System.out.println("Accueil : http://localhost:8080 par défaut");
	}

}
