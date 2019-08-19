import java.util.Date;
import java.util.Objects;

public class Shipment {
	    private Integer id;
	    private String name;
	    private int totalWeight;
	    private Date arrivalDate;
	    Shipment(){}
	    public Shipment(Integer id, String name,Date arrivalDate,int totalWeight) {
	        this.id = id;
	        this.name = name;
	        this.arrivalDate=arrivalDate;
	        this.totalWeight=totalWeight;
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }
	    public int getTotalWeight() {
	        return totalWeight;
	    }

	    public void setTotalWeight(int totalWeight) {
	        this.totalWeight = totalWeight;
	    }


	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    public Date getArrivalDate() {
	        return arrivalDate;
	    }

	    public void setArrivalDate(Date arrivalDate) {
	        this.arrivalDate = arrivalDate;
	    }
	   
	    
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Shipment shipment = (Shipment) o;
	        return Objects.equals(id , shipment.id) &&
	                Objects.equals(name, shipment.name) && 
	                this.totalWeight == shipment.totalWeight && 
	                this.arrivalDate.equals(shipment.arrivalDate)
	                ;
	    }
	    
	    
	    
	    
	    
	}
