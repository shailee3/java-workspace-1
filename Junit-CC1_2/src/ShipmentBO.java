
public class ShipmentBO {
	public Double findRate(Double rate,String deliveryType,Integer noOfDays) {
		if(noOfDays == 1)
			rate = rate * 3;
		else if(noOfDays == 2)
			rate = rate * 2;
		else
			rate = rate * 1.5;
		return rate;
	}
	
	public Double findRate(Double rate,String deliveryType) {
		return rate;
	}
}
