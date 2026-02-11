package com.cliente.api.controller;

import com.cliente.api.model.Cliente;
import com.cliente.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository repositorio;


@GetMapping
public List<Cliente> listar(){
    return repositorio.findAll();

    }
}
