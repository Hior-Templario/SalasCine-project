package com.camilo.salasdecine.dao;  // Paquete en el que se encuentra el repositorio.

import com.camilo.salasdecine.entities.Cliente;  // Importación de la entidad Cliente.

import org.springframework.data.jpa.repository.JpaRepository;  // Importación de JpaRepository para acceder a operaciones CRUD.
import org.springframework.data.rest.core.annotation.RepositoryRestResource;  // Importación de la anotación que expone el repositorio como recurso REST.

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "clientes", path = "clientes")  // Exposición del repositorio como recurso REST, configurando el nombre de la colección y el endpoint.
public interface ClienteRepository extends JpaRepository<Cliente, Long> {  // Interfaz que extiende JpaRepository para operar sobre la entidad Cliente con un ID de tipo Long.
    List<Cliente> findAll();
}
