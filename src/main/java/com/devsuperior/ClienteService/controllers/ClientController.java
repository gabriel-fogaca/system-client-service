package com.devsuperior.ClienteService.controllers;

import com.devsuperior.ClienteService.dto.ClientDTO;
import com.devsuperior.ClienteService.repositories.ClientRepository;
import com.devsuperior.ClienteService.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.ClienteService.entities.Client;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
