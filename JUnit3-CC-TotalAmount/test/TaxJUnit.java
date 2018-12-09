import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class TaxJUnit {
	TaxBO taxBO;
	
	@Before
	public void createObjectForTaxBO() {
		taxBO = new TaxBO();
	}
	
	@Test
	public void testTaxes() {
		assertEquals(105.00, taxBO.calculateNetAmount(1, 100.00), 0.001);
		assertEquals(103.00, taxBO.calculateNetAmount(2, 100.00), 0.001);
		assertEquals(00.00, taxBO.calculateNetAmount(1, 00.00), 0.00);
		assertEquals(00.00, taxBO.calculateNetAmount(2, 00.00), 0.00);
	}
}