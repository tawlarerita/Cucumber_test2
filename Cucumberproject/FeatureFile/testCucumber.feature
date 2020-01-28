Feature: Login Functionality
@data-driven
Scenario: Login with valid credentials
	Given Navigate to Home page
	When user enters username and password
	Then user login successfully

@data-driven
Scenario: The one where user picks different product thought search functionality  
 	When Larry searches below product in the search box:
     |Head|
     |Travel|
     |Laptop|
 	Then product should be added in the cart if available
 	@user-specific
 	Scenario Outline: Login with valid credentials
	Given Navigate to Home page
	When user enters "<username>" and "<password>"
	Then user login successfully
	Examples:
	|username |password   |
	|lalitha  |Password123|
	|ABC      |XYZ        |
 	