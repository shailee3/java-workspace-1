import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.*;

public class CustomerJUnit {
	CustomerBO customer;

	@Before
	public void setUp() {
		customer = new CustomerBO();
	}

	@Test
	public void testFindNextCustomerId() {
		Integer[] a = {21,34,65,1,3,76,43};
		 Integer[] b = {21};
		 assertThat(customer.findNextCustomerId(7, a), is(76));
		 assertThat(customer.findNextCustomerId(1, b), is(21));
		 assertThat(customer.findNextCustomerId(6, new Integer[] { 1,4,6,7,8,10 }), is(10));
	}
	
	@After
	public void tear() {
		this.customer = null;
	}
}
