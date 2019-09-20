Feature: Login

	Scenario Outline: Success Login
		Given Enter "<name>" in the Username field
		And Enter "<Password>" in the Password field
		When Click on Login button
		Then Home page is displayed
		Examples:
			| name   | Password  |
			|sam     | abcd      |
			|ram     | aqver     |