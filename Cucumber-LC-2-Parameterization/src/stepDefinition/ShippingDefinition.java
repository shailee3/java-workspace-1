package stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.annotation.After;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class ShippingDefinition {
	
	WebDriver driver;

	@Given("^I open the shipping detail application URL$")
	public void setUp() {
		//String exePath = "C:\\AsosDev\\OneDrive - ASOS.com Ltd\\java-workspace-1\\Cucumber-LC-2-Parameterization\\drivers\\chromedriver.exe";
		 //System.setProperty("webdriver.chrome.driver", exePath)
		//driver=new ChromeDriver();
		String exePath = "C:\\AsosDev\\OneDrive - ASOS.com Ltd\\java-workspace-1\\Cucumber-LC-2-Parameterization\\drivers\\geckodriver.exe";
		//System.setProperty("webdriver.firefox.marionette", "false");
		System.setProperty("webdriver.gecko.driver", exePath);
		//DesiredCapabilities capa = DesiredCapabilities.firefox();
		//capa.setCapability("marionette", false);
		driver = new FirefoxDriver();
		driver.get("http://apps.qa2qe.cognizant.e-box.co.in/shippingDetails/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
	}

	@Given("^I am able to see 'Shipping Details' been displayed as header$")
	public void I_am_able_to_see_Shipping_Details_been_displayed_as_header() {
	   String header = driver.findElement(By.xpath("/html/body/div[1]/center/h2")).getText();	   
	   assertEquals("Shipping Details", header); 
	}

	@When("^I click on the (\\d+) link$")
	public void testShippingDetails(int shipmentId) 
	{
		if(shipmentId == 6543217)
	   {
		   driver.findElement(By.linkText("6543217")).click();
	   }
	}

	@Then("^I should be able to see correpsonding shipping details with \"([^\"]*)\"$")
	public void validateResult(String name) {
	    String result = driver.findElement(By.xpath("//*[@id=\"result\"]/table/tbody/tr[2]/td[1]")).getText();
	    assertEquals(name,result);
	}
	
	@After
	public void tearDwon() {
		driver.close();
	}
	
	
}
