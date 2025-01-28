//package com.camilo.salasdecine.controllers;
//
//import com.camilo.salasdecine.entities.Pelicula;
//import com.camilo.salasdecine.services.PeliculaServicio;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@Controller
//public class PeliculaController {
//
//    @Autowired
//    private PeliculaServicio peliculaSericio;
//
//    @GetMapping("/peliculas")
//    public String getPelicula(Model mondel){
//        List<Pelicula> peliculas = peliculaSericio.obtenerPelicula();
//        mondel.addAttribute("peliculas", peliculas);
//        return "peliculas";
//    }
//}
