package Models;

import java.util.Arrays;

public class Room {
    private int roomNumber;
    private double roomPrice;
    private String roomStatus;
    private String[] roomCharacteristics;

    public Room(int roomNumber, double roomPrice, String roomStatus, String[] roomCharacteristics) {
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.roomStatus = roomStatus;
        this.roomCharacteristics = roomCharacteristics;
    }

    public String[] getRoomCharacteristics() {
        return roomCharacteristics;
    }

    public void setRoomCharacteristics(String[] roomCharacteristics) {
        this.roomCharacteristics = roomCharacteristics;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String showRoomInformation(){
        return roomNumber+"\n"+roomStatus+"\n"+roomPrice+"\n"+Arrays.toString(roomCharacteristics);
    }
}
