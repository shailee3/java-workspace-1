package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps {
	WebDriver driver;
	
	@Given("^I have launched Google on my browser$")
	public void i_have_launched_Google_on_my_browser() throws Throwable {
		 String exePath = "C:\\Source\\java-workspace-1\\CucumberTest2\\drivers\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);		
	}

	@When("^I click on 'I'm Feeling Lucky' button$")
	public void i_click_on_I_m_Feeling_Lucky_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[2]")).click();	    
	}

	@Then("^Google doodles page should open$")
	public void google_doodles_page_should_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"logo\"]")).isDisplayed();
	}

	@Then("^Link for 'Sufia Kamal's (\\d+)th Birthday' should be present$")
	public void link_for_Sufia_Kamal_s_th_Birthday_should_be_present(int arg1) throws Throwable {
	   boolean flagStatus; 
		
	   flagStatus= driver.findElement(By.xpath("//*[@id=\"latest-title\"]")).isDisplayed();
	   assertTrue(flagStatus);
	   driver.quit();
	}	
}
