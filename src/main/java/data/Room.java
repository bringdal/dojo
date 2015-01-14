package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Room {

    private Alarm alarm ;
    private int floor;
    private List<Cooker> cookers = new ArrayList<Cooker>();
    private List<Lamp> lamps = new ArrayList<Lamp>();
    private List<Refrigerator> refrigerators = new ArrayList<Refrigerator>();

    public Room(Alarm alarm, int floor) {
        this.alarm = alarm;
        this.floor = floor;
    }

    public List<Cooker> getCookers() {
        return cookers;
    }

    public void addCooker(Cooker cooker) {
        cookers.add(cooker);
    }

    public List<Lamp> getLamps() {
        return lamps;
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public List<Refrigerator> getRefrigerators() {
        return refrigerators;
    }

    public void addRefrigerators(Refrigerator refrigerator) {
        refrigerators.add(refrigerator);
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public int getFloor() {
        return floor;
    }

}