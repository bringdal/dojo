package data;

import org.springframework.util.Assert;

public class Oven {

    private String brand ;
    private BakeType bakeType ;
    private PowerType powerType ;
    private Temperature temperature ;
    private boolean working = false ;

    public Oven(String brand, BakeType bakeType, PowerType powerType, Temperature temperature, boolean working) {
        Assert.isTrue(temperature.getTemperature() >= 0d, "The minimal temperature is 0");
        Assert.isTrue(temperature.getTemperature() <= 350d, "The maximal temperature is 350");
        temperature.setHotAlert(80d);
        this.brand = brand;
        this.bakeType = bakeType;
        this.powerType = powerType;
        this.temperature = temperature;
        this.working = working;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BakeType getBakeType() {
        return bakeType;
    }

    public void setBakeType(BakeType bakeType) {
        this.bakeType = bakeType;
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

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
