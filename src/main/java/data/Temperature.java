package data;

public class Temperature {

    private Double temperature ;
    private Boolean hotAlert = false ;

    public Temperature(Double temperature, Boolean hotAlert) {
        this.temperature = temperature;
        this.hotAlert = hotAlert;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Boolean getHotAlert() {
        return hotAlert;
    }

    public void setHotAlert(Double temperature) {
        if (this.temperature >= temperature) {
            this.hotAlert = true;
        }
    }
}
