package Training4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepd {
	WebDriver driver;
	@Given("Open the browser")
	public void open_the_browser() {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		
	}

	@And("Enter the URL")
	public void enter_the_URL() {
	    
		driver.get("https:\\www.google.com");
	}

	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
	    
		
	}

}
