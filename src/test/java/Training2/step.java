package Training2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step {
	@Given("Enter {string} in the Username field")
	public void enter_in_the_Username_field(String cvb) {
	   System.out.println(cvb);
		
	}

	@Given("Enter {string} in the Password field")
	public void enter_in_the_Password_field(String string) {
		System.out.println(string);
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
	    
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    
	}


}
