package data;

import java.util.Map;

/**
 * Created by g.dromer on 10/07/2014.
 */
public class Hob {

    private Map map ;

    public Hob(PowerType powerTypeFire1, PowerType powerTypeFire2, PowerType powerTypeFire3, PowerType powerTypeFire4) {
        map.put(1,powerTypeFire1) ;
        map.put(2,powerTypeFire2) ;
        map.put(3,powerTypeFire3) ;
        map.put(4,powerTypeFire4) ;
    }

    public Map getMap() {
        return map;
    }

    public void modifyMap(int fireKey, PowerType powerType) {
        map.put(fireKey, powerType) ;
    }
}
