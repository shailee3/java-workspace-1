
import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.text.SimpleDateFormat;
import org.hamcrest.Matcher;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ShipmentCheckJunit {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	ShipmentBO sbo;
	@Before
	public void shipmentObjectCreation() {
		sbo= new ShipmentBO();
	}
	
	@Test
	public void testFilterShipmentById() throws Exception {
		assertEquals(null,sbo.filterShipmentById(100, ShipmentDAO.shipmentList));
		assertThat(sbo.filterShipmentById(45,ShipmentDAO.shipmentList),hasProperty("name",equalTo("Laptop")));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testDeleteShipmentDetails() throws Exception
	{
		sbo.deleteShipmentDetails(ShipmentDAO.shipmentList,11);
		assertThat(ShipmentDAO.shipmentList,(Matcher) not(hasItems(hasProperty("name",equalTo("Air Cooler")))));
		sbo.deleteShipmentDetails(ShipmentDAO.shipmentList,12);
		assertThat(ShipmentDAO.shipmentList,(Matcher) not(hasItems(hasProperty("id",equalTo("12")))));
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testInsertShipmentDetails() throws Exception
	{
		Shipment shmt = new Shipment(10,"Air Cooler10",sdf.parse("01/01/2015"),37);
		ShipmentDAO.shipmentList.add(shmt);
		assertThat(ShipmentDAO.shipmentList,(Matcher) hasItems(hasProperty("name",is(equalTo("Air Cooler10")))));
	}

}
