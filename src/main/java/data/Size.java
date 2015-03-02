package data;

public class Size {

    private Double height ;
    private Double length ;
    private Double width ;

    public Size(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Size(Double height, Double length, Double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
