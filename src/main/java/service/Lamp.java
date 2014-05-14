package service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Lamp {

    private Bulb bulb;
    private boolean power = false;
    private LampType type ;
    private Color color;
    private Room roomName;

    public Lamp(BulbType bulbType, boolean power, LampType type, Color color, int floor, Room roomName) {
        this.bulb = new Bulb(bulbType, false) ;
        this.power = power;
        this.type = type;
        this.color = color;
        this.roomName = roomName;
    }

    public void setPower(boolean power) {
        bulb.setSwitchedOn(power);
        this.power = power;
    }

    public boolean isPower() {
        return power;
    }

    public Bulb getBulb() {
        return bulb;
    }

    public void setBulb(Bulb bulb) {
        this.bulb = bulb;
    }

    public LampType getType() {
        return type;
    }

    public void setType(LampType type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Room getRoomName() {
        return roomName;
    }

    public void setRoomName(Room roomName) {
        this.roomName = roomName;
    }
}
