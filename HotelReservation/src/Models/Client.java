package Models;

import java.util.List;

public class Client extends Person {
    private int idClient;
    private List<String> historyReservation;

    public Client(String firstName, String lastName, int age, String dateOfBirth, String address, String email, String phone, int idClient,List<String> historyReservation) {
        super(firstName, lastName,age,dateOfBirth,address,email,phone);
        this.idClient = idClient;
        this.historyReservation = historyReservation;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public List<String> getHistoryReservation() {
        return historyReservation;
    }

    public void setHistoryReservation(List<String> historyReservation) {
        this.historyReservation = historyReservation;
    }

    public String showAllInformation(){
        return getFirstName()+"\n"
                +getLastName()+"\n"
                +getDateOfBirth()+"\n"
                +getAddress()+"\n"
                +getEmail()+"\n"
                +getPhone()+"\n"
                +getIdClient()+"\n"
                +getHistoryReservation();
    }
}
