package data;

public class Bulb {

    private boolean switchedOn = false ;
    private BulbType type ;
    private Color color;

    public Bulb(Color color, BulbType type) {
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
