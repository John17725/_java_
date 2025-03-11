package Models;

public class Reservation {
    private int idReservation;
    private Pay pay;
    private Client client;
    private Room room;
    private String dateCheckIn;
    private String dateCheckOut;
    private String reservationStatus;

    public Reservation(int idReservation, Pay pay, Client client, Room room, String dateCheckIn, String dateCheckOut, String reservationStatus) {
        this.idReservation = idReservation;
        this.pay = pay;
        this.client = client;
        this.room = room;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
        this.reservationStatus = reservationStatus;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getDateCheckIn() {
        return dateCheckIn;
    }

    public void setDateCheckIn(String dateCheckIn) {
        this.dateCheckIn = dateCheckIn;
    }

    public String getDateCheckOut() {
        return dateCheckOut;
    }

    public void setDateCheckOut(String dateCheckOut) {
        this.dateCheckOut = dateCheckOut;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public String showReservationInfo(){
        return "ID reservation: "+idReservation
                +"\nClient reservation: "+client.getFirstName()
                +"\nRoom reservated: "+room.getRoomNumber()
                +"\nDate check in: "+dateCheckIn
                +"\nDate check out: "+dateCheckOut
                +"\nReservation status: "+reservationStatus
                +"\nPayment status: "+pay.getPayStatus()
                +"\nMethod payment: "+pay.getTypePay()
                +"\nAmount payment: "+pay.getAmount();
    }
}
