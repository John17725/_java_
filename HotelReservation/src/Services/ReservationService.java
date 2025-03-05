package Services;

import Models.Reservation;

import Repository.ReservationRepository;

public class ReservationService {
    ReservationRepository reservationRepository = new ReservationRepository();

    public void createReservation(Reservation reservation){
        try {
            reservationRepository.createReservation(reservation);
        }catch (Exception e){
            System.out.println("Error creating reservation"+e.getMessage());
        }
    }
}
