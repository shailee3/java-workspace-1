 import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShipmentJunit {
	ShipmentBO shipmentBO;
	
	
	
	@Before
	public void init() {
		shipmentBO = new ShipmentBO();
	}
	
	@Test
	public void testCalculatAverageWithoutZero() {
		assertTrue(5==shipmentBO.calculateAveragePrice(10, 2));
		assertTrue(20==shipmentBO.calculateAveragePrice(100, 5));
	}

	@Test(expected = ArithmeticException.class)
	public void testCalculateAverageWithZero() {
		assertTrue(5==shipmentBO.calculateAveragePrice(10,0));
	}
	
	@After
	public void destroy() {
		shipmentBO = null;
	}
}