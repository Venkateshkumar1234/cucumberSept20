Feature: Login

	Scenario: Success Login
		Given Enter "sam" and "abcd12"
		When Click on Login button
		Then Home page is displayed
		
		
	Scenario: Failure Login
		Given Enter credentials
		When Click on Login button
		Then Home page is not displayed	
		
		
