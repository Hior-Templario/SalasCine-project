package com.camilo.salasdecine.controllers;

// Importa la entidad Cliente para manipular sus datos
import com.camilo.salasdecine.entities.Cliente;
// Importa el servicio ClienteService para acceder a la lógica de negocio
import com.camilo.salasdecine.services.ClienteService;
// Importa las anotaciones necesarias para la configuración de Spring
import org.springframework.beans.factory.annotation.Autowired; // Permite la inyección de dependencias
import org.springframework.stereotype.Controller; // Marca la clase como un controlador de Spring MVC
import org.springframework.ui.Model; // Modelo para enviar datos a la vista
import org.springframework.web.bind.annotation.GetMapping; // Manejo de solicitudes HTTP GET
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// Define la clase como un controlador de Spring MVC
@Controller
@RequestMapping("/clientes")
class ClienteController {

    @Autowired // Inyección de dependencia para acceder a los métodos de ClienteService
    private ClienteService clienteService;

    @GetMapping("/lista") // Maneja las solicitudes GET a la ruta "/clientes"
    public String listaCliente(Model model) {
        List<Cliente> clientes = clienteService.obtenerCliente(); // Obtiene la lista de clientes desde el servicio
        model.addAttribute("clientes", clientes); // Agrega los clientes al modelo para pasarlos a la vista
        return "clientes/listaClientes"; // Nombre de la vista (listaClientes.html o clientes.jsp, depende de tu configuración)
    }

}
