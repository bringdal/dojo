package data;

public class Temperature {

    private Double value;
    private Double hotAlertTemperature ;
    private Boolean hotAlert = false ;

    public Temperature(Double value, Boolean hotAlert) {
        this.value = value;
        this.hotAlert = hotAlert;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        setHotAlert(value);
        this.value = value;
    }

    public Double getHotAlertTemperature() {
        return hotAlertTemperature;
    }

    public void setHotAlertTemperature(Double hotAlertTemperature) {
        this.hotAlertTemperature = hotAlertTemperature;
    }

    public Boolean getHotAlert() {
        return hotAlert;
    }

    public void setHotAlert(Double temperature) {
        if (this.value >= temperature) {
            this.hotAlert = true;
        }
        this.hotAlert = false;
    }
}
