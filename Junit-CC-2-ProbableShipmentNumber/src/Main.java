import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[])throws IOException {
		ShipmentBO shipmentBO = new ShipmentBO();
		List<Integer> resultantList;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range for shipment numbers :");
		Integer srange = Integer.parseInt(buf.readLine());
		Integer erange = Integer.parseInt(buf.readLine());
		System.out.println("Possible shipment numbers :");
		resultantList = shipmentBO.findAllPossibleShipmentNumber(srange, erange);
		for(int i : resultantList)
			System.out.print(i+",");
		System.out.println(resultantList.size());
	}
}
