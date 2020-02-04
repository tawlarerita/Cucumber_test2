Feature: Login Functionality

Scenario: Login with valid credentials
	Given Navigate to Home page
	When user enters username and password
	Then user login successfully
	
	Scenario: The one where user picks different product thought search functionality  
 	When Linda searches below product in the search box:
 	|Head     |
 	|TravelBag|
 	Then product should be added in the cart