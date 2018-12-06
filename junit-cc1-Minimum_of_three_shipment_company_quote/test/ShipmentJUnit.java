import static org.junit.Assert.assertEquals;

import org.junit.*;


public class ShipmentJUnit {
	ShipmentBO shipmentBO;
	
	@Before
	public void createObjectForShipmentBO() {
		this.shipmentBO = new ShipmentBO();
	}
	
	@Test
	public void testMsc() {
		String expectedOutput = "Mediterranean Shipping Company";
		String output = this.shipmentBO.getMinimalCost(1, 5, 10);
		assertEquals(expectedOutput, output);
		
		String output1 = this.shipmentBO.getMinimalCost(1, 10, 5);
		assertEquals(expectedOutput, output1);
		
		String output2 = this.shipmentBO.getMinimalCost(1, 10, 10);
		assertEquals(expectedOutput, output2);
		
		String output3 = this.shipmentBO.getMinimalCost(5, 5, 10);
		assertEquals(expectedOutput, output3);
				
		String output5 = this.shipmentBO.getMinimalCost(10, 10, 10);
		assertEquals(expectedOutput, output5);
		
		String output6 = this.shipmentBO.getMinimalCost(0, 0, 0);
		assertEquals(expectedOutput, output6);
		
		String output7 = this.shipmentBO.getMinimalCost(-1, -1, -1);
		assertEquals(expectedOutput, output7);
		
		String output8 = this.shipmentBO.getMinimalCost(-1, 0, 0);
		assertEquals(expectedOutput, output8);
		
		String output9 = this.shipmentBO.getMinimalCost(-1, -1, 0);
		assertEquals(expectedOutput, output9);
	}
	
	@Test
	public void testCosco() {
		String expectedOutput = "China Ocean Shipping Company(COSCO)";
		String output = this.shipmentBO.getMinimalCost(10, 5, 10);
		assertEquals(expectedOutput, output);
		
		String output1 = this.shipmentBO.getMinimalCost(11, 5, 10);
		assertEquals(expectedOutput, output1);
		
		String output2 = this.shipmentBO.getMinimalCost(10, 5, 11);
		assertEquals(expectedOutput, output2);
	}
	
	@Test
	public void testEm() {
		String expectedOutput = "Evergreen Marine";
		String output = this.shipmentBO.getMinimalCost(10, 5, 1);
		assertEquals(expectedOutput, output);
	}
}