package data;

import org.joda.time.DateTime;
import org.springframework.util.Assert;

import java.sql.Timestamp;

public class Oven {

    private String brand ;
    private BakeType bakeType ;
    private PowerType powerType ;
    private Temperature temperature ;
    private DateTime date;
    private Timestamp timer;
    private Boolean endOfCooking = null ;
    private Boolean ring = false ;
    private int thermostat = 0 ;
    private boolean working = false ;
    private Product product ;

    public Oven(String brand, BakeType bakeType, PowerType powerType, boolean working) {
        this.brand = brand;
        this.date = new DateTime();
        this.bakeType = bakeType;
        this.powerType = powerType;
        temperature.setHotAlert(80d);
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

        Assert.isTrue(temperature.getValue() >= 0d, "The minimal temperature is 0");
        Assert.isTrue(temperature.getValue() <= 350d, "The maximal temperature is 350");
        this.temperature = temperature;
    }

    public DateTime getDate() {
        return date;
    }

    public Timestamp getTimer() {
        return timer;
    }

    public void setTimer(Timestamp timer) {
        this.timer = timer;
    }

    public void startTimer() throws Exception{
        Assert.isTrue(this.timer != null, "il n'y a pas de timer");
        Thread.sleep(this.timer.getTime());
        setTimer(null) ;
        setEndOfCooking(true) ;
    }

    public Boolean getEndOfCooking() {
        return endOfCooking;
    }

    public void setEndOfCooking(Boolean endOfCooking) {
        this.endOfCooking = endOfCooking;
    }

    public int getThermostat() {
        return thermostat;
    }

    public void setThermostat(int thermostat) {
        this.thermostat = thermostat;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public Product getProduct() {
        return product;
    }

    public void putProduct(Product product) {
        this.product = product;
    }

    public void removeProduct() {
        this.product = null;
    }

    public Boolean getRing() {
        return ring;
    }

    private void setRing() {
        this.ring = true;
    }
}