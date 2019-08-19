import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class ShipmentJUnit {
	
	@Test
	public void testComputeTotalProfit() {
		//fill the code
		ShipmentBO shipmentBO = new ShipmentBO();
		
		List<Shipment> shipmentList = new ArrayList<Shipment>();
		shipmentList.add(new Shipment("test", 10d, 1d, 1d, new Date()));
		
		assertThat(shipmentBO.computeTotalProfit(shipmentList), new EqualityCheck(10d));
	}
}
