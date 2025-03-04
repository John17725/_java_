public class Reservation {
    private Client client;
    private Room room;
    private String dateCheckIn;
    private String dateCheckOut;
    private String reservationStatus;

    public Reservation(Client client,Room room, String dateCheckIn, String dateCheckOut, String reservationStatus) {
        this.client = client;
        this.room = room;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
        this.reservationStatus = reservationStatus;
    }
}
