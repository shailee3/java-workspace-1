import org.junit.*;
import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;


public class ShipmentJunit {
	ShipmentEntityBO shipmentEntityBO;
	@Before
	public void ShipmentEntityObjectCreation()
	{
		shipmentEntityBO=new ShipmentEntityBO();
	}
	@Test
	public void testShipmentByShipper()
	{
		List<ShipmentEntity> list = new ArrayList<ShipmentEntity>();
		list.add(new ShipmentEntity(101,"Hill gosling","2365265667",(long) 8000,"Agent")); 
		list.add(new ShipmentEntity(105,"Ran Karmer","1514154212",(long) 40000,"Agent")); 
		list.add(new ShipmentEntity(106,"Madhu","982387402",(long) 20000,"Shipper")); 
		assertThat(shipmentEntityBO.filterShipmentByType(list, "Shipper"),hasItem(new ShipmentEntity(106,"Madhu","982387402",(long) 20000,"Shipper")));
		assertThat(shipmentEntityBO.filterShipmentByType(list, "Shipper"),hasSize(1));
	}
	@Test
	public void testShipmentByAgent()
	{
		List<ShipmentEntity> list = new ArrayList<ShipmentEntity>();
		list.add(new ShipmentEntity(101,"Hill gosling","2365265667",(long) 8000,"Agent")); 
		list.add(new ShipmentEntity(105,"Ran Karmer","1514154212",(long) 40000,"Agent")); 
		list.add(new ShipmentEntity(106,"Madhu","982387402",(long) 20000,"Shipper")); 
		assertThat(shipmentEntityBO.filterShipmentByType(list, "Agent"),hasItems(new ShipmentEntity(101,"Hill gosling","2365265667",(long) 8000,"Agent"),new ShipmentEntity(105,"Ran Karmer","1514154212",(long) 40000,"Agent")));
		assertThat(shipmentEntityBO.filterShipmentByType(list, "Agent"),hasSize(2));

	}
	
}
