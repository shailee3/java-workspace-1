import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	static List<Shipment> shipmentList;
	static ShipmentBO shipmentBO;
	static SimpleDateFormat simpleDateFormat;
	static
	{
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		shipmentList = ShipmentDAO.shipmentList;
		shipmentBO = new ShipmentBO();
	}
	public static void main(String[] args)  throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Shipment details");
		System.out.printf("%-15s %s\n","Id","Name");
		for(Shipment s : shipmentList)
			System.out.printf("%-15s %s\n",s.getId(),s.getName());
		System.out.println("Enter the number of shipment to insert:");
		int n = Integer.parseInt(br.readLine()),i;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter shipment "+(i+1)+" details:");
			shipmentBO.insertShipmentDetails(shipmentList, br.readLine());
		}
		System.out.println("Inserted Success");
		System.out.println("Shipment details");
		System.out.printf("%-15s %s\n","Id","Name");
		for(Shipment s : shipmentList)
			System.out.printf("%-15s %s\n",s.getId(),s.getName());
		System.out.println("How many shipment you want to delete:");
		n = Integer.parseInt(br.readLine());
		for(i=0;i<n;i++)
		{
			System.out.println("Enter shipment id to delete:");
			shipmentBO.deleteShipmentDetails(shipmentList, new Integer(br.readLine()));
		}
		System.out.println("Deleted success");
		System.out.println("Shipment details");
		System.out.printf("%-15s %s\n","Id","Name");
		for(Shipment s : shipmentList)
			System.out.printf("%-15s %s\n",s.getId(),s.getName());
		
		System.out.println("Enter shipment id to display details");
		Shipment shipment = shipmentBO.filterShipmentById(new Integer(br.readLine()), shipmentList);
		System.out.printf("%-15s %d\n","Id",shipment.getId());
		System.out.printf("%-15s %s\n","Name",shipment.getName());
		System.out.printf("%-15s %d\n","Total weight",shipment.getTotalWeight());
		System.out.printf("%-15s %s","Arrival Date",simpleDateFormat.format(shipment.getArrivalDate()));
	}

}
