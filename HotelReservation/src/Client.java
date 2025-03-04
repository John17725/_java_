import java.util.List;

public class Client extends Person {
    private List<String> historyReservation;

    public Client(String firstName, String lastName, int age, String dateOfBirth, String address, String email, String phone, List<String> historyReservation) {
        super(firstName, lastName,age,dateOfBirth,address,email,phone);
        this.historyReservation = historyReservation;
    }

    public List<String> getHistoryReservation() {
        return historyReservation;
    }

    public void setHistoryReservation(List<String> historyReservation) {
        this.historyReservation = historyReservation;
    }
}
