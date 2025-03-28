package com.demo.CRUD.Services;

import com.demo.CRUD.APIResponse.APIResponse;
import com.demo.CRUD.Models.Client;
import com.demo.CRUD.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public ResponseEntity<APIResponse<?>> saveClient(Client client, BindingResult result) {
        try {
            if(result.hasErrors()) {
                return ResponseEntity.badRequest().body(new APIResponse<>("Errors found", 400, handleValidationErrors(result)));
            }
            client.setClientIdentifier(UUID.randomUUID().toString());
            System.out.println(client.getClientIdentifier());
            Client clientCreated = clientRepository.save(client);
            return ResponseEntity.ok(new APIResponse<>("Client created", 201, clientCreated));
        }catch (Exception e) {
            return ResponseEntity.badRequest().body(new APIResponse<>(e.getMessage(), 500, null));
        }

    }

    public ResponseEntity<APIResponse<Client>> getClientByIdentifier(String clientIdentifier) {
        Client clientFound = clientRepository.findByClientIdentifier(clientIdentifier).orElse(null);
        APIResponse<Client> response = new APIResponse<>("Client found", 200, clientFound);
        if(clientFound == null) {
            response.setMessage("No client found");
            response.setCodeStatus(404);
        }
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<APIResponse<Client>> updateClient(String clientIdentifier, Client clientInput) {
        Client client = clientRepository.findByClientIdentifier(clientIdentifier).orElse(null);
        APIResponse<Client> response = new APIResponse<>("Success updated", 200, client);
        if(client == null) {
            response.setMessage("No client found");
            response.setCodeStatus(404);
            return  ResponseEntity.ok(response);
        }
        client.setFirstName(clientInput.getFirstName());
        client.setLastName(clientInput.getLastName());
        client.setEmail(clientInput.getEmail());
        client.setPhoneNumber(clientInput.getPhoneNumber());
        client.setAddress(clientInput.getAddress());
        clientRepository.save(client);
        response.setData(client);
        return ResponseEntity.ok(response);
    }

    private Map<String, String> handleValidationErrors(BindingResult result){
        Map<String , String> errors = new HashMap<>();
        for(FieldError error : result.getFieldErrors()){
            errors.put(error.getField(), error.getDefaultMessage());
        }
        return errors;
    }
}
