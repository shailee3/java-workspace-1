import java.text.SimpleDateFormat;
import java.util.*;

public class ShipmentBO {
	
	public Shipment filterShipmentById(Integer id,List<Shipment> shipmentList)
	{
		for(Shipment s : shipmentList)
		{
			if(Objects.equals(s.getId(), id))
				return s;
		}
		return null;
	}
	public void deleteShipmentDetails(List<Shipment> shipmentList,Integer id)
	{
		
		int i;
		for(i=0;i<shipmentList.size();i++)
			if(Objects.equals(id,shipmentList.get(i).getId()))
				shipmentList.remove(i);
	}
	
	public void insertShipmentDetails(List<Shipment> shipmentList, 
			String shipmentDetails) throws Exception
	{
		List<Shipment> list = shipmentList;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		list.add(new Shipment(new Integer(shipmentDetails.split(",")[0]),
				shipmentDetails.split(",")[1], sdf.parse(shipmentDetails.split(",")[2]),
				new Integer(shipmentDetails.split(",")[3])));
	}
}
