import java.util.List;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		ShipmentEntityBO shipmentEntityBO = new ShipmentEntityBO();
		System.out.println("Enter the number of shipment entity :");
		Integer n = Integer.parseInt(buff.readLine());
		ArrayList<ShipmentEntity> list = new ArrayList<ShipmentEntity>();
		System.out.println("Enter Shipment entity details :");
		for(int i=0;i<n;i++) {
			String[] values = buff.readLine().split(",");
			list.add(new ShipmentEntity(Integer.parseInt(values[0]),values[1],values[2],Long.parseLong(values[3]),values[4]));
		}
		System.out.println("Enter the type to filter:");
		List<ShipmentEntity> filterdList = shipmentEntityBO.
		filterShipmentByType(list, buff.readLine());
		System.out.format("Shipment entity details :\n%-15s %-15s %-15s %-15s %s\n",
				"ID","Name","Account Number","Credit Limit","Type");
		for(ShipmentEntity shipmentEntity : filterdList)
		{
			System.out.format("%-15d %-15s %-15s %-15s %s\n",
					shipmentEntity.getId(),shipmentEntity.getName(),
					shipmentEntity.getAccountNumber(),shipmentEntity.getCreditLimit(),
					shipmentEntity.getType());
		}
		
	}
}