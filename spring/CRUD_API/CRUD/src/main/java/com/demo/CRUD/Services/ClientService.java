package com.demo.CRUD.Services;

import com.demo.CRUD.APIResponse.APIResponse;
import com.demo.CRUD.Models.Client;
import com.demo.CRUD.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ResponseEntity<APIResponse<List<Client>>> getAllClients() {
        List<Client> clientsFound = clientRepository.findAll();
        APIResponse<List<Client>> response = new APIResponse<>("Clients found", 200, clientsFound);
        if(clientsFound.isEmpty()) {
            response.setMessage("No clients found");
            response.setCodeStatus(404);
        }
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<APIResponse<Client>> saveClient(Client client) {
        Client clientCreated = clientRepository.save(client);
        clientCreated.setClientIdentifier(UUID.randomUUID().toString());
        APIResponse<Client> response = new APIResponse<>("Client created", 201, clientCreated);
        return ResponseEntity.ok(response);
    }

}
