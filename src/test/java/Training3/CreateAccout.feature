Feature: CreateAccount

  Scenario: Successful Account Creation
    Given I want to create a account
    When I enter my data
    	|name   | Password |
    	|sam    | zxcv	   |
    	|john   | hhgj     |
    	|fahad  | fazil    |
    Then I verify the account