import static org.junit.Assert.assertEquals;

import org.junit.*;

public class ShipmentJunit {
	
	ShipmentBO shipment;
	
	@Before	
	public void createObjectForShipmentBO()
	{
		shipment= new ShipmentBO();
	}
	
	@Test
	public void testfindNearestPort()
	{
		int output=shipment.findNearestPort(15, 20);
		assertEquals(1, output);
		
		int output1=shipment.findNearestPort(20, 10);
		assertEquals(-1, output1);
		
		int output2=shipment.findNearestPort(15, 15);
		assertEquals(0, output2);
	}
	
}
