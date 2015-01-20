package data;

import java.util.Map;

public class Cooktop {

    private Map hobs ;

    public void addPowerTypeFire(Integer fireNumber, Hob hob){
        hobs.put(fireNumber, hob) ;
    }

    public Map getMap() {
        return hobs ;
    }

    public void modifyMap(int fireKey, Hob hob) {
        hobs.put(fireKey, hob) ;
    }

}
