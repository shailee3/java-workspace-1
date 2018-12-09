import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, i;
		String shipmentDetails;
		List<Shipment> shipmentList = new ArrayList<Shipment>();
		System.out.println("Enter the number of shipment:");
		n = Integer.parseInt(br.readLine());
		for (i = 0; i < n; i++) {
			System.out.println("Enter the shipment " + (i + 1) + " details:");
			shipmentDetails = br.readLine();
			String splited[] = shipmentDetails.split(",");
			Date arivalDate = new SimpleDateFormat("dd/MM/yyyy")
					.parse(splited[4]);
			shipmentList.add(new Shipment(splited[0], Double
					.parseDouble(splited[1]), Double.parseDouble(splited[2]),
					Double.parseDouble(splited[3]), arivalDate));
		}
		System.out.println("The total profit is:"
				+ new ShipmentBO().computeTotalProfit(shipmentList));
	}
}
