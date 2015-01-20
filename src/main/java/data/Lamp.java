package data;

public class Lamp {

    private Bulb bulb;
    private boolean power;
    private LampType type;
    private boolean working = false ;

    public Lamp(Bulb bulb, boolean power, LampType type, int floor, Room room) {
        bulb.setSwitchedOn(power);
        this.bulb = bulb ;
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

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
