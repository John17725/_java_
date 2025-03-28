package com.demo.CRUD.Controllers;

import com.demo.CRUD.APIResponse.APIResponse;
import com.demo.CRUD.Models.Client;
import com.demo.CRUD.Services.ClientService;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
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

    @GetMapping("/{clientIdentifier}")
    public ResponseEntity<APIResponse<Client>> getClientByIdentifier(@PathVariable String clientIdentifier) {
        return this.clientService.getClientByIdentifier(clientIdentifier);
    }

    @PostMapping
    public ResponseEntity<APIResponse<?>> addClient(@Valid @RequestBody Client client, BindingResult result) {
        try {
            return this.clientService.saveClient(client, result);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @PutMapping("/{clientIdentifier}")
    public ResponseEntity<APIResponse<Client>> updateClient(@PathVariable String clientIdentifier,@RequestBody Client client) {
        return this.clientService.updateClient(clientIdentifier,client);
    }
}
