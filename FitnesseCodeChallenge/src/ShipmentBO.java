public class ShipmentBO {
	int countries, shipmentpermonth;
	public void setCountries(int countries) {
		this.countries = countries;
	}
	public void setShipmentpermonth(int shipmentpermonth) {
		this.shipmentpermonth = shipmentpermonth;
	}
	public String evaluateGrade() {
		String grade = "";
		if (countries < 0 || shipmentpermonth < 0) {
			grade = "Invalid Input";
		} else {
			if (countries > 150 && shipmentpermonth > 1500)
				grade = "A";
			else if (countries > 125 && shipmentpermonth > 1200)
				grade = "B";
			else if (countries > 100 && shipmentpermonth > 1000)
				grade = "C";
			else if (countries > 75 && shipmentpermonth > 700)
				grade = "D";
			else
				grade = "E";
		}
		return grade;
	}
}
