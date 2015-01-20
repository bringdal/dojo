package data;

public class Cooker {

    private Hob hob;
    private Oven oven ;

    public Cooker(Hob hob, Oven oven) {
        this.hob = hob;
        this.oven = oven;
    }

    public Hob getHob() {
        return hob;
    }

    public Oven getOven() {
        return oven;
    }

}
