package com.camilo.salasdecine.controllers;

import com.camilo.salasdecine.entities.Pelicula;
import com.camilo.salasdecine.services.PeliculaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaServicio peliculaServicio;

    @GetMapping("/lista")
    public String listaPelicula(Model mondel){
        List<Pelicula> peliculas = peliculaServicio.obtenerPelicula();
        mondel.addAttribute("peliculas", peliculas);
        return "peliculas/listaPeliculas";
    }
}
