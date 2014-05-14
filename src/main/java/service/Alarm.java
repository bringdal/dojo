package service;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Alarm {

    private boolean Screaming ;

    public Alarm(Boolean screaming) {
        Screaming = screaming;
    }

    public Boolean getScreaming() {
        return Screaming;
    }

    public void setScreaming(Boolean screaming) {
        Screaming = screaming;
    }
}
