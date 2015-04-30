package service.impl;

import data.*;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NiceRobotServiceImplTest {

    Calendar calendar = Calendar.getInstance();
    java.util.Date now = calendar.getTime();
    Timestamp dlc = new Timestamp(now.getTime());
    Temperature refrigeratorTemperature = new Temperature(7D, false);
    List<Product> products = new ArrayList<Product>();

    @InjectMocks
    private NiceRobotServiceImpl niceRobotService ;

    @BeforeTest
    public void main(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPutProductInRefrigerator() throws Exception {
        Product product = new Product(true, dlc, "name", ProductType.FISH);
        Refrigerator refrigerator = new Refrigerator(PowerType.ELECTRICITY, refrigeratorTemperature, products, 50, true, 5);
        Assert.isTrue(refrigerator.getProducts().size() == 0);
        products.add(product) ;
        niceRobotService.putProductInRefrigerator(product, refrigerator);

        Assert.isTrue(refrigerator.getProducts().size() == 1);
    }

    @Test
    public void testOvenMonitoring() throws Exception {

    }

}