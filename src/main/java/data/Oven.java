package data;

/**
 * Created by g.dromer on 10/07/2014.
 */
public class Oven {

    private String brand ;
    private PowerType powerType ;

    public Oven(String brand, PowerType powerType) {
        this.brand = brand;
        this.powerType = powerType;
    }

    public String getBrand() {
        return brand;
    }

    public PowerType getPowerType() {
        return powerType;
    }

}
