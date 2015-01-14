package data;

import java.util.Map;

/**
 * Created by g.dromer on 10/07/2014.
 */
public class Hob {

    private Map map ;
    private Double temperature ;
    private boolean working = false ;

    public void addPowerTypeFire(Integer fireNumber, PowerType powerTypeFire){
        map.put(fireNumber, powerTypeFire) ;
    }

    public Map getMap() {
        return map ;
    }

    public void modifyMap(int fireKey, PowerType powerType) {
        map.put(fireKey, powerType) ;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
