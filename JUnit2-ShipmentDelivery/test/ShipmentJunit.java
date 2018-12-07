import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ShipmentJunit {
	
	ShipmentBO shipmentBO;
	
	@Before
	public void init() {
		shipmentBO = new ShipmentBO();
	}
	
	@Test
	public void testDeliveredOnTime() throws ParseException {
		assertEquals("Delivered on time",shipmentBO.findDeliveryType("2017-10-25", "2017-10-25"));
	}
	
	@Test
	public void testDeliveredOnDelay() throws ParseException {
		assertEquals("Delayed",shipmentBO.findDeliveryType("2017-10-25", "2017-10-26"));
	}
	
	@Test
	public void testDeliveredInAdvance() throws ParseException {
		assertEquals("Delivered in advance",shipmentBO.findDeliveryType("2017-10-25", "2017-10-22"));
	}
	
//	@Test
//	public void testOutOfDateDelivery() throws ParseException{
//		//fill the code
//	}
	
	@After
	public void destroy() {
		shipmentBO = null;
	}
}
