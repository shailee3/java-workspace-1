import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PhoneValidatorJUnit {
	private PhoneValidator validator;
	
	@Before
	public void init() {
		this.validator = new PhoneValidator();
	}
	
	@After
	public void tear() {
		this.validator = null;
	}
	
	@Test
	public void testPhoneValidator_valid() {
		assertEquals(true, validator.validatePhoneNumber("+(91)9876543210"));
		assertEquals(true, validator.validatePhoneNumber("+(91)8876543210"));
		assertEquals(true, validator.validatePhoneNumber("+(91)7876543210"));
	}
	
	@Test
	public void testPhoneValidator_invalid() {
		assertEquals(false, validator.validatePhoneNumber("(91)9876543210"));
		assertEquals(false, validator.validatePhoneNumber("+919876543210"));
		assertEquals(false, validator.validatePhoneNumber("+(919876543210"));
		assertEquals(false, validator.validatePhoneNumber("+91)9876543210"));
		assertEquals(false, validator.validatePhoneNumber("9876543210"));
		assertEquals(false, validator.validatePhoneNumber("+(91)1876543210"));
		assertEquals(false, validator.validatePhoneNumber("+(91)98765432"));
		assertEquals(false, validator.validatePhoneNumber("asdad"));
		assertEquals(false, validator.validatePhoneNumber("+(91)987654321a"));
		assertEquals(false, validator.validatePhoneNumber("+(91)98765432131231231"));
		assertEquals(false, validator.validatePhoneNumber(""));
		assertEquals(false, validator.validatePhoneNumber("+(91)987654321 "));
	}
}
