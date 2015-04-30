package service.impl;

import data.Oven;
import data.Product;
import data.Refrigerator;
import data.Temperature;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import service.NiceRobotService;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class NiceRobotServiceImpl implements NiceRobotService {

    private Product product ;
    private Refrigerator refrigerator ;
    private Oven oven ;
    private Date date ;
    private Time time ;
    private int thermostat ;

    @Override
    public void putProductInRefrigerator(Product product, Refrigerator refrigerator){
        Assert.isTrue(refrigerator.isSpaceAlert(),"Not enough place, you have to eat a little more");
        Random rand = new Random();
        int randomFloor = rand.nextInt((refrigerator.getFloors() - 1) + 1) + 1 ;
        refrigerator.addProduct(product,randomFloor);
    }

    @Override
    public void putProductFromRefrigeratorInOvenAndStartCooking(Product product, Refrigerator refrigerator, Oven oven) throws Exception{
        int productId = getProductIdInProductsRefrigerator(product, refrigerator) ;

        Temperature ovenTemperature = oven.getTemperature() ;
        oven.setTemperature(product.getCookingTemperature());
        while(oven.getTemperature().getValue() < product.getCookingTemperature().getValue()){
            Thread.sleep(60000);
            continue ;
        }
        refrigerator.getProducts().remove(productId) ;
        oven.putProduct(product);
        oven.setTimer(product.getCookingTime());
        oven.startTimer();
    }

    @Override
    public void ovenMonitoring(){
        oven.getTimer() ;
    }

    private int getProductIdInProductsRefrigerator(Product product, Refrigerator refrigerator) throws Exception{
        List<Product> refrigeratorProducts = refrigerator.getProducts() ;
        for (int i = 0; i < refrigeratorProducts.size() ; i++) {
            if ( refrigeratorProducts.get(i) == product){
                return i ;
            }
        }
        throw new Exception("le réfrigérateur ne dispose plus de ce produit") ;
    }

}