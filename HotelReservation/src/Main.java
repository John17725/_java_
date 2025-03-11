import Models.Client;
import Models.Pay;
import Models.Room;
import Models.Reservation;

import Services.ClientService;
import Services.PayService;
import Services.ReservationService;
import Services.RoomService;

import enums.PayStatus;
import enums.TypePay;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ClientService clientService = new ClientService();
        RoomService roomService = new RoomService();
        ReservationService reservationService = new ReservationService();
        PayService payService = new PayService();

        int optionMenu = 1;
        try {
            do{
                System.out.printf(
                        "\n1.- Create client"
                                +"\n2.- List all clients"
                                +"\n3.- Create room"
                                +"\n4.- List rooms"
                                +"\n5.- Get reservation"
                                +"\n6.- Check my reservation"
                                +"\nSelect an option: "
                );
                optionMenu = input.nextInt();

                switch (optionMenu) {
                    case 1:{
                        int clientId = random.nextInt(1000);
//                        input.nextLine();
//                        System.out.println("First name: ");
//                        String firstName = input.nextLine();
//                        System.out.println("Last name: ");
//                        String lastName = input.nextLine();
//                        System.out.println("Insert age: ");
//                        int age = input.nextInt();
//                        input.nextLine();
//                        System.out.println("Insert date of birth: ");
//                        String dateOfBirth = input.nextLine();
//                        System.out.println("Insert address: ");
//                        String address = input.nextLine();
//                        System.out.println("Insert email: ");
//                        String email = input.nextLine();
//                        System.out.println("Insert phone number: ");
//                        String phoneNumber = input.nextLine();
//                        Client newClient = new Client(firstName, lastName, age, dateOfBirth,
//                                address, email,phoneNumber, clientId, List.of(new String[]{}));
                        Client newClient = new Client("Jesus", "Gonzalez", 25, "03/03/1999",
                                "Priv Marianao 9", "jesusgonzalez@gmail.com","5535571035", clientId, List.of(new String[]{}));
                        System.out.println("clientId: " + clientId);
                        clientService.createClient(newClient);
                        break;
                    }
                    case 2:{
                        Map<Integer, Client> allClients = clientService.getAllClients();
                        if (allClients.isEmpty()) {
                            System.out.println("\nNo clients in db\n");
                        }
                        allClients.forEach((id, client) -> {
                            System.out.println(id + " - " + client.showAllInformation());
                        });
                        break;
                    }
                    case 3:{
                        for (int i = 0; i < 10; i++) {
                            Room room = new Room(random.nextInt(1000),random.nextDouble(999.99),"Available",new String[]{"Comfortabe", "Nice"});
                            roomService.createRoom(room);
                        }
                        break;
                    }
                    case 4:{
                        System.out.println(roomService.getAllRooms());
                        break;
                    }
                    case 5:{
                        int  roomId;
                        int userId;
                        String response;
                        System.out.println("Enter client id: ");
                        userId = input.nextInt();
                        Client clientSession = clientService.getClientById(userId);
                        if(clientSession == null) {
                            System.out.println("Acces denied");
                            break;
                        }
                        System.out.println("Client's name: "+clientSession.getFirstName()+" "+clientSession.getLastName());
                        System.out.println(roomService.getAllRoomsAvailable());
                        System.out.println("Which room would you like to list?: ");
                        roomId = input.nextInt();
                        input.nextLine();
                        System.out.println("Are you sure reservate this room(yes/no): ");
                        response = input.nextLine();
                        if(response.equals("no")) {
                            System.out.println("See you");
                            break;
                        }
                        Room roomSelected = roomService.getRoom(roomId);
                        String responseTypePayment;
                        System.out.println("Room selected: " + roomSelected.showRoomInformation());
                        System.out.println("Select pay method: ");
                        int reservationId= random.nextInt(100);
                        responseTypePayment = input.nextLine();
                        boolean statusPayment = false;
                        int payId= random.nextInt(100);
                        Pay payReservation = new Pay(payId,roomSelected.getRoomPrice(),TypePay.valueOf(responseTypePayment), PayStatus.valueOf("PENDING"));
                        Reservation newReservation = new Reservation(reservationId, payReservation,clientSession,roomSelected,"04/11/2025","09/11/2025","PENDING");
                        reservationService.createReservation(newReservation);
                        payService.createPay(payReservation);
                        switch (responseTypePayment) {
                            case "CASH":{
                                System.out.println("Success payment");
                                statusPayment = true;
                                reservationService.setStatusReservation(reservationId,"RESERVATED");
                                payService.updatePayStatus(payId,PayStatus.valueOf("COMPLETED"));
                                break;
                            }
                            default:{
                                System.out.println("Invalid payment");
                                statusPayment = false;
                                break;
                            }
                        }
                        if(!statusPayment) {
                            System.out.println("Leave");
                            reservationService.setStatusReservation(reservationId,"CANCELLED");
                            payService.updatePayStatus(payId,PayStatus.valueOf("FAILED"));
                            break;
                        }
                        System.out.println("Your reservation id: "+reservationId);
                        break;
                    }
                    case 6: {
                        int reservationId;
                        System.out.println("Enter reservation id: ");
                        reservationId = input.nextInt();
                        System.out.println(reservationService.findReservation(reservationId).showReservationInfo());
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }while(optionMenu != 9);
        }catch (Exception e){
            System.out.println("Error"+ e.getMessage());
        }

    }
}