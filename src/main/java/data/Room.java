package data;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String name ;
    private Alarm alarm ;
    private int floor;
    private List<Item> items = new ArrayList<Item>() ;

    public Room(String name, Alarm alarm, int floor) {
        this.name = name;
        this.alarm = alarm;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item) ;
    }

    public void removeItem(Item item) {
        this.items.remove(item) ;
    }

}