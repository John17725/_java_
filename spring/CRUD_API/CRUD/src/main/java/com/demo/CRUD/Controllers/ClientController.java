package com.demo.CRUD.Controllers;

import com.demo.CRUD.APIResponse.APIResponse;
import com.demo.CRUD.Models.Client;
import com.demo.CRUD.Services.ClientService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<APIResponse<List<Client>>> getAllClients() {
        return this.clientService.getAllClients();
    }

    @PostMapping
    public ResponseEntity<APIResponse<Client>> addClient(@RequestBody Client client) {
        try {
            return this.clientService.saveClient(client);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
