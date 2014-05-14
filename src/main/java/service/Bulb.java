package service;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Bulb {

    private boolean switchedOn = false ;
    private BulbType type ;

    public Bulb(BulbType type, boolean switchedOn) {
        this.switchedOn = switchedOn;
        this.type = type;
    }

    public BulbType getType() {
        return type;
    }

    public void setType(BulbType type) {
        this.type = type;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }
}
