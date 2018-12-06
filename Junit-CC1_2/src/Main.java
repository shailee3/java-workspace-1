  import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		String deliveryType = null;
		int noOfDays;
		ShipmentBO shipmentBO = new ShipmentBO();
		double rate;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the charge for shipping");
		rate = Double.parseDouble(br.readLine());
		System.out.println("Mode of delivery (Priority/Normal)");
		deliveryType = br.readLine();
		if(deliveryType.equals("Priority"))
		{
			System.out.println("Enter the number of days to deliver the product");
			noOfDays = Integer.parseInt(br.readLine());
			rate = shipmentBO.findRate(rate, deliveryType, noOfDays);
		}
		System.out.printf("Net Charge : %.2f",rate);
	}

}
