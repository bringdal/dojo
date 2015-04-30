package service;


public interface HomeService {

    boolean isLightsSwitchedOff() ;

    boolean isTheCooktopSwitchedOff() ;

    boolean isTheRefrigeratorOk() ;

    void doCheckListBeforeLeaving() ;

}