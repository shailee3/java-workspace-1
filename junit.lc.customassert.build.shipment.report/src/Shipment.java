import java.util.Date;

public class Shipment {
    
    private String name;
    private Double profit;
    private Double weight;
    private Double volume;
    private Date arrivalDate;

    public Shipment(String name, Double profit, Double weight, Double volume, Date arrivalDate) {
        this.name = name;
        this.profit = profit;
        this.weight = weight;
        this.volume = volume;
        this.arrivalDate = arrivalDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    
    
    
}
