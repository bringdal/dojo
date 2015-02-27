package data;

import org.springframework.util.Assert;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class niceRobot {

    private Product product ;
    private Refrigerator refrigerator ;
    private Oven oven ;
    private Date date ;
    private Time time ;
    private int thermostat ;

    public niceRobot(Room room, Product product, Refrigerator refrigerator, Oven oven, Date date, Time time, int thermostat) {
        this.product = product;
        this.refrigerator = refrigerator;
        this.oven = oven;
        this.date = date;
        this.time = time;
        this.thermostat = thermostat;
    }

    public void putProductInRefrigerator(Product product, Refrigerator refrigerator){
        Assert.isTrue(refrigerator.isSpaceAlert(),"Not enought place, you have to eat a little more");
        Random rand = new Random();
        int randomFloor = rand.nextInt((refrigerator.getFloors() - 1) + 1) + 1 ;
        refrigerator.addProduct(product,randomFloor);
    }

    public void putProductFromRefrigeratorInOven(Product product, Refrigerator refrigerator, Oven oven) throws Exception{
        int productId = getProductIdInProductsRefrigerator(product, refrigerator) ;

        Temperature ovenTemperature = oven.getTemperature() ;
        oven.setTemperature(product.getCookingTemperature());
        oven.setTimer(product.getCookingTime());
        while(oven.getTemperature().getValue() < product.getCookingTemperature().getValue()){
            Thread.sleep(60000);
            continue ;
        }
        refrigerator.getProducts().remove(productId) ;
        oven.putProduct(product);

    }

    public void ovenMonitoring(){
        oven.getTimer()
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