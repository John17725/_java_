package Services;

import Models.Client;
import Repository.ClientRepository;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ClientService {
    ClientRepository clientRepository = new ClientRepository();
    private Set<String> emails = new HashSet<>();

    public void createClient(Client client) {
        try {
            if(emails.contains(client.getEmail())){
                throw new IllegalArgumentException(String.format("Client with email %s already in use",client.getEmail()));
            }
            emails.add(client.getEmail());
            clientRepository.addClient(client);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Client getClientById(int idClient) {
        Client client = clientRepository.getClientbyId(idClient);
        if(client == null){
            throw new IllegalArgumentException(String.format("Client with id %d does not exist",idClient));
        }
        return client;
    }

    public Map<Integer, Client> getAllClients() {
        return clientRepository.getAllClients();
    }

    public void deleteClient(int idClient) {
        Client client = clientRepository.getClientbyId(idClient);
        if(client == null){
            throw new IllegalArgumentException(String.format("Client with id %d does not exist",idClient));
        }
        Boolean clientDeleted = clientRepository.deleteClient(idClient);
        if(clientDeleted){
            System.out.println("Client with id " + idClient + " has been deleted");
        }
        throw new IllegalArgumentException("Client not deleted");

    };

}
