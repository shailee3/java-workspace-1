package stepDefinition;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class ShippingDefinition {
	
WebDriver driver;

@Before
public void setUp() {
	 String exePath = "C:\\AsosDev\\OneDrive - ASOS.com Ltd\\java-workspace-1\\Cucumber-LC-1-Hooks\\drivers\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", exePath);
	 driver=new ChromeDriver();
}

@Given("^I am on Datex Shipping company portal$")
public void loadUrl() throws Throwable {
    driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CostCalculation/");
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
}

@When("^I enter (\\d+) and select \"([^\"]*)\" mode and click Calculate button$")
public void testCalculateCost(int weight, String transportMode) throws Throwable {
	driver.findElement(By.id("weight")).sendKeys(Integer.toString(weight));
    driver.findElement(By.id(transportMode)).click();
    driver.findElement(By.id("calculate")).click();
}

@Then("^I should be able to see the shipping cost \"([^\"]*)\"$")
public void validateResult(String message) throws Throwable {
    String result = driver.findElement(By.id("result")).getText();
    assertEquals(message, result);
}

@After
public void tearDown() {
	 driver.close( );
}
}
