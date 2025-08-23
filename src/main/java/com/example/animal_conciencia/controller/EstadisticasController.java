package com.ejemplo.animalconciencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class EstadisticasController {

    @GetMapping("/api/estadisticas")
    public Map<String, Object> getEstadisticas() {
        Map<String, Object> data = new HashMap<>();
        data.put("animales_rescatados", 2500);
        data.put("denuncias_2024", 830);
        data.put("adopciones", 1200);
        return data;
    }
}
