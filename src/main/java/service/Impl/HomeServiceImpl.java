package service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public boolean isLightsSwitchedOff() {
        // TODO
        return false;
    }

    @Override
    public boolean isTheCooktopSwitchedOff() {
        // TODO
        return false;
    }

    @Override
    public boolean isTheRefrigeratorOk() {
        // TODO
        return false;
    }

    @Override
    public void doCheckListBeforeLeaving() {
        Assert.isTrue(isLightsSwitchedOff() == true, "ATTENTION : toutes les lumières ne sont pas éteintes") ;
        Assert.isTrue(isTheCooktopSwitchedOff() == true,"ATTENTION : une plaque chauffante est toujours allumée") ;
        Assert.isTrue(isTheRefrigeratorOk() == true,"ATTENTION : le réfrigérateur est coupé ou la porte est ouverte") ;
    }

}