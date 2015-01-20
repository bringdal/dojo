package data;

import com.sun.jmx.snmp.Timestamp;

import java.util.Date;

public class Product {

    private Boolean bio = false ;
    private Timestamp dlc ; //date limite de consommation
    private int floor ;
    private String name ;
    private ProductType productType ;

    public Product(Boolean bio, Timestamp dlc, int floor, String name, ProductType productType) {
        this.bio = bio;
        this.dlc = dlc;
        this.floor = floor;
        this.name = name;
        this.productType = productType;
    }

    public Boolean getBio() {
        return bio;
    }

    public void setBio(Boolean bio) {
        this.bio = bio;
    }

    public Date getDlc() {
        return dlc.getDate();
    }

    public void setDlc(Timestamp dlc) {
        this.dlc = dlc;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
