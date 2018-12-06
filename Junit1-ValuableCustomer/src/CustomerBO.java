
public class CustomerBO {

	public String findValuableCustomerOrNot(int noOfShipments) {
		if(noOfShipments > 0){
			if(noOfShipments > 20)
				return "Valuable customer";
			else
				return "Not a valuable customer";
		}else{
			return "Invalid Input";
		}
		
	}

}
