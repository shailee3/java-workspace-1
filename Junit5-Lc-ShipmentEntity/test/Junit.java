import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasProperty;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class Junit {
	ShipmentEntityBO shipmentEntityBO;
	
	@Before
	public void createObjectForShipmentEntity() {
		shipmentEntityBO = new ShipmentEntityBO();
	}
	
	@Test
	public void testListofShipmentEntity() {
		ShipmentEntity se1=new ShipmentEntity(1, "Shipment1", "1234", (long) 150, "India");
		ShipmentEntity se2=new ShipmentEntity(2, "Shipment2", "12345", (long) 150, "India");
		List<ShipmentEntity> se = new ArrayList<ShipmentEntity>();
		se.add(se1);
		se.add(se2);
		
		shipmentEntityBO.addShipmentEntityToList(se, "3,'Shipment3','123456',150,'India'");
		assertThat(se,containsInAnyOrder(hasProperty("id",equalTo(1)),hasProperty("id",equalTo(2)),hasProperty("id",equalTo(3))));
		assertThat(se,hasItem(se1));
	}
}
