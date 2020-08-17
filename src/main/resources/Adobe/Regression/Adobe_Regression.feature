Feature: Automated End2End Tests 

	Description: The purpose of this feature is to test End 2 End Integration.
		
	Scenario: PDP url launch
	Given pdp url is up
	When pdp url is launched
	When user clicks on add to cart button
	
	Scenario: Sign up url launch
	Given sign up url is up
	When sign up url is launched 