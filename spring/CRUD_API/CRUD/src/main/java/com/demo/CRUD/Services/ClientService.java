package com.demo.CRUD.Services;

import com.demo.CRUD.Models.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    public List<Client> getAllClients() {
    List<Client> clients = new ArrayList<>(List.of(
                new Client(1,"Jesus","Gonzalez"),
                new Client(2,"Diego", "Estrada"),
                new Client(3,"Nieves", "Nieves"),
                new Client(4,"Valeria", "Estrada")
        ));
        return clients;
    }

}
