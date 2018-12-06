import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[])throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of shipments per month :");
		int noOfShipments = Integer.parseInt(buf.readLine());
		CustomerBO customerbo = new CustomerBO();
		System.out.println(customerbo.findValuableCustomerOrNot(noOfShipments));
		
	}

}
