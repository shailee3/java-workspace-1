import org.junit.*;

public class CompanyJunit {
	CompanyBO companybo;
	
	@Before
	public void createObjectForCompanyBO(){
		this.companybo= new CompanyBO();
	}
			
	@Test
	public void testInvalidDiscount() {
		String output1= this.companybo.hasDiscount(100, 500);
		Assert.assertEquals("Datex shipping offers no discount",output1);		
	
		String output2= this.companybo.hasDiscount(199, 599);
		Assert.assertEquals("Datex shipping offers no discount",output2);
		}
	
	@Test
	public void testValidDiscount() {
		String output= this.companybo.hasDiscount(80, 501);
		Assert.assertEquals("Datex shipping offers discount",output);
	}
	
}
