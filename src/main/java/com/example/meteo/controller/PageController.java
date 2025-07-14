package com.example.meteo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/contatti")
    public String contatti() {
        return "contatti";
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }

    @GetMapping("/meteo")
    public String meteo() {
        return "meteo";
    }

    @GetMapping("/milano")
    public String milano() {
        return "milano";
    }

    @GetMapping("/prova")
    public String prova() {
        return "prova";
    }

    @GetMapping("/roma")
    public String roma() {
        return "roma";
    }

    @GetMapping("/torino")
    public String torino() {
        return "torino";
    }
}
