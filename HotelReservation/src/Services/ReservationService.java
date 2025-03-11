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

    public Reservation findReservation(int idReservation){
        try {
            Reservation reservationFound = reservationRepository.getReservation(idReservation);
            if(reservationFound == null){
                System.out.println("Reservation not found");
                return null;
            }
            return reservationFound;
        }catch (Exception e){
            System.out.println("Error finding reservation"+e.getMessage());
            return null;
        }
    }

    public Boolean setStatusReservation(int idReservation, String status){
        try {
            Reservation responseReservation = reservationRepository.updateReservationStatus(idReservation, status);
            return responseReservation!=null;
        }catch (Exception e){
            System.out.println("Error setting status reservation"+e.getMessage());
            return false;
        }
    }
}
