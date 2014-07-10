package data;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Room {

    private Alarm alarm ;
    private Cooker cooker ;
    private Lamp lamp ;
    private Refrigerator refrigerator ;
    private int floor;

    public Room(Alarm alarm, Cooker cooker, Lamp lamp, Refrigerator refrigerator, int floor) {
        this.alarm = alarm;
        this.cooker = cooker;
        this.lamp = lamp;
        this.refrigerator = refrigerator;
        this.floor = floor;
    }

    public Cooker getCooker() {
        return cooker;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public int getFloor() {
        return floor;
    }

}