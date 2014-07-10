package data;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Cooker {

    private Fire fire;
    private Oven oven ;

    public Cooker(Fire fire, Oven oven) {
        this.fire = fire;
        this.oven = oven;
    }

    public Fire getFire() {
        return fire;
    }

    public Oven getOven() {
        return oven;
    }
}
