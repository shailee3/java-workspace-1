import static org.junit.Assert.assertEquals;

import org.junit.*;

public class ShipmentJUnit {
	ShipmentBO shipmentBO;
	
	@Before
	public void createObjectForShipmentBO() {
		shipmentBO = new ShipmentBO();
	}
	
	@Test
	public void testMsc() {
		assertEquals("Mediterranean Shipping Company",shipmentBO.getMinimalCost(100, 200, 300));
		assertEquals("Mediterranean Shipping Company",shipmentBO.getMinimalCost(100, 300, 200));
		assertEquals("Mediterranean Shipping Company",shipmentBO.getMinimalCost(100, 200, 100));
		assertEquals("Mediterranean Shipping Company",shipmentBO.getMinimalCost(100, 100, 300));
		assertEquals("Mediterranean Shipping Company",shipmentBO.getMinimalCost(100, 100, 100));
	}
	
	@Test
	public void testCosco() {
		assertEquals("China Ocean Shipping Company(COSCO)",shipmentBO.getMinimalCost(200, 100, 300));
		assertEquals("China Ocean Shipping Company(COSCO)",shipmentBO.getMinimalCost(200, 100, 100));
		assertEquals("China Ocean Shipping Company(COSCO)",shipmentBO.getMinimalCost(200, 100, 200));
	}
	
	@Test
	public void testEm() {
		assertEquals("Evergreen Marine",shipmentBO.getMinimalCost(200, 300, 100));
		assertEquals("Evergreen Marine",shipmentBO.getMinimalCost(200, 200, 100));
	}
}