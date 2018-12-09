import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.TypeSafeMatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InvoiceJunit {

	InvoiceBO invoiceBO;
	
	@Before
	public void init() {
		invoiceBO=new InvoiceBO();
	}
	
	@Test
	public void testGeneratedInvoiceId() {
		assertThat(invoiceBO.generateInvoiceId("CU1"), CheckInvoiceId.checkInvoice("CUR00001"));
		assertThat(invoiceBO.generateInvoiceId("CU01"), CheckInvoiceId.checkInvoice("CUR00001"));
		assertThat(invoiceBO.generateInvoiceId("CU001"), CheckInvoiceId.checkInvoice("CUR00001"));
		assertThat(invoiceBO.generateInvoiceId("CU0001"), CheckInvoiceId.checkInvoice("CUR00001"));
		assertThat(invoiceBO.generateInvoiceId("CU00001"), CheckInvoiceId.checkInvoice("CUR00001"));
		assertThat(invoiceBO.generateInvoiceId("CU111"), CheckInvoiceId.checkInvoice("CUR00111"));
		assertThat(invoiceBO.generateInvoiceId("CU11"), CheckInvoiceId.checkInvoice("CUR00011"));
		assertThat(invoiceBO.generateInvoiceId("CU1111"), CheckInvoiceId.checkInvoice("CUR01111"));
		assertThat(invoiceBO.generateInvoiceId("CU11111"), CheckInvoiceId.checkInvoice("CUR11111"));

		assertThat(invoiceBO.generateInvoiceId("AT2"), CheckInvoiceId.checkInvoice("AGT00002"));
		assertThat(invoiceBO.generateInvoiceId("AT02"), CheckInvoiceId.checkInvoice("AGT00002"));
		assertThat(invoiceBO.generateInvoiceId("AT002"), CheckInvoiceId.checkInvoice("AGT00002"));
		assertThat(invoiceBO.generateInvoiceId("AT0002"), CheckInvoiceId.checkInvoice("AGT00002"));
		assertThat(invoiceBO.generateInvoiceId("AT00002"), CheckInvoiceId.checkInvoice("AGT00002"));
		assertThat(invoiceBO.generateInvoiceId("AT222"), CheckInvoiceId.checkInvoice("AGT00222"));
		assertThat(invoiceBO.generateInvoiceId("AT22"), CheckInvoiceId.checkInvoice("AGT00022"));
		assertThat(invoiceBO.generateInvoiceId("AT2222"), CheckInvoiceId.checkInvoice("AGT02222"));
		assertThat(invoiceBO.generateInvoiceId("AT22222"), CheckInvoiceId.checkInvoice("AGT22222"));

		assertThat(invoiceBO.generateInvoiceId("CY9"), CheckInvoiceId.checkInvoice("CMY00009"));
		assertThat(invoiceBO.generateInvoiceId("CY09"), CheckInvoiceId.checkInvoice("CMY00009"));
		assertThat(invoiceBO.generateInvoiceId("CY009"), CheckInvoiceId.checkInvoice("CMY00009"));
		assertThat(invoiceBO.generateInvoiceId("CY0009"), CheckInvoiceId.checkInvoice("CMY00009"));
		assertThat(invoiceBO.generateInvoiceId("CY999"), CheckInvoiceId.checkInvoice("CMY00999"));
		assertThat(invoiceBO.generateInvoiceId("CY99"), CheckInvoiceId.checkInvoice("CMY00099"));
		assertThat(invoiceBO.generateInvoiceId("CY9999"), CheckInvoiceId.checkInvoice("CMY09999"));
		assertThat(invoiceBO.generateInvoiceId("CY99999"), CheckInvoiceId.checkInvoice("CMY99999"));


	}
	
	@Before
	public void destroy() {
		invoiceBO=null;
	}
}

class CheckInvoiceId {
	public static org.hamcrest.Matcher<String> checkInvoice(final String expectedinvoice){
		return new TypeSafeMatcher<String>(){

			@Override
			public void describeTo(Description arg0) {
//				arg0.appendText("Invalid Format");
				throw new AssertionError("Invalid Format");
			}

			@Override
			protected boolean matchesSafely(final String arg0) {
				// TODO Auto-generated method stub
				return arg0.equalsIgnoreCase(expectedinvoice);
			}
		};
	}
}
	

//class CheckInvoiceId extends TypeSafeMatcher<String>{
//	String invoice;
//	
//	CheckInvoiceId(String invoice){
//		this.invoice=invoice;
//	}
//	@Override
//	public void describeTo(Description arg0) {
//		arg0.appendText("Invalid Format");
//		
//	}
//
//	@Override
//	protected boolean matchesSafely(String arg0) {
//		// TODO Auto-generated method stub
//		return arg0.equalsIgnoreCase(invoice);
//	}
//	//fill the code
//}