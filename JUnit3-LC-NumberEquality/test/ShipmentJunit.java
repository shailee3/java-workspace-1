import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ShipmentJunit {
	
	ShipmentBO shipmentBO;
	
	@Before
	public void setup()
	{
		shipmentBO = new ShipmentBO();
	}
	
	@Test
	public void testLeftOutValue() {
		assertTrue(shipmentBO.findLeftOutValue(new double[] {20,40,56,78,99}) == 20);
		assertTrue(shipmentBO.findLeftOutValue(new double[] {20}) == 20);
		assertTrue(shipmentBO.findLeftOutValue(new double[] {20.01,40.99,56.66,78,99.90}) == 20.01);
	}
}
