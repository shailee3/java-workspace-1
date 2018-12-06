import static org.junit.Assert.*;
import org.junit.*;
	

public class CustomerJunit {
	CustomerBO customerbo;
	@Before
	public void createObjectForCustomerBO(){
		customerbo = new CustomerBO();
	}
		
	@Test
	public void testValuableCustomer() {
		String output= customerbo.findValuableCustomerOrNot(21);
		assertEquals("Valuable customer",output);		
	}
	
	@Test
	public void testNonValuableCustomer() {
		String output= customerbo.findValuableCustomerOrNot(20);
		assertEquals("Not a valuable customer",output);		
	}
	
	@Test
	public void testInvalidShipment() {
		String output= customerbo.findValuableCustomerOrNot(-2);
		assertEquals("Invalid Input",output);	
	}

}
