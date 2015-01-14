package data;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Refrigerator {

    private PowerType powerType ;
    private boolean working = false ;

    public Refrigerator() {
        powerType = PowerType.ELECTRICITY ;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
