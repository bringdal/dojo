package data;


import java.sql.Timestamp;

public class Product {

    private Boolean bio = false ;
    private Timestamp dlc ; //date limite de consommation
    private int floor ;
    private String name ;
    private ProductType productType ;
    private Temperature cookingTemperature ;
    private Temperature conservationTemperature ;
    private Timestamp cookingTime ;

    public Product(Boolean bio, Timestamp dlc, String name, ProductType productType) {
        this.bio = bio;
        this.dlc = dlc;
        this.name = name;
        this.productType = productType;
    }

    public Product(Boolean bio, Timestamp dlc, int floor, String name, ProductType productType, Temperature cookingTemperature, Temperature conservationTemperature, Timestamp cookingTime) {
        this.bio = bio;
        this.dlc = dlc;
        this.floor = floor;
        this.name = name;
        this.productType = productType;
        this.cookingTemperature = cookingTemperature;
        this.conservationTemperature = conservationTemperature;
        this.cookingTime = cookingTime;
    }

    public Boolean getBio() {
        return bio;
    }

    public void setBio(Boolean bio) {
        this.bio = bio;
    }

    public Timestamp getDlc() {
        return dlc ;
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


    public Temperature getCookingTemperature() {
        return cookingTemperature;
    }

    public void setCookingTemperature(Temperature cookingTemperature) {
        this.cookingTemperature = cookingTemperature;
    }

    public Temperature getConservationTemperature() {
        return conservationTemperature;
    }

    public void setConservationTemperature(Temperature conservationTemperature) {
        this.conservationTemperature = conservationTemperature;
    }

    public Timestamp getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(Timestamp cookingTime) {
        this.cookingTime = cookingTime;
    }
}
