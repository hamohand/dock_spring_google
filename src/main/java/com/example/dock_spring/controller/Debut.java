package com.example.dock_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Debut {

    @GetMapping("/")
    public  String affiche(){
        return "Azul fellawen 03/10 9:00";
    }

}
