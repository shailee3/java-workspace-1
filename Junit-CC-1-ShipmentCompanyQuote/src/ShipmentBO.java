public class ShipmentBO {
	public String getMinimalCost(int msc,int cosco,int em) {
		if(msc<=cosco && msc<=em)
			return "Mediterranean Shipping Company";
		else if(cosco<=msc && cosco<=em)
			return "China Ocean Shipping Company(COSCO)";
		return "Evergreen Marine";
	}
}