package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.After;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^I am on the registration page of 'Gaati Shipping' company$")
	public void setUp() {
		String exePath = "C:\\AsosDev\\OneDrive - ASOS.com Ltd\\java-workspace-1\\Cucumber-CC-1\\drivers\\geckodriver.exe";		
		System.setProperty("webdriver.gecko.driver", exePath);		
		driver = new FirefoxDriver();
		driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CustomerRegistration/Index");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}

	@When("^I fill my \"([^\"]*)\", (\\d+), \"([^\"]*)\", (\\d+), \"([^\"]*)\" in the form and click on Submit$")
	public void testCustomerRegistration(String arg1, int arg2, String arg3, int arg4, String arg5) {
	    
	   
	}

	@Then("^I should be registered successfully and the \"([^\"]*)\" should be displayed$")
	public void validateResult(String arg1) {
	    // Express the Regexp above with the code you wish you had
	   
	}
	
	@After
	public void tearDown() {
		 driver.close( );
	}

}
