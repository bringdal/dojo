package data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private static Logger LOGGER = LoggerFactory.getLogger(Room.class);

    private String name ;
    private Alarm alarm ;
    private int floor;
    private Size size ;
    private List<Item> items = new ArrayList<Item>() ;
    private Temperature temperature = null ;
    private Double area = null ;

    public Room(String name, Alarm alarm, int floor, Size size) {
        this.name = name;
        this.alarm = alarm;
        this.floor = floor;
        this.size = size;
        setArea(size.getLength(), size.getWidth()) ;
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

    public Size getSize() {
        return size;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setNewItems(List<Item> items) throws Exception{
        for (int i = 0; i < items.size(); i++) {
            if( items.get(i).getCoordinate().getX() > getSize().getLength() ||
                items.get(i).getCoordinate().getY() > getSize().getLength() ){
                LOGGER.debug("l'objet {} ne rentre pas dans la pièce, il sera retiré de la liste", items.get(i).getName()) ;
                items.remove(i) ;
            }
        }

        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item) ;
    }

    public void removeItem(Item item) {
        this.items.remove(item) ;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Double getArea() {
        return area;
    }

    private Double setArea(Double height, Double width ) {
        return height * width ;
    }

}