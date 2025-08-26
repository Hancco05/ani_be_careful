package com.example.animal_conciencia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Cuidemos a los Animales");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Sobre Nosotros");
        return "about";
    }

    @GetMapping("/actions")
    public String actions(Model model) {
        model.addAttribute("title", "Acciones y Consejos");
        return "actions";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contacto");
        return "contact";
    }
}
