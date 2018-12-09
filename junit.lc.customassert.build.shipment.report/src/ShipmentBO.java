import java.util.List;

public class ShipmentBO {

	Double computeTotalProfit(List<Shipment> shipmentList) {
		Double profit = 0.0;
		for (Shipment s : shipmentList) {

			profit = profit + s.getProfit();
		}
		return profit;
	}
}
