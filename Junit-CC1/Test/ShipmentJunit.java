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
		Assert.assertEquals(30.00, output1);
		double output2= shipmentBO.findRate(10.00,"Priority",2);
		Assert.assertEquals(20.00, output2);
		double output3= shipmentBO.findRate(10.00,"Priority",3);
		Assert.assertEquals(15.00, output3);
	}	
	
	@Test
	public void testNormal() {
		//fill the code
	}
	
}
