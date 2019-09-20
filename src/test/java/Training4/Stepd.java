package Training4;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepd {
	WebDriver driver;
	@Given("Open the browser")
	public void open_the_browser() {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a08019dirp_c2x.08.05\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@And("Enter the URL")
	public void enter_the_URL() {
		//driver.wait(100);
	    
		driver.get("https:\\www.google.com");
	}

	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
		 assertEquals("Googles",driver.getTitle());
		 driver.close();
	}


}
