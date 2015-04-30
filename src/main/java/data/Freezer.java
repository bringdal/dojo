package data;

import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    private PowerType powerType ;
    private Temperature temperature ;
    private List<Product> products = new ArrayList<Product>();
    private int space;
    private boolean spaceAlert = false;
    private boolean working = false ;

    public Freezer(PowerType powerType, Temperature temperature, List<Product> products, int space, boolean working) {
        Assert.isTrue(getTemperature().getValue() >= -30d, "The minimal temperature is 0");
        Assert.isTrue(getTemperature().getValue() <= 0d, "The maximal temperature is 350");
        getTemperature().setHotAlert(-10d);
        this.working = working;
        this.powerType = powerType;
        this.temperature = temperature;
        this.space = space;
        this.products = products;
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

    public void setTemperature(Double temperature) {
        this.temperature.setValue(temperature);
    }

    public void addProduct(Product product) {
        if (products.size() >= space){
            setSpaceAlert(true) ;
        }
        this.products.add(product);
    }

    public void deleteProduct(Product product) {
        if ( space > products.size() && isSpaceAlert()){
            setSpaceAlert(false) ;
        }
        this.products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean isSpaceAlert() {
        return spaceAlert;
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

}
