package data;

public class Item {

    private String brand;
    private String name ;
    private ItemType type ;
    private Coordinate coordinate ;

    public Item(String brand, String name, ItemType type, Coordinate coordinate) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.coordinate = coordinate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}