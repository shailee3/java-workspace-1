import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

public class ShipmentJunit {

	private ShipmentBO shipmentBO;

	@Before
	public void createObjectForEmailGenerator() {
		shipmentBO = new ShipmentBO();

	}

	@SuppressWarnings("deprecation")
	@Test
	public void testEmailId() {
		assertThat(shipmentBO.generateEmailId("Maddy Anderson", new Date("10/10/1997")),is("maddyanderson1997@gmail.com"));
		assertThat(shipmentBO.generateEmailId("MARTIN Blake", new Date("10/10/1992")),is("martinblake1992@gmail.com"));
		assertThat(shipmentBO.generateEmailId("MaROOn FiVE", new Date("10/10/2011")),is("maroonfive2011@gmail.com"));
		assertThat(shipmentBO.generateEmailId("mark hellary", new Date("10/10/2000")),is("markhellary2000@gmail.com"));	
	}

}