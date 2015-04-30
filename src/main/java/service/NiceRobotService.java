package service;

import data.Oven;
import data.Product;
import data.Refrigerator;

public interface NiceRobotService {

    void putProductInRefrigerator(Product product, Refrigerator refrigerator) ;

    void putProductFromRefrigeratorInOvenAndStartCooking(Product product, Refrigerator refrigerator, Oven oven) throws Exception;

    void ovenMonitoring() ;

}