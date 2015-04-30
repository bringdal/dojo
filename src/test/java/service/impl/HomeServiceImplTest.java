package service.impl;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeServiceImplTest {

    @InjectMocks
    private HomeServiceImpl homeService ;

    @BeforeTest
    public void main(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testIsLightsSwitchedOff() throws Exception {
        Assert.isTrue(homeService.isLightsSwitchedOff()) ;
    }

    @Test
    public void testIsTheCooktopSwitchedOff() throws Exception {
        Assert.isTrue(homeService.isTheCooktopSwitchedOff()) ;
    }

    @Test
    public void testIsTheRefrigeratorOk() throws Exception {
        Assert.isTrue(homeService.isTheRefrigeratorOk()) ;
    }

    @Test
    public void testDoCheckListBeforeLeaving() throws Exception {
        homeService.doCheckListBeforeLeaving() ;
    }

}