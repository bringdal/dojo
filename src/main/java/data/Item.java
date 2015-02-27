package data;

public class Item {

    private String brand;
    private String name ;
    private ItemType type ;

    public Item(String brand, String name, ItemType type) {
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

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

}