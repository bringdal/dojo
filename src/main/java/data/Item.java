package data;

public class Item {

    private String brand;
    private String name ;
    private itemType type ;

    public Item(String brand, String name, itemType type) {
        this.brand = brand;
        this.name = name;
        this.type = type;
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

    public itemType getType() {
        return type;
    }

    public void setType(itemType type) {
        this.type = type;
    }

}
