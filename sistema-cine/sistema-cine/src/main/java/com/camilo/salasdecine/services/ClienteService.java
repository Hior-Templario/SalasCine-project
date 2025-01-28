package com.camilo.salasdecine.services;

import com.camilo.salasdecine.dao.ClienteRepository;
import com.camilo.salasdecine.entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> obtenerCliente(){
        return clienteRepository.findAll();
    }
}
