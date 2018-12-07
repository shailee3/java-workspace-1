import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShipmentJUnit {
	double delta = 0.01;
	ShipmentBO shipment;

	@Before
	public void setup() {
		shipment = new ShipmentBO();
	}

	@Test
	public void testCalculateAverage() {
		assertEquals(0, shipment.calculateAverage(0, 0, 0, 0),0);
		assertEquals(10.7, shipment.calculateAverage(1, 11.1, 2, 10.5),delta);
	}
}
