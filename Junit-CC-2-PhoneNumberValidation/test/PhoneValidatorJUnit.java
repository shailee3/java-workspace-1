import static org.junit.Assert.assertEquals;

import org.junit.*;

public class PhoneValidatorJUnit {
	PhoneValidator phoneValidator;
	
	@Before
	public void setup() {
		phoneValidator = new PhoneValidator();
	}
	
	@After
	public void teardown() {
		phoneValidator = null;
	}
	
	@Test
	public void testPhoneValidator_valid() {
		
		assertEquals(true, phoneValidator.validatePhoneNumber("+(91)9876543210"));
		assertEquals(true, phoneValidator.validatePhoneNumber("+(91)8876543210"));
		assertEquals(true, phoneValidator.validatePhoneNumber("+(91)7876543210"));
	}
	
	@Test
	public void testPhoneValidator_invalid() {
		
		assertEquals(false, phoneValidator.validatePhoneNumber("9876543210"));
		assertEquals(false, phoneValidator.validatePhoneNumber("+(91)5876543210"));
		assertEquals(false, phoneValidator.validatePhoneNumber("+(91)78765432"));
		assertEquals(false, phoneValidator.validatePhoneNumber("+(91)78765432123"));
		assertEquals(false, phoneValidator.validatePhoneNumber("+(92)78765432123"));
		assertEquals(false, phoneValidator.validatePhoneNumber("+(81)78765432123"));
		assertEquals(false, phoneValidator.validatePhoneNumber("-(91)78765432123"));
		assertEquals(false, phoneValidator.validatePhoneNumber(""));
		assertEquals(false, phoneValidator.validatePhoneNumber(" "));
		assertEquals(false, phoneValidator.validatePhoneNumber(null));
	}
	
}
