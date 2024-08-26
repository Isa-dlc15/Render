package com.miNombre.renderCom.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nombreController {

    @GetMapping("/mi-nombre")
    public String getNombre() {
        return "Obed Isaías de León Carrillo";
    }
}
