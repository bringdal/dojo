package data;

import org.springframework.util.Assert;

public class Hob {

    private int cookingPower ; // puissance de cuisson
    private PowerType powerTypeFire ; // type d'alimentation
    private Temperature temperature ;
    private Boolean hotAlert = false ;
    private boolean working = false ;

    public Hob(int cookingPower, PowerType powerTypeFire, Temperature temperature, Boolean hotAlert, boolean working) {
        Assert.isTrue(temperature.getValue() >= 0d, "The minimal temperature is 0");
        Assert.isTrue(temperature.getValue() <= 200d, "The maximal temperature is 350");
        temperature.setHotAlert(35d);
        this.cookingPower = cookingPower;
        this.powerTypeFire = powerTypeFire;
        this.temperature = temperature;
        this.hotAlert = hotAlert;
        this.working = working;
    }

    public int getPowerIndex() {
        return cookingPower;
    }

    public void setPowerIndex(int powerIndex) {
        this.cookingPower = powerIndex;
    }

    public PowerType getPowerTypeFire() {
        return powerTypeFire;
    }

    public void setPowerTypeFire(PowerType powerTypeFire) {
        this.powerTypeFire = powerTypeFire;
    }

    public Boolean getHotAlert() {
        return temperature.getHotAlert();
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

}
