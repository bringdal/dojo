package data;

import java.util.List;

public class Freezer {

    private PowerType powerType ;
    private Temperature temperature ;
    private List<Product> products ;
    private boolean working = false ;

    public Freezer(PowerType powerType, Temperature temperature, List<Product> products, boolean working) {
        this.powerType = powerType;
        this.temperature = temperature;
        this.products = products;
        this.working = working;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public void setPowerType(PowerType powerType) {
        this.powerType = powerType;
    }

    public Double getTemperature() {
        return temperature.getTemperature();
    }

    public void setTemperature(Double temperature) {
        this.temperature.setTemperature(temperature);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }


}
