package data;

import java.util.List;

public class Home {

    private List<Room> rooms ;
    private Color color ;
    private Coordinate coordinate ;
    private Size size ;
    private int floors = 1 ;

    public Home(List<Room> rooms, Color color, Coordinate coordinate, Size size, int floors) {
        this.rooms = rooms;
        this.color = color;
        this.coordinate = coordinate;
        this.size = size;
        this.floors = floors ;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

}
