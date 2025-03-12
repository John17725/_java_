package com.demo.CRUD.Controllers;

import com.demo.CRUD.Models.Client;
import com.demo.CRUD.Services.ClientService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    ClientService clientService = new ClientService();
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
}
