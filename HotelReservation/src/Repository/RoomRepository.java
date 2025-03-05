package Repository;

import java.util.HashMap;
import java.util.Map;
import Models.Room;

public class RoomRepository {
    private Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room room) {
        try {
            rooms.put(room.getRoomNumber(), room);
            System.out.println("Successfully added room");
        }catch (Exception e) {
            System.out.println("Error adding room"+e.getMessage());
        }
    }

    public void updateStatusRoom(int idRoom) {
        try {
            Room room = rooms.get(idRoom);
            room.setRoomStatus("Busy");
            rooms.put(idRoom, room);
            System.out.println("Successfully updated room");
        }catch (Exception e) {
            System.out.println("Error updating room: "+e.getMessage());
        }
    }

    public Room getRoom(int idRoom) {
        return rooms.get(idRoom);
    }

    public Map<Integer, Room> getAllRooms() {
        return rooms;
    }
}
