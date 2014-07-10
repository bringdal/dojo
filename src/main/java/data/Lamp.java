package data;

/**
 * Created by g.dromer on 09/04/14.
 */

public class Lamp {

    private Bulb bulb;
    private boolean power;
    private LampType type;

    public Lamp(BulbType bulbType, boolean power, LampType type, Color color, int floor, Room room) {
        this.bulb = new Bulb(color, bulbType) ;
        bulb.setSwitchedOn(power);
        this.power = power;
        this.type = type;
    }

    public boolean isPower() {
        return power;
    }

    public Bulb getBulb() {
        return bulb;
    }

    public LampType getType() {
        return type;
    }

    public void setPower(boolean power) {
        this.power = power;
        bulb.setSwitchedOn(power);
    }
}
