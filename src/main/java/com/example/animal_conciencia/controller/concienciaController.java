package com.example.animal_conciencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class ConcienciaController {

    @GetMapping("/api/frases")
    public List<Map<String, String>> getFrases() {
        List<Map<String, String>> frases = new ArrayList<>();
        frases.add(Map.of("id", "1", "mensaje", "Los animales sienten dolor, miedo y alegría igual que nosotros."));
        frases.add(Map.of("id", "2", "mensaje", "Adopta, no compres."));
        frases.add(Map.of("id", "3", "mensaje", "El maltrato animal es un reflejo de la falta de humanidad."));
        frases.add(Map.of("id", "4", "mensaje", "Educar en el respeto a los animales es educar en humanidad."));
        return frases;
    }
}
