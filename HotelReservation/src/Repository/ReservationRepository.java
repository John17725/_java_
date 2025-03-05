package Repository;

import Models.Reservation;

import java.util.HashMap;
import java.util.Map;

public class ReservationRepository {
    private Map<Integer, Reservation> reservations = new HashMap<>();

    public void createReservation(Reservation reservation) {
        try {
            reservations.put(reservation.getIdReservation(), reservation);
            System.out.println("Reservation created");
        }catch (Exception e){
            System.out.println("Error reservation"+e.getMessage());
        }
    }
}
