package data;

import org.springframework.util.Assert;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Refrigerator {

    private PowerType powerType ;
    private Temperature temperature ;
    private Freezer freezer ;
    private List<Product> products = new ArrayList<Product>();
    private int space = 50;
    private int floors ;
    private boolean spaceAlert = false;
    private boolean working = false ;

    public Refrigerator(PowerType powerType, Temperature temperature, List<Product> products, int space, boolean working, int floors) {
        this.powerType = powerType;
        Assert.isTrue(temperature.getValue() >= -30d, "The minimal temperature is 0");
        Assert.isTrue(temperature.getValue() <= 0d, "The maximal temperature is 350");
        temperature.setHotAlert(10d);
        this.products = products;
        this.space = space;
        this.working = working;
        this.floors = floors;
    }

    public Refrigerator(PowerType powerType, Temperature temperature, Freezer freezer, List<Product> products, int space, boolean working, int floors) {
        this.powerType = powerType ;
        Assert.isTrue(temperature.getValue() >= -30d, "The minimal temperature is 0");
        Assert.isTrue(temperature.getValue() <= 0d, "The maximal temperature is 350");
        temperature.setHotAlert(10d);
        this.freezer = freezer;
        this.products = products;
        this.space = space;
        this.working = working;
        this.floors = floors;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public void setPowerType(PowerType powerType) {
        this.powerType = powerType;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Freezer getFreezer() {
        return freezer;
    }

    public void setFreezer(Freezer freezer) {
        this.freezer = freezer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product, int floor) {
        if (products.size() >= space){
            setSpaceAlert(true) ;
        }
        Assert.isTrue(floor > getFloors(), "Not enough floors ");
        product.setFloor(floor);
        this.products.add(product);
    }

    public void deleteProduct(Product product) {
        if ( space > products.size() && isSpaceAlert()){
            setSpaceAlert(false) ;
        }
        this.products.remove(product);
    }

    public int getSpace() {
        return space - products.size();
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public boolean isSpaceAlert() {
        return spaceAlert;
    }

    public int getFloors() {
        return floors;
    }

    public void setSpaceAlert(boolean spaceAlert) {
        this.spaceAlert = spaceAlert;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    private boolean checkDLC(List<Product> products){
        for(int i = 0; i < products.size(); i++){
            if ( products.get(i).getDlc().after(new Timestamp(new Date().getTime())) ) {
                return false;
            }
        }
        return true ;
    }

}