package data;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Alarm {

    private boolean screaming ;

    public Alarm() {
        this.screaming = false;
    }
    public Alarm(boolean screaming) {
        this.screaming = screaming;
    }

    public boolean isScreaming() {
        return screaming;
    }
}
