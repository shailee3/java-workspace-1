import static org.junit.Assert.assertEquals;

import org.junit.*;

public class ShipmentJunit {
	
	ShipmentBO shipmentBO;
	
	@Before
	public void createObjectForShipmentBO() {
		shipmentBO= new ShipmentBO();
	}
	
	@Test
	public void testPriority() {

		double output1= shipmentBO.findRate(10.00,"Priority",1);
		assertEquals(30.00, output1, 0.01);
		double output2= shipmentBO.findRate(10.00,"Priority",2);
		assertEquals(20.00, output2, 0.01);
		double output3= shipmentBO.findRate(10.00,"Priority",3);
		assertEquals(15.00, output3, 0.01);
	}
	
	
	public void testNormal() {
		//fill the code
		double output3= shipmentBO.findRate(10.00,"Normal",3);
		assertEquals(10.00, output3, 0.01);
	}
	
}
