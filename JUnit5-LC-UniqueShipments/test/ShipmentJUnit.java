import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.util.ArrayList;


public class ShipmentJUnit {
	ShipmentBO shipmentBO;
	
	@Before
	public void createObjectForShipmentBO() {
		shipmentBO = new ShipmentBO();
	}
	
	@Test
	public void testUniqueShipmentByCode() {
		ArrayList<String> shipmentId = new ArrayList<String>();
		shipmentId.add("BLUDR65");
		shipmentId.add("FEDX32");
		shipmentId.add("HALD90");
		shipmentId.add("FEDX87");
		shipmentId.add("BLUDR90");
		assertThat(shipmentBO.findShipmentByCode(shipmentId, "FEDX32"), contains("FEDX32"));
	}
}
