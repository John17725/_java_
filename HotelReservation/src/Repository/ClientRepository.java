package Repository;

import Models.Client;
import java.util.HashMap;
import java.util.Map;

public class ClientRepository {
    private Map<Integer, Client> clients = new HashMap<>();

    public void addClient(Client client) {
        try {
            clients.put(client.getIdClient(),client);
            System.out.println("Successfully client created");
        }catch (Exception e){
            System.out.println("Error adding Client: "+e.getMessage());
        }
    }

    public Client getClientbyId(int idClient) {
        return clients.get(idClient);
    }

    public Boolean deleteClient(int idClient) {
        try {
            clients.remove(idClient);
            return true;
        }catch (Exception e){
            System.out.println("Error deleting Client: "+e.getMessage());
            return false;
        }
    }

    public Map<Integer, Client> getAllClients() {
        return clients;
    }
}
