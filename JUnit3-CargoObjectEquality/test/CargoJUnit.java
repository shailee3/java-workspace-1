import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.Before;
import org.junit.Test;

public class CargoJUnit {
	Cargo cargo;
	CargoBO cargoBO;
	
	@Before
	public void createObjectForCargo() {
		cargoBO = new CargoBO();
	}
	
	@Test
	public void testCargoDetails() {
		cargo = cargoBO.cargoDetails("automobile", "truck", 500, 700);
		assertTrue(EqualsBuilder.reflectionEquals(new Cargo("automobile", "truck", 500, 700), cargo));
	}
}