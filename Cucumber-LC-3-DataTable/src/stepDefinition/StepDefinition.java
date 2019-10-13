package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.After;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;
import junit.framework.Assert;

public class StepDefinition {

	WebDriver driver;
	
	@Given("^user is on landing page$")
	public void setUp() {
		String exePath = "D:\\Source\\java-workspace-1\\Cucumber-LC-3-DataTable\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
	    driver = new FirefoxDriver();  
	    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
	    driver.get("http://apps.qa2qe.cognizant.e-box.co.in/Handling_Reg_Expression/");		
	}

	@When("^user enter his name$")
	public void testUserDetails(DataTable dataTable) {
		List<List<String>> data = dataTable.raw();
	    String value = data.get(1).get(0);
	    driver.findElement(By.id("userId")).sendKeys(value);
	    driver.findElement(By.id("track")).click();
	    driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	}

	@Then("^The name,shipmentid,phone number,e-mailId should be displayed.$")
	public void validateResult() {
		WebElement result = driver.findElement(By.id("result"));
		Assert.assertTrue(result.isDisplayed());
		System.out.println(result.getText());
		}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
}
