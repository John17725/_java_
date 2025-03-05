package Services;

import Models.Room;
import Repository.RoomRepository;

import java.util.Map;

public class RoomService {
    RoomRepository roomRepository = new RoomRepository();
    public void createRoom(Room room) {
        try {
            roomRepository.addRoom(room);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Room getRoom(int id) {
        try {
            return roomRepository.getRoom(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String getAllRooms() {
        Map<Integer, Room> allRooms = roomRepository.getAllRooms();
        StringBuilder roomsStr = new StringBuilder();
        if (allRooms.isEmpty()) {
            System.out.println("\nNo clients in db\n");
            return "";
        }
        allRooms.forEach((id, room) -> {
            roomsStr.append(room.showRoomInformation()+"\n");
        });
        return roomsStr.toString();
    }

    public String getAllRoomsAvailable() {
        Map<Integer, Room> allRooms = roomRepository.getAllRooms();
        StringBuilder roomsStr = new StringBuilder();
        if (allRooms.isEmpty()) {
            System.out.println("\nNo clients in db\n");
            return "";
        }
        allRooms.forEach((id, room) -> {
            if(room.getRoomStatus().equals("Available")){
                roomsStr.append(room.showRoomInformation()+"\n");
            }
        });
        return roomsStr.toString();
    }
}
