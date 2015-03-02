package service;

import data.Oven;
import data.Product;
import data.Refrigerator;

public interface NiceRobotServiceImpl {

    public void putProductInRefrigerator(Product product, Refrigerator refrigerator) ;

    public void putProductFromRefrigeratorInOvenAndStartCooking(Product product, Refrigerator refrigerator, Oven oven) throws Exception;

    public void ovenMonitoring() ;

}