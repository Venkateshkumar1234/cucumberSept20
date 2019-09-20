package Training1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	
	@Given("Enter {string} and {string}")
	public void Credentials(String x, String y) {
	    
		System.out.println(x+ " " + y);
	}

	@And("Enter password in the password field")
	public void enter_password_in_the_password_field() {
	   
		System.out.println("Password is Entered");
		
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
	   
		System.out.println("Login button is clicked");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	  
		System.out.println("Home Page is Displayed");
	}

	@Given("Enter credentials")
	public void enter_credentials() {
		System.out.println("Credentials Entered");
	}

	@Then("Home page is not displayed")
	public void home_page_is_not_displayed() {
		System.out.println("Home Page is not Displayed");
	}

}
