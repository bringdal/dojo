package service;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Room {

    private Alarm alarm  ;
    private int floor;
    private RoomName roomName;

    public Room(int floor, RoomName roomName) {
        this.roomName = roomName;
        this.alarm.setScreaming(false);
        this.floor = floor;
    }

    public RoomName getRoomName() {
        return roomName;
    }

    public void setRoomName(RoomName roomName) {
        this.roomName = roomName;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }
}