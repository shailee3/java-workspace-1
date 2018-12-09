import java.util.*;
public class ShipmentEntityBO  {
    
	public List<ShipmentEntity> filterShipmentByType(List<ShipmentEntity> shipmentList, String type)
	{
		
		List<ShipmentEntity> list = new ArrayList<ShipmentEntity>();
		for(ShipmentEntity shipmentEntity : shipmentList)
		{
			if(shipmentEntity.getType().equals(type))
				list.add(shipmentEntity);
		}
		return list;
	}
	
}