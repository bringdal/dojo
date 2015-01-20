package data;

public class Alarm {

    private boolean screaming  ;

    public Alarm() {
        this.screaming = false;
    }
    public Alarm(boolean screaming) {
        this.screaming = screaming;
    }

    public boolean isScreaming() {
        return screaming;
    }

    public void setScreaming(boolean screaming) {
        this.screaming = screaming;
    }
}
