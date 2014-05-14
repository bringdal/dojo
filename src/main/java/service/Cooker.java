package service;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Cooker {

    private PowerType powerType;
    private Room roomName;

    public Cooker(PowerType powerType, Room roomName) {
        this.powerType = powerType;
        this.roomName = roomName;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public void setPowerType(PowerType powerType) {
        this.powerType = powerType;
    }

    public Room getRoomName() {
        return roomName;
    }

    public void setRoomName(Room roomName) {
        this.roomName = roomName;
    }
}
