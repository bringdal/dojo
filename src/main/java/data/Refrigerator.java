package data;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Refrigerator {

    private PowerType powerType ;

    public Refrigerator() {
        powerType = PowerType.ELECTRICITY ;
    }

    public PowerType getPowerType() {
        return powerType;
    }

}
