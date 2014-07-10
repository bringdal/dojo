package data;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Bulb {

    private boolean switchedOn ;
    private BulbType type ;
    private Color color;

    public Bulb(Color color, BulbType type) {
        setSwitchedOn(false) ;
        this.color = color;
        this.type = type;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public BulbType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }
}
