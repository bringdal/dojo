package controller;

import enumeration.AmpouleTypeENUM;

/**
 * Created by g.dromer on 09/04/14.
 */
public class Ampoule {

    private boolean status = false ;
    private AmpouleTypeENUM type ;

    public Ampoule(AmpouleTypeENUM type, boolean status ) {
        this.status = status;
        this.type = type;
    }

    public AmpouleTypeENUM getType() {
        return type;
    }

    public void setType(AmpouleTypeENUM type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
